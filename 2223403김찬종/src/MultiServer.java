import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;
public class MultiServer {
	HashMap<String,String> detect;
    HashMap<String,DataOutputStream> clientMap;
    HashMap<String,String> clientMapp;
    HashMap<String,String> cardinfor;
    HashMap<String,String> client;
    HashMap<String,String> finder;
    ServerSocket serverSocket = null;
    Socket socket = null;
	ArrayList<Object> Aa;//�޷� ī�� ��
	ArrayList<String> hit;
	ArrayList<String> doubledown;
	
	String[] card=new String[] {"A","10","J","Q","K","��2","��2","��2","��2","��3","��3","��3","��3"
            ,"��4","��4","��4","��4","��5","��5","��5","��5","��6","��6","��6","��6"
            ,"��7","��7","��7","��7","��8","��8","��8","��8","��9","��9","��9","��9"};// ���ӿ��� �ÿ�� ī��
	
    //������
    public MultiServer(){
        clientMap = new HashMap<String,DataOutputStream>(); //Ŭ���̾�Ʈ�� ��½�Ʈ���� ������ �ؽ��� ����.
        Collections.synchronizedMap(clientMap); //�ؽ��� ����ȭ ����.
        clientMapp = new HashMap<String,String>(); //Ŭ���̾�Ʈ�� ��½�Ʈ���� ������ �ؽ��� ����.
        Collections.synchronizedMap(clientMapp); //�ؽ��� ����ȭ ����.
        cardinfor = new HashMap<String,String>(); //Ŭ���̾�Ʈ�� ��½�Ʈ���� ������ �ؽ��� ����.
        Collections.synchronizedMap(cardinfor); //�ؽ��� ����ȭ ����.
        client = new HashMap<String,String>(); //Ŭ���̾�Ʈ�� ��½�Ʈ���� ������ �ؽ��� ����.
        Collections.synchronizedMap(client); //�ؽ��� ����ȭ ����.
        finder = new HashMap<String,String>(); 
        Collections.synchronizedMap(finder);
        detect = new HashMap<String,String>(); 
        Collections.synchronizedMap(detect);
        Aa=new ArrayList<Object>();
        Collections.synchronizedCollection(Aa);
        hit=new ArrayList<String>();
        Collections.synchronizedCollection(hit);
        doubledown=new ArrayList<String>();
        Collections.synchronizedCollection(doubledown);
        
    }
    public String Aiblackjack() {//name ����
		if(Aa.get(0)=="A" && Aa.get(1)=="10") {
			return "���� �Դϴ�.";
		}
		else if (Aa.get(0)=="A" && Aa.get(1)=="J")  {
			return "���� �Դϴ�.";
		}
		else if (Aa.get(0)=="A" && Aa.get(1)=="Q")  {
			return "���� �Դϴ�.";
		}
		else if (Aa.get(0)=="A" && Aa.get(1)=="K")  {
			return "���� �Դϴ�.";
		}
		else if (Aa.get(0)=="10" && Aa.get(1)=="A")  {
			return "���� �Դϴ�.";
		}
		else if (Aa.get(0)=="J" && Aa.get(1)=="A")  {
			return "���� �Դϴ�.";
		}
		else if (Aa.get(0)=="Q" && Aa.get(1)=="A")  {
			return "���� �Դϴ�.";
		}
		else if (Aa.get(0)=="K" && Aa.get(1)=="A")  {
			return "���� �Դϴ�.";
		}
		else {
			return " ";
		}
	}
    
