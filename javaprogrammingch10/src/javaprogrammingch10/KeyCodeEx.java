package javaprogrammingch10;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx {
	private JLabel la=new JLabel();
	
	public keyCodeEx() {
		setTitle("key Code ����:F1Ű:�ʷϻ�, % Ű �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocuse();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(keyEvent e) {
			Container contentPane=(Container).getSource();
			
			la.setText(KeyEvent.getKeyText(e.getKeyCode()+"Ű�� �ԷµǾ���");
			
			if(e.getKeyChar()=='%')
				contentPane.setBackground(Color.YELLOW);
			else if(e.getKeyCode()==keyEvent.VK_F1)
				contentPane.setBackground(Color.GREEN);
			
		}
	}
	public static void main(String [] args) {
		new KeyCodeEx();
	}

}
