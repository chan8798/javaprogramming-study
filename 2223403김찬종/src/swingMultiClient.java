import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class swingMultiClient extends JFrame implements ActionListener,Runnable{ 

    JTextArea ta;
    JTextField txtInput;
    DataInputStream in;
    DataOutputStream out;

    //�����ڿ��� �ʱ� UI����
    public swingMultiClient() {
    	
        ta=new JTextArea(); //�ؽ�Ʈ���� ���� (��ȭ��������ϴ¶�)
        txtInput=new JTextField(); //�ؽ�Ʈ�ʵ� ���� (��ȭ�����Է��ϴ¶�)
        //textArea�� ��ũ�� ��� Ȯ��. ��ũ�� ��Ģ�� ���ν�ũ�� ������ �ʰ�, ���δ� �׻��̰�
        JScrollPane sp = new JScrollPane(ta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS
        		                         ,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setAutoscrolls(true); //�ڵ� ��ũ�� ����.
        ta.setBackground(new Color(200,200,255)); //�ؽ�Ʈ���� ��漳��.
        ta.setLineWrap(true); //�ؽ�Ʈ���� �ڵ� �ٹٲ�.
        ta.setEditable(false); //��ȭ��� ���� �����ϰ� ��Ȱ��ȭ.
        txtInput.setText(" "); //�Է¶� ���߰�.
        setTitle("");
        add(sp,"Center"); //��ũ�� ����� Ȯ��� �ؽ�Ʈ���� frame , "Center" ������ �߰�.
        add(txtInput,"South"); //�Է¶��� frame�� South������ �߰�.
        setSize(400, 500); //frame(â) ũ�� ���� 400, ���� 500
        setVisible(true); //frame(â) ȭ�鿡 ���̰�
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x��ư �۵��ǰ�
        txtInput.requestFocus(); //���α׷����۽� �Է¶��� ��Ŀ���ֱ�
        txtInput.selectAll(); //���۽� �Է¶� ���� ��ü����, �ٷ� ����ڰ� �Է��Ҽ��ְ�
        txtInput.addActionListener(this); //�ؽ�Ʈ�Է¶��� �׼��� �������� �����ʸ� ����.
         //�׼��� �߻��ϸ�.actionPerformed() �޼��忡 ������ ������ ����

       //��Ʈ��ũ �ڵ�
        try{
            Socket socket = new Socket("localhost",8081);
            //�Է½�Ʈ��
            in = new DataInputStream(socket.getInputStream());         
            //��½�Ʈ��
            out = new DataOutputStream(socket.getOutputStream());
            ta.append("������ ���ӵǾ����ϴ�.\r\n");
        }catch(Exception e){
            System.out.println("����:"+e);
        }
       
        Thread thread = new Thread(this); //������ ����.
        thread.start(); //�õ�.  
    }
    public static void main(String[] args) {
        new swingMultiClient(); //Ŭ���̾�Ʈ ����.
        
    }
    @Override
    public void actionPerformed(ActionEvent e) { //���ͶǴ� ��ư�� Ŭ��������� ����Ǵ� �޼���
        if(e.getSource().equals(txtInput)){
            String msg = txtInput.getText(); //�Է��� ������ �����´�.       
            try {
                out.writeUTF(msg); //������ �޽��� ������
                txtInput.setText(""); //�Է¶� �ʱ�ȭ
            } catch (IOException ex) {
                System.out.println("����:"+ex);
            }
        }  
    }
    @Override
    public void run() {// run()�޼ҵ� ����
        try {
            String msg = in.readUTF();
            ta.append(msg + "\r\n");
            while (in != null) { // �Է½�Ʈ���� null�� �ƴϸ�..�ݺ�
                msg = in.readUTF();
                if(msg.equals("����")) {
                	System.exit(0);
                }ta.append(msg + "\n"); // ���â(textarea����)�� msg�߰�
            }
        } catch (SocketException e) {
            System.out.println("����:" + e);
            System.out.println("�������� ������ ������ ���������ϴ�.");
            return;
 
        } catch (Exception e) {
            System.out.println("����:" + e);
 
        }
    }
}