    public void init(){
    	
        try{
            serverSocket = new ServerSocket(8081); //8081��Ʈ�� �������� ��ü����.
            System.out.println("������ ���۵Ǿ����ϴ�.");
           
            while(true){ //������ ����Ǵ� ���� Ŭ���̾�Ʈ���� ������ ��ٸ�.
                socket = serverSocket.accept(); //Ŭ���̾�Ʈ�� ������ ��ٸ��ٰ� ������ �Ǹ� Socket��ü�� ����.
                System.out.println(socket.getInetAddress()+":"+socket.getPort()); //Ŭ���̾�Ʈ ���� (ip, ��Ʈ) ���
               
                Thread msr = new MultiServerRec(socket); //������ ����.
                msr.start(); //������ �õ�.
            }      
           
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    //���ӵ� ��� Ŭ���̾�Ʈ�鿡�� �޽����� ����.
    public void sendAllMsg(String msg){
    	
        //��½�Ʈ���� ���������� ���ͼ� �ش� �޽����� ����Ѵ�.
        Iterator it = clientMap.keySet().iterator();
       
        while(it.hasNext()){
            try{
                DataOutputStream it_out = (DataOutputStream) clientMap.get(it.next());
                it_out.writeUTF(msg);
            }catch(Exception e){
                System.out.println("����:"+e);
            }
        }
    }
    //���ӵ� ��������Ʈ  ���ڿ��� ��ȯ
    public String showUserList(String name){
       
        StringBuilder output = new StringBuilder("==�����ڸ��==\r\n");
        Iterator it = clientMap.keySet().iterator(); //�ؽ��ʿ� ��ϵ� ������̸��� ������.
       
        while(it.hasNext()){ //�ݺ��ϸ鼭 ������̸��� StringBuilder�� �߰�
            try{
                String key= (String) it.next();
                              
                if(key.equals(name)){
                    key += " (*) ";
                }              
                output.append(key+"\r\n");
               
            }catch(Exception e){
                System.out.println("����:"+e);
            }
        }
        output.append("=="+clientMap.size()+"�� ������==\r\n");
        return output.toString();
    }
    public String showUserList(){
        return showUserList("");
    }
    public String showUsercard(String name){
    	StringBuilder output = new StringBuilder("==�����ڸ��==\r\n");
        Iterator it = cardinfor.keySet().iterator(); //�ؽ��ʿ� ��ϵ� ������̸��� ������.
        while(it.hasNext()){ //�ݺ��ϸ鼭 ������̸��� StringBuilder�� �߰�
            try{
                String key= (String) it.next();    
                output.append(key+"�� ī����"+cardinfor.get(key)+"\r\n");
            }catch(Exception e){
                System.out.println("����:"+e);
            }
        }
    	output.append("=="+clientMap.size()+"�� ������==\r\n");
		return output.toString();
    }
    public String showUsercard(){
        return showUsercard("");
    }
    public String showUserinfor(String name){
    	StringBuilder output = new StringBuilder("==�����ڸ��==\r\n");
    	Iterator it = clientMapp.keySet().iterator(); //�ؽ��ʿ� ��ϵ� ������̸��� ������
    	while(it.hasNext()){ //�ݺ��ϸ鼭 ������̸��� StringBuilder�� �߰�
            try{
                String key= (String) it.next();    
                output.append(key+clientMapp.get(key)+"��"+"\r\n");
            }catch(Exception e){
                System.out.println("����:"+e);
            }
        }//while---------
    	output.append("=="+clientMap.size()+"�� ������==\r\n");
		return output.toString();
    }
    public String showUserinfor(){
        return showUserinfor("");
    }
    //main�޼���
    
    public static void main(String[] args) {
		MultiServer ms = new MultiServer(); //������ü ����.
        ms.init();//����.
        
        
	}
    // Ŭ���̾�Ʈ�κ��� �о�� �޽����� �ٸ� Ŭ���̾�Ʈ(socket)�� ������ ������ �ϴ� �޼���
    class MultiServerRec extends Thread {
        Socket socket;
        DataInputStream in;
        DataOutputStream out;
        ArrayList<Object> b;//����� ī�� ��
        score cc=new score();
        int ss;
        //������.
        public String nameblackjack()  {// ����� ���� ����
    		if(b.get(0)=="A" && b.get(1)=="10") {
    			return "���� �Դϴ�.";
    		}
    		else if (b.get(0)=="A" && b.get(1)=="J")  {
    			return "���� �Դϴ�.";
    		}
    		else if (b.get(0)=="A" && b.get(1)=="Q")  {
    			return "���� �Դϴ�.";
    		}
    		else if (b.get(0)=="A" && b.get(1)=="K")  {
    			return "���� �Դϴ�.";
    		}
    		else if (b.get(0)=="10" && b.get(1)=="A")  {
    			return "���� �Դϴ�.";
    		}
    		else if (b.get(0)=="J" && b.get(1)=="A")  {
    			return "���� �Դϴ�.";
    		}
    		else if (b.get(0)=="Q" && b.get(1)=="A")  {
    			return "���� �Դϴ�.";
    		}
    		else if (b.get(0)=="K" && b.get(1)=="A")  {
    			return "���� �Դϴ�.";
    		}
    		else {
    			return " ";
    		}
    	}
        public String hidden() { 
        	 ArrayList<Object>Ab=new ArrayList<Object>();
            Collections.synchronizedCollection(Ab);
        	for(int i=0; i<Aa.size(); i++) {//ù ���� �ϳ��� ������ ���̱�
    			if(i==0)
    				Ab.add("?");
    			else
    			    Ab.add(Aa.get(i));
			}
        	return Arrays.deepToString(Ab.toArray());
        }
        
        public synchronized void exit() {//����ȭ,wait�� Ŭ���̾�Ʈ â �ݱ�
        	try {
        		wait(5000);//5�ʴ��
				out.writeUTF("����");//Ŭ���̾�Ʈȭ�� close
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
        }
        public synchronized void powerexit() {//����ȭ,wait�� Ŭ���̾�Ʈ â ���� �ݱ�
        	try {
        		wait(1000);//1�ʴ��
				out.writeUTF("����");//Ŭ���̾�Ʈȭ�� close
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
        }
		public MultiServerRec(Socket socket){
        	b=new ArrayList<Object>();
            Collections.synchronizedCollection(b);
            this.socket = socket;
            try{
                //Socket���κ��� �Է½�Ʈ���� ��´�.
                in = new DataInputStream(socket.getInputStream());
                //Socket���κ��� ��½�Ʈ���� ��´�.
                out = new DataOutputStream(socket.getOutputStream());
            }catch(Exception e){
                System.out.println("����:"+e);
            }
        }//������ ------------
        @Override
        public void run(){ //�����带 ����ϱ� ���ؼ� run()�޼��� ������
            String name=""; //Ŭ���̾�Ʈ�κ��� ���� �̸��� ������ ����.
            String firt="";
            String money="";
            String ip="";
            String ff="";
            cc.b=b;
            cc.Aa=Aa;
            cc.card=card;
                try{
            		for(int i=0; i<1;i++) {
            			out.writeUTF("�̸��� �Է����ּ���>>");//Ŭ���̾�Ʈ�� �����ϸ� �޽��� ���.  
            			/*name = in.readUTF();//Ŭ���̾�Ʈ���� ó������ ������ �޽����� Ŭ���̾�Ʈ�� ����� �̸��̴�.*/
            			firt=in.readUTF();
            			if(clientMapp.containsKey(firt)) {
            				out.writeUTF("�����ϴ� �г��� �Դϴ�.");
            				i-=1;
            			}
            			else if(clientMap.size()>=5) {
            				out.writeUTF("����(5����) ������ �Դϴ�.");
            				powerexit();
            			}
            			else if(detect.size()>0) {
            				out.writeUTF("������ �Դϴ�~.");
            				powerexit();
            			}
            			else {
            				name=firt;
                        	for(int k=0; k<1;k++) {
                        		try {
                        		out.writeUTF("���� �ݾ� �� �Է����ּ���>>");  
                                money=in.readUTF();
                                BigInteger big=new BigInteger(money);
            			        BigInteger val=new BigInteger("0");
            			        int choice= big.compareTo(val);
            			        if(choice==-1) { //big<val �϶� 
            			        	out.writeUTF("���ñݾ��� �ٽ� �Է����ּ���>>");
            					    k-=1;
            			        }
            			        else if(choice==1){// big>val �϶� 
            			        	out.writeUTF(name+"�� ���� �ݾ� >>"+money); 
            			        	clientMapp.put(name, money);
                                    for(int j=0;j<1; j++) {
                                    	out.writeUTF("ip�ּҸ� �Է����ּ���>>");  //Ŭ���̾�Ʈ�� �����ϸ� �޽��� ���.                    
                                        ip = in.readUTF();
                                        if(ip.equals("127.0.0.1")) {
                                        	out.writeUTF(name+"���� �����ϼ̽��ϴ�."+"�����<"+name+"> �����");
                                        	out.writeUTF("���Ű Ȯ��--> /help �Է�");
                                        }
                                        else {
                                        	out.writeUTF("ip�ּҸ� �ٽ� �Է��Ͻÿ�>>");
                                        	j-=1;
                                        }
                                    }
            			        }
            			        else if(choice==0) {// big=val �϶� ���Է� �õ�
            			        	out.writeUTF("���ñݾ��� �ٽ� �Է����ּ���>>");
            					    k-=1;
            			        }
                        		}
                        		catch(NumberFormatException e) {
                        			out.writeUTF("���ñݾ��� �ٽ� �Է����ּ���>>");
            					    k-=1;
                                }
                        	}
                        }
            		}
            		
                sendAllMsg(name + "���� �����ϼ̽��ϴ�.");
                //���� ��ü�� �������ִ� ������ �����ϰ� �ٸ� ����(Ŭ���̾�Ʈ)�鿡�� ������ �˸�.
                clientMap.put(name, out); //�ؽ��ʿ� Ű�� name���� ��½�Ʈ�� ��ü�� ����.
           
                while(in!=null){//�Է½�Ʈ���� null�� �ƴϸ� �ݺ�.
                    String msg = in.readUTF(); //�Է½�Ʈ���� ���� �о�� ���ڿ��� msg�� �Ҵ�.
                    if(msg.startsWith("/")){                       
                        if(msg.trim().equals("/������")){          
                            out.writeUTF(showUserList(name)); //������ ���                       
                        }
                        else if(msg.trim().equals("/����")) {
                        	out.writeUTF(showUserinfor(name)); //������ ��� 
                        }
                        else if(msg.trim().equals("/��Ȯ��")) {
                        	out.writeUTF(showUsercard(name)); //������ ��� 
                        }
                        else if(msg.trim().equals("/����")) {
                        	exit(); //Ŭ���̾�Ʈ ���� ����
                        }
                        else if(msg.trim().equals("/help")) {//���Ű ���� 
                        	out.writeUTF("������ Ȯ��->/������");
                        	out.writeUTF("������ ���ñݾ�->/����");
                        	out.writeUTF("������ �� Ȯ��->/��Ȯ��");
                        	out.writeUTF("��������->/����");
                        	out.writeUTF("���ӽ���->/����(������ ���ΰ� �Է��ؾ� ����)");
                        	out.writeUTF("���� �� Ȯ��->/������Ȯ��");
                        	out.writeUTF("hit->/hit");
                        	out.writeUTF("stand->/stand");
                        	out.writeUTF("doubledown->/doubledown");
                        }
                        else if(msg.trim().equals("/����")) {
                        	if(client.containsKey(name)) {
                        		out.writeUTF("����� ����");
                        	}
                        	else {
	                        	client.put(name,"����");
	                        	if(client.size()==clientMap.size()) {
	                        		detect.put("okay", "���ǿϷ�");//�����ڰ� /���� �̶�� ���δ������� ���߿� ���ӿ� ���� ���ϰ� �ϱ� ����
	                        		for(int k=0; k<2; k++) {
	                        			int a= (int)(Math.random()*36);
	                        			Aa.add(card[a]);//���� ī�� 2�� ����
	                        		}
	                        		 sendAllMsg("[ "+"����"+" ] "+hidden());
	                        	}
	                        	else {
	                        		sendAllMsg("[ "+"����"+" ] "+"��ΰ� /���� �� ������ ���� ���۵�");
	                        	}
                        	}
                        }
                        else if(msg.trim().equals("/������Ȯ��")) {
                        	if(client.containsKey(name)) {
                        		if(finder.containsKey(name)) {
                        			out.writeUTF("����� ����");
                        		}
                        		else {
                        			finder.put(name,"������Ȯ��");
    	                            for(int k=0; k<2; k++) {//�����ī�� 2�� ����
    	                    			int a= (int)(Math.random()*36);
    	                    			b.add(card[a]);
    	                    		}
    	                        	out.writeUTF("[ "+name+" ] "+Arrays.deepToString(b.toArray()));
    	                        	cardinfor.put(name,Arrays.deepToString(b.toArray()));
    	                        	String num=clientMapp.get(name);
    	                        	BigInteger big=new BigInteger(num);
    	                        	if(nameblackjack()=="���� �Դϴ�." && Aiblackjack()=="���� �Դϴ�."){
    	                        		out.writeUTF("both "+name+" and ���� �Ѵ� ���� ���º� �Դϴ�.");
    	                        		out.writeUTF(name+"�����ݾ�"+big);
    	                        		out.writeUTF("���� �����ݾ�"+big);
    	                        		out.writeUTF("�����������մϴ�.");
    		                        	exit();
    	                    		}
    	                        	else if(nameblackjack()=="���� �Դϴ�." ) {
    	                    			BigInteger big2=new BigInteger("3");
    	                            	BigInteger big3=big.multiply(big2);
    	                            	out.writeUTF(name+" �� �����̱���~!!!");
    	                            	out.writeUTF(name+"�����ݾ�"+big3);
    	                            	out.writeUTF("���� �սǱݾ�"+big);
    	                            	out.writeUTF("�����������մϴ�.");
    		                        	exit();
    	                    		}
    	                    		else if(Aiblackjack()=="���� �Դϴ�.") {
    	                    			BigInteger big2=new BigInteger("3");
    	                            	BigInteger big3=big.multiply(big2);
    	                            	out.writeUTF(name+" �� �������� �����̾ �����ϴ�.~!!!");
    	                            	out.writeUTF(name+"�սǱݾ�"+big);
    	                            	out.writeUTF("���� �����ݾ�"+big3);
    	                            	out.writeUTF("�����������մϴ�.");
    		                        	exit();
    	                    		}
                        		}
                        		
                        	}
                        	else {
                        		out.writeUTF("/���� �� ���� ��������");
                        	}
                        }
                        else if(msg.trim().equals("/hit")) {
                        	if(finder.containsKey(name)) {
                        		if(doubledown.size()==1) {
                            		out.writeUTF("[ "+name+" ] "+"�� ù�� doubledown �ؼ� ī�带 �� �̽��ϴ�..");
                            		if(cc.B()>=17) {//������ ���� 17�̻��̸� ī�� ���� ��ο� �� ��.
                            			out.writeUTF("[ "+"����"+" ] "+hidden());
                            			out.writeUTF("[ "+name+" ] "+Arrays.deepToString(b.toArray()));
                            		}
                            		else if(cc.B()<17){
                            			int a= (int)(Math.random()*36);
                            			Aa.add(card[a]);
                            			out.writeUTF("[ "+"����"+" ] "+hidden());
                            			out.writeUTF("[ "+name+" ] "+Arrays.deepToString(b.toArray()));
                            		}
                            	}
                            	else {
                            		if(cc.B()>=17) {//������ ���� 17�̻��̸� ī�� ���� ��ο� �� ��.
                            			int a= (int)(Math.random()*36);
                            			b.add(card[a]);
                            			out.writeUTF("[ "+"����"+" ] "+hidden());
                            			out.writeUTF("[ "+name+" ] "+Arrays.deepToString(b.toArray()));
                            			cardinfor.put(name,Arrays.deepToString(b.toArray()));
                            			hit.add("o");
                            		}
                            		else if(cc.B()<17){
                            			int a= (int)(Math.random()*36);
                            			b.add(card[a]);
                            			int f= (int)(Math.random()*36);
                            			Aa.add(card[a]);
                            			out.writeUTF("[ "+"����"+" ] "+hidden());
                            			out.writeUTF("[ "+name+" ] "+Arrays.deepToString(b.toArray()));
                            			cardinfor.put(name,Arrays.deepToString(b.toArray()));
                            			hit.add("o");
                            		}
                            	}
                        	}
                        	else {
                        		out.writeUTF("/������Ȯ�� ���� �����ÿ�");            	
    						}
                        	
                        }
                        else if(msg.trim().equals("/doubledown")) {
                        	if(finder.containsKey(name)) {
                        		if(hit.size()>=1) {
                        		out.writeUTF("[ "+name+" ] "+"�� ù�� hit�ؼ� ���մϴ�.");
                        		}
                        		else {
                        			if(doubledown.size()==1) {
                        				out.writeUTF("[ "+name+" ] "+"�� ù�� doubledown �ؼ� ���մϴ�.");
                        			}	
                        			else if(doubledown.size()==0){
                        				doubledown.add("o");
                        				String num=clientMapp.get(name);
		                    			BigInteger big=new BigInteger(num);
		                    			BigInteger big2=new BigInteger("2");
		                    			BigInteger big3=big.multiply(big2);
		                    			out.writeUTF(name+"��"+big+" ��ŭ �� �����մϴ�.");
		                    			out.writeUTF(name+" �� ���� �ݾ�>>"+big3);
		                    			out.writeUTF("������ �߰� ���� �ݾ���"+big+"�Դϴ�.");
		                    			out.writeUTF("������ �� ���� �ݾ�>>"+big3);
		                    			big=big.multiply(big2);
		                                String text=String.valueOf(big);
		                    			clientMapp.put(name,text);
		                    			if(cc.B()>=17) {//������ ���� 17�̻��̸� ī�� ���� ��ο� �� ��.
		                    				int a= (int)(Math.random()*36);
		                    				b.add(card[a]);
		                    				sendAllMsg("[ "+"����"+" ] "+hidden());
		                    				out.writeUTF("[ "+name+" ] "+Arrays.deepToString(b.toArray()));
		                    				out.writeUTF("[ "+name+" ] "+Arrays.deepToString(b.toArray()));
		                    				cardinfor.put(name,Arrays.deepToString(b.toArray())); 
		                    			}
		                    			else if(cc.B()<17){
		                    				int a= (int)(Math.random()*36);
		                    				b.add(card[a]);
		                    				int f= (int)(Math.random()*36);
		                    				Aa.add(card[a]);
		                    				sendAllMsg("[ "+"����"+" ] "+hidden());
		                    				out.writeUTF("[ "+name+" ] "+Arrays.deepToString(b.toArray()));
		                    				cardinfor.put(name,Arrays.deepToString(b.toArray()));
		                    				
		                    			}
                        			}
                        		}
                        	}
                        	else {
                        		out.writeUTF("/������Ȯ�� ���� �����ÿ�");
                        	}
                        	
            		}
                        else if(msg.trim().equals("/stand")) {
                        	if(finder.containsKey(name)) {
                        		if(b.contains("A")) {
                            		int c;
                            		for(int i=0; i<b.size(); i++) {
                            			if(b.get(i)=="A") {
                            				out.writeUTF(i+"��° ���� ���� 1�Ǵ� 11�Է��Ͻÿ�");
                            				String str=in.readUTF();
                            				if(str.equals("1")) {
                            					c = Integer.parseInt(str);
                            					out.writeUTF(i+"��° ���� ���� 1��");
                            					cc.ch=c;
                            				}
                            				else if(str.equals("11")) {
                            					c= Integer.parseInt(str);
                            					out.writeUTF(i+"��° ���� ���� 11��");
                            					cc.ch=c;
                            				}
                        				    else {
                        				    	out.writeUTF("�ٽ� �Է��Ͻÿ�");
                        				    	i-=1;
                        					}
                            			}
                            		}
                            	}
    		                    	if(cc.n()>21) {//����� ī�� �� ���� 21�̻�� ����Ʈ
    		                    		
    		                    		BigInteger big2=new BigInteger("2");
    		                    		String num=clientMapp.get(name);
    		                			BigInteger big=new BigInteger(num);
    		                        	BigInteger big3=big.multiply(big2);
    		                        	out.writeUTF(name+" �� ����Ʈ �Դϴ�.");
    		                        	out.writeUTF(name+"�սǱݾ�"+big);
    		                        	out.writeUTF("���� �����ݾ�"+big3);
    		                        	out.writeUTF("�����������մϴ�.");
    		                        	exit();
    		        				 }
    	        				 else if(cc.n()==21) {//����� ī�� �� ���� ���� ���� ���� 21�̸� �¸�
    	        				    
    	        					String num=clientMapp.get(name);
    	                 			BigInteger big=new BigInteger(num);
    	        					BigInteger big2=new BigInteger("2");
    	        			        BigInteger big3=big.multiply(big2);
    	        			        out.writeUTF(name+" �� ����21 �¸� �Դϴ�.");
    	        			        out.writeUTF(name+"�����ݾ�"+big3);
    	        			        out.writeUTF("���� �սǱݾ�"+big);
    	        			        out.writeUTF("�����������մϴ�.");
    	        			        exit();
    	        			      
    	        				}
    	        				 else if(cc.n()==cc.B()) {// ī�� �� ���� �Ȱ����� ���º�
    	        					
    	        					String num=clientMapp.get(name);
    	                 			BigInteger big=new BigInteger(num);
    	                 			out.writeUTF("���º� �Դϴ�.");
    	                 			out.writeUTF(name+"�����ݾ�"+big);
    	                 			out.writeUTF("���� �����ݾ�"+big);
    	                 			out.writeUTF("�����������մϴ�.");
    	                 			exit();
    	        				}
    	        			
    	        				 else if(cc.n()<cc.B()) {//������ ī�� �� ���� ����� ī�� �� �� ���� ũ�� name �й�, ���� �¸�
    	        				       String num=clientMapp.get(name);
    	               			       BigInteger big=new BigInteger(num);
    	        				       BigInteger big2=new BigInteger("2");
    	        		        	   BigInteger big3=big.multiply(big2);
    	        		        	   out.writeUTF(name+" < ���� �̹Ƿ� "+name+" �� �й� �Դϴ�.");
    	        		        	   out.writeUTF(name+"�սǱݾ�"+big);
    	        		        	   out.writeUTF("���� �����ݾ�"+big3);
    	        		        	   out.writeUTF("�����������մϴ�.");
    	        		        	   exit();
    	        					}
            					else if(cc.n()>cc.B()) {//������� ī�� �� ���� ���� ī�� �� �պ��� ũ�� ����� �¸� ���� �й�
    	        						String num=clientMapp.get(name);
    	                    			BigInteger big=new BigInteger(num);
    	        						BigInteger big2=new BigInteger("2");
    	        			        	BigInteger big3=big.multiply(big2);
    	        			        	out.writeUTF(name+" > ���� �̹Ƿ� "+name+" �� �¸� �Դϴ�.");
    	        			        	out.writeUTF(name+"�����ݾ�"+big3);
    	        			        	out.writeUTF("���� �սǱݾ�"+big);
    	        			        	out.writeUTF("�����������մϴ�.");
    	        			        	exit();
            					}
                        	}
                        	else {
                        		out.writeUTF("/������Ȯ�� ���� �����ÿ�");
                        	}
                        	
                        }
                    else{
                         out.writeUTF("�߸��� ��ɾ��Դϴ�.");
                       }
                    }else{
                        sendAllMsg("[ "+name+" ] "+msg); //���� ���Ͽ��� �о�¸޽����� �ؽ��ʿ� ����� ���
                        //��½�Ʈ������ ������. 
                    }
                }
            }catch(Exception e){
                System.out.println(e + "----> ");
            }finally{
                //���ܰ� �߻��Ҷ� ����. �ؽ��ʿ��� �ش� ������ ����.
                //���� �����ϰų� ������ java.net.SocketException: ���ܹ߻�
                clientMap.remove(name);
                clientMapp.remove(name);
                cardinfor.remove(name);
                if(name !="") {
                	sendAllMsg(name + "���� �����ϼ̽��ϴ�.");   
                	System.out.println("���� ������ ���� "+clientMap.size()+"�� �Դϴ�.");
                }  
                if(clientMap.size()==0) {
                	System.exit(0);//��������
                }
            }
        }
    }
}
