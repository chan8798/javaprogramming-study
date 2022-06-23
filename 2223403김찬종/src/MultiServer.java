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
	ArrayList<Object> Aa;//달러 카드 패
	ArrayList<String> hit;
	ArrayList<String> doubledown;
	
	String[] card=new String[] {"A","10","J","Q","K","♠2","♡2","◇2","♣2","♠3","♡3","◇3","♣3"
            ,"♠4","♡4","◇4","♣4","♠5","♡5","◇5","♣5","♠6","♡6","◇6","♣6"
            ,"♠7","♡7","◇7","♣7","♠8","♡8","◇8","♣8","♠9","♡9","◇9","♣9"};// 게임에서 시용될 카드
	
    //생성자
    public MultiServer(){
        clientMap = new HashMap<String,DataOutputStream>(); //클라이언트의 출력스트림을 저장할 해쉬맵 생성.
        Collections.synchronizedMap(clientMap); //해쉬맵 동기화 설정.
        clientMapp = new HashMap<String,String>(); //클라이언트의 출력스트림을 저장할 해쉬맵 생성.
        Collections.synchronizedMap(clientMapp); //해쉬맵 동기화 설정.
        cardinfor = new HashMap<String,String>(); //클라이언트의 출력스트림을 저장할 해쉬맵 생성.
        Collections.synchronizedMap(cardinfor); //해쉬맵 동기화 설정.
        client = new HashMap<String,String>(); //클라이언트의 출력스트림을 저장할 해쉬맵 생성.
        Collections.synchronizedMap(client); //해쉬맵 동기화 설정.
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
    public String Aiblackjack() {//name 블랙잭
		if(Aa.get(0)=="A" && Aa.get(1)=="10") {
			return "블랙잭 입니다.";
		}
		else if (Aa.get(0)=="A" && Aa.get(1)=="J")  {
			return "블랙잭 입니다.";
		}
		else if (Aa.get(0)=="A" && Aa.get(1)=="Q")  {
			return "블랙잭 입니다.";
		}
		else if (Aa.get(0)=="A" && Aa.get(1)=="K")  {
			return "블랙잭 입니다.";
		}
		else if (Aa.get(0)=="10" && Aa.get(1)=="A")  {
			return "블랙잭 입니다.";
		}
		else if (Aa.get(0)=="J" && Aa.get(1)=="A")  {
			return "블랙잭 입니다.";
		}
		else if (Aa.get(0)=="Q" && Aa.get(1)=="A")  {
			return "블랙잭 입니다.";
		}
		else if (Aa.get(0)=="K" && Aa.get(1)=="A")  {
			return "블랙잭 입니다.";
		}
		else {
			return " ";
		}
	}
    
    public void init(){
    	
        try{
            serverSocket = new ServerSocket(8081); //8081포트로 서버소켓 객체생성.
            System.out.println("서버가 시작되었습니다.");
           
            while(true){ //서버가 실행되는 동안 클라이언트들의 접속을 기다림.
                socket = serverSocket.accept(); //클라이언트의 접속을 기다리다가 접속이 되면 Socket객체를 생성.
                System.out.println(socket.getInetAddress()+":"+socket.getPort()); //클라이언트 정보 (ip, 포트) 출력
               
                Thread msr = new MultiServerRec(socket); //쓰레드 생성.
                msr.start(); //쓰레드 시동.
            }      
           
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    //접속된 모든 클라이언트들에게 메시지를 전달.
    public void sendAllMsg(String msg){
    	
        //출력스트림을 순차적으로 얻어와서 해당 메시지를 출력한다.
        Iterator it = clientMap.keySet().iterator();
       
        while(it.hasNext()){
            try{
                DataOutputStream it_out = (DataOutputStream) clientMap.get(it.next());
                it_out.writeUTF(msg);
            }catch(Exception e){
                System.out.println("예외:"+e);
            }
        }
    }
    //접속된 유저리스트  문자열로 반환
    public String showUserList(String name){
       
        StringBuilder output = new StringBuilder("==접속자목록==\r\n");
        Iterator it = clientMap.keySet().iterator(); //해쉬맵에 등록된 사용자이름을 가져옴.
       
        while(it.hasNext()){ //반복하면서 사용자이름을 StringBuilder에 추가
            try{
                String key= (String) it.next();
                              
                if(key.equals(name)){
                    key += " (*) ";
                }              
                output.append(key+"\r\n");
               
            }catch(Exception e){
                System.out.println("예외:"+e);
            }
        }
        output.append("=="+clientMap.size()+"명 접속중==\r\n");
        return output.toString();
    }
    public String showUserList(){
        return showUserList("");
    }
    public String showUsercard(String name){
    	StringBuilder output = new StringBuilder("==접속자목록==\r\n");
        Iterator it = cardinfor.keySet().iterator(); //해쉬맵에 등록된 사용자이름을 가져옴.
        while(it.hasNext()){ //반복하면서 사용자이름을 StringBuilder에 추가
            try{
                String key= (String) it.next();    
                output.append(key+"의 카드패"+cardinfor.get(key)+"\r\n");
            }catch(Exception e){
                System.out.println("예외:"+e);
            }
        }
    	output.append("=="+clientMap.size()+"명 접속중==\r\n");
		return output.toString();
    }
    public String showUsercard(){
        return showUsercard("");
    }
    public String showUserinfor(String name){
    	StringBuilder output = new StringBuilder("==접속자목록==\r\n");
    	Iterator it = clientMapp.keySet().iterator(); //해쉬맵에 등록된 사용자이름을 가져옴
    	while(it.hasNext()){ //반복하면서 사용자이름을 StringBuilder에 추가
            try{
                String key= (String) it.next();    
                output.append(key+clientMapp.get(key)+"원"+"\r\n");
            }catch(Exception e){
                System.out.println("예외:"+e);
            }
        }//while---------
    	output.append("=="+clientMap.size()+"명 접속중==\r\n");
		return output.toString();
    }
    public String showUserinfor(){
        return showUserinfor("");
    }
    //main메서드
    
    public static void main(String[] args) {
		MultiServer ms = new MultiServer(); //서버객체 생성.
        ms.init();//실행.
        
        
	}
    // 클라이언트로부터 읽어온 메시지를 다른 클라이언트(socket)에 보내는 역할을 하는 메서드
    class MultiServerRec extends Thread {
        Socket socket;
        DataInputStream in;
        DataOutputStream out;
        ArrayList<Object> b;//사용자 카드 패
        score cc=new score();
        int ss;
        //생성자.
        public String nameblackjack()  {// 사용자 블랙잭 조건
    		if(b.get(0)=="A" && b.get(1)=="10") {
    			return "블랙잭 입니다.";
    		}
    		else if (b.get(0)=="A" && b.get(1)=="J")  {
    			return "블랙잭 입니다.";
    		}
    		else if (b.get(0)=="A" && b.get(1)=="Q")  {
    			return "블랙잭 입니다.";
    		}
    		else if (b.get(0)=="A" && b.get(1)=="K")  {
    			return "블랙잭 입니다.";
    		}
    		else if (b.get(0)=="10" && b.get(1)=="A")  {
    			return "블랙잭 입니다.";
    		}
    		else if (b.get(0)=="J" && b.get(1)=="A")  {
    			return "블랙잭 입니다.";
    		}
    		else if (b.get(0)=="Q" && b.get(1)=="A")  {
    			return "블랙잭 입니다.";
    		}
    		else if (b.get(0)=="K" && b.get(1)=="A")  {
    			return "블랙잭 입니다.";
    		}
    		else {
    			return " ";
    		}
    	}
        public String hidden() { 
        	 ArrayList<Object>Ab=new ArrayList<Object>();
            Collections.synchronizedCollection(Ab);
        	for(int i=0; i<Aa.size(); i++) {//첫 패중 하나는 가려서 보이기
    			if(i==0)
    				Ab.add("?");
    			else
    			    Ab.add(Aa.get(i));
			}
        	return Arrays.deepToString(Ab.toArray());
        }
        
        public synchronized void exit() {//동기화,wait로 클라이언트 창 닫기
        	try {
        		wait(5000);//5초대기
				out.writeUTF("종료");//클라이언트화면 close
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
        }
        public synchronized void powerexit() {//동기화,wait로 클라이언트 창 빨리 닫기
        	try {
        		wait(1000);//1초대기
				out.writeUTF("종료");//클라이언트화면 close
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
                //Socket으로부터 입력스트림을 얻는다.
                in = new DataInputStream(socket.getInputStream());
                //Socket으로부터 출력스트림을 얻는다.
                out = new DataOutputStream(socket.getOutputStream());
            }catch(Exception e){
                System.out.println("예외:"+e);
            }
        }//생성자 ------------
        @Override
        public void run(){ //쓰레드를 사용하기 위해서 run()메서드 재정의
            String name=""; //클라이언트로부터 받은 이름을 저장할 변수.
            String firt="";
            String money="";
            String ip="";
            String ff="";
            cc.b=b;
            cc.Aa=Aa;
            cc.card=card;
                try{
            		for(int i=0; i<1;i++) {
            			out.writeUTF("이름을 입력해주세요>>");//클라이언트가 접속하면 메시지 출력.  
            			/*name = in.readUTF();//클라이언트에서 처음으로 보내는 메시지는 클라이언트가 사용할 이름이다.*/
            			firt=in.readUTF();
            			if(clientMapp.containsKey(firt)) {
            				out.writeUTF("존재하는 닉네임 입니다.");
            				i-=1;
            			}
            			else if(clientMap.size()>=5) {
            				out.writeUTF("정원(5명이) 접속중 입니다.");
            				powerexit();
            			}
            			else if(detect.size()>0) {
            				out.writeUTF("게임중 입니다~.");
            				powerexit();
            			}
            			else {
            				name=firt;
                        	for(int k=0; k<1;k++) {
                        		try {
                        		out.writeUTF("배팅 금액 을 입력해주세요>>");  
                                money=in.readUTF();
                                BigInteger big=new BigInteger(money);
            			        BigInteger val=new BigInteger("0");
            			        int choice= big.compareTo(val);
            			        if(choice==-1) { //big<val 일때 
            			        	out.writeUTF("배팅금액을 다시 입력해주세요>>");
            					    k-=1;
            			        }
            			        else if(choice==1){// big>val 일때 
            			        	out.writeUTF(name+"의 배팅 금액 >>"+money); 
            			        	clientMapp.put(name, money);
                                    for(int j=0;j<1; j++) {
                                    	out.writeUTF("ip주소를 입력해주세요>>");  //클라이언트가 접속하면 메시지 출력.                    
                                        ip = in.readUTF();
                                        if(ip.equals("127.0.0.1")) {
                                        	out.writeUTF(name+"님이 입장하셨습니다."+"여기는<"+name+"> 전용방");
                                        	out.writeUTF("명령키 확인--> /help 입력");
                                        }
                                        else {
                                        	out.writeUTF("ip주소를 다시 입력하시오>>");
                                        	j-=1;
                                        }
                                    }
            			        }
            			        else if(choice==0) {// big=val 일때 재입력 시도
            			        	out.writeUTF("배팅금액을 다시 입력해주세요>>");
            					    k-=1;
            			        }
                        		}
                        		catch(NumberFormatException e) {
                        			out.writeUTF("배팅금액을 다시 입력해주세요>>");
            					    k-=1;
                                }
                        	}
                        }
            		}
            		
                sendAllMsg(name + "님이 입장하셨습니다.");
                //현재 객체가 가지고있는 소켓을 제외하고 다른 소켓(클라이언트)들에게 접속을 알림.
                clientMap.put(name, out); //해쉬맵에 키를 name으로 출력스트림 객체를 저장.
           
                while(in!=null){//입력스트림이 null이 아니면 반복.
                    String msg = in.readUTF(); //입력스트림을 통해 읽어온 문자열을 msg에 할당.
                    if(msg.startsWith("/")){                       
                        if(msg.trim().equals("/접속자")){          
                            out.writeUTF(showUserList(name)); //접속자 출력                       
                        }
                        else if(msg.trim().equals("/정보")) {
                        	out.writeUTF(showUserinfor(name)); //접속자 출력 
                        }
                        else if(msg.trim().equals("/패확인")) {
                        	out.writeUTF(showUsercard(name)); //접속자 출력 
                        }
                        else if(msg.trim().equals("/종료")) {
                        	exit(); //클라이언트 게임 종료
                        }
                        else if(msg.trim().equals("/help")) {//명령키 단축 
                        	out.writeUTF("참여자 확인->/접속자");
                        	out.writeUTF("참여자 배팅금액->/정보");
                        	out.writeUTF("참여자 패 확인->/패확인");
                        	out.writeUTF("게임종료->/종료");
                        	out.writeUTF("게임시작->/시작(참여자 전부가 입력해야 실행)");
                        	out.writeUTF("시작 패 확인->/시작패확인");
                        	out.writeUTF("hit->/hit");
                        	out.writeUTF("stand->/stand");
                        	out.writeUTF("doubledown->/doubledown");
                        }
                        else if(msg.trim().equals("/시작")) {
                        	if(client.containsKey(name)) {
                        		out.writeUTF("명령형 오류");
                        	}
                        	else {
	                        	client.put(name,"시작");
	                        	if(client.size()==clientMap.size()) {
	                        		detect.put("okay", "동의완료");//참여자가 /시작 이라고 전부눌렀을때 도중에 게임에 참여 못하게 하기 위함
	                        		for(int k=0; k<2; k++) {
	                        			int a= (int)(Math.random()*36);
	                        			Aa.add(card[a]);//딜러 카드 2장 시작
	                        		}
	                        		 sendAllMsg("[ "+"딜러"+" ] "+hidden());
	                        	}
	                        	else {
	                        		sendAllMsg("[ "+"딜러"+" ] "+"모두가 /시작 을 누르면 게임 시작됨");
	                        	}
                        	}
                        }
                        else if(msg.trim().equals("/시작패확인")) {
                        	if(client.containsKey(name)) {
                        		if(finder.containsKey(name)) {
                        			out.writeUTF("명령형 오류");
                        		}
                        		else {
                        			finder.put(name,"시작패확인");
    	                            for(int k=0; k<2; k++) {//사용자카드 2장 시작
    	                    			int a= (int)(Math.random()*36);
    	                    			b.add(card[a]);
    	                    		}
    	                        	out.writeUTF("[ "+name+" ] "+Arrays.deepToString(b.toArray()));
    	                        	cardinfor.put(name,Arrays.deepToString(b.toArray()));
    	                        	String num=clientMapp.get(name);
    	                        	BigInteger big=new BigInteger(num);
    	                        	if(nameblackjack()=="블랙잭 입니다." && Aiblackjack()=="블랙잭 입니다."){
    	                        		out.writeUTF("both "+name+" and 딜러 둘다 블랙잭 무승부 입니다.");
    	                        		out.writeUTF(name+"얻은금액"+big);
    	                        		out.writeUTF("딜러 얻은금액"+big);
    	                        		out.writeUTF("게임을종료합니다.");
    		                        	exit();
    	                    		}
    	                        	else if(nameblackjack()=="블랙잭 입니다." ) {
    	                    			BigInteger big2=new BigInteger("3");
    	                            	BigInteger big3=big.multiply(big2);
    	                            	out.writeUTF(name+" 님 블랙잭이군요~!!!");
    	                            	out.writeUTF(name+"얻은금액"+big3);
    	                            	out.writeUTF("딜러 손실금액"+big);
    	                            	out.writeUTF("게임을종료합니다.");
    		                        	exit();
    	                    		}
    	                    		else if(Aiblackjack()=="블랙잭 입니다.") {
    	                    			BigInteger big2=new BigInteger("3");
    	                            	BigInteger big3=big.multiply(big2);
    	                            	out.writeUTF(name+" 님 딜러님이 블랙잭이어서 졌습니다.~!!!");
    	                            	out.writeUTF(name+"손실금액"+big);
    	                            	out.writeUTF("딜러 얻은금액"+big3);
    	                            	out.writeUTF("게임을종료합니다.");
    		                        	exit();
    	                    		}
                        		}
                        		
                        	}
                        	else {
                        		out.writeUTF("/시작 을 먼저 누르세요");
                        	}
                        }
                        else if(msg.trim().equals("/hit")) {
                        	if(finder.containsKey(name)) {
                        		if(doubledown.size()==1) {
                            		out.writeUTF("[ "+name+" ] "+"님 첫턴 doubledown 해서 카드를 못 뽑습니다..");
                            		if(cc.B()>=17) {//딜러가 합이 17이상이면 카드 한장 드로우 못 함.
                            			out.writeUTF("[ "+"딜러"+" ] "+hidden());
                            			out.writeUTF("[ "+name+" ] "+Arrays.deepToString(b.toArray()));
                            		}
                            		else if(cc.B()<17){
                            			int a= (int)(Math.random()*36);
                            			Aa.add(card[a]);
                            			out.writeUTF("[ "+"딜러"+" ] "+hidden());
                            			out.writeUTF("[ "+name+" ] "+Arrays.deepToString(b.toArray()));
                            		}
                            	}
                            	else {
                            		if(cc.B()>=17) {//딜러가 합이 17이상이면 카드 한장 드로우 못 함.
                            			int a= (int)(Math.random()*36);
                            			b.add(card[a]);
                            			out.writeUTF("[ "+"딜러"+" ] "+hidden());
                            			out.writeUTF("[ "+name+" ] "+Arrays.deepToString(b.toArray()));
                            			cardinfor.put(name,Arrays.deepToString(b.toArray()));
                            			hit.add("o");
                            		}
                            		else if(cc.B()<17){
                            			int a= (int)(Math.random()*36);
                            			b.add(card[a]);
                            			int f= (int)(Math.random()*36);
                            			Aa.add(card[a]);
                            			out.writeUTF("[ "+"딜러"+" ] "+hidden());
                            			out.writeUTF("[ "+name+" ] "+Arrays.deepToString(b.toArray()));
                            			cardinfor.put(name,Arrays.deepToString(b.toArray()));
                            			hit.add("o");
                            		}
                            	}
                        	}
                        	else {
                        		out.writeUTF("/시작패확인 먼저 누르시오");            	
    						}
                        	
                        }
                        else if(msg.trim().equals("/doubledown")) {
                        	if(finder.containsKey(name)) {
                        		if(hit.size()>=1) {
                        		out.writeUTF("[ "+name+" ] "+"님 첫턴 hit해서 못합니다.");
                        		}
                        		else {
                        			if(doubledown.size()==1) {
                        				out.writeUTF("[ "+name+" ] "+"님 첫턴 doubledown 해서 못합니다.");
                        			}	
                        			else if(doubledown.size()==0){
                        				doubledown.add("o");
                        				String num=clientMapp.get(name);
		                    			BigInteger big=new BigInteger(num);
		                    			BigInteger big2=new BigInteger("2");
		                    			BigInteger big3=big.multiply(big2);
		                    			out.writeUTF(name+"이"+big+" 만큼 더 배팅합니다.");
		                    			out.writeUTF(name+" 총 배팅 금액>>"+big3);
		                    			out.writeUTF("딜러도 추가 배팅 금액은"+big+"입니다.");
		                    			out.writeUTF("딜러도 총 배팅 금액>>"+big3);
		                    			big=big.multiply(big2);
		                                String text=String.valueOf(big);
		                    			clientMapp.put(name,text);
		                    			if(cc.B()>=17) {//딜러가 합이 17이상이면 카드 한장 드로우 못 함.
		                    				int a= (int)(Math.random()*36);
		                    				b.add(card[a]);
		                    				sendAllMsg("[ "+"딜러"+" ] "+hidden());
		                    				out.writeUTF("[ "+name+" ] "+Arrays.deepToString(b.toArray()));
		                    				out.writeUTF("[ "+name+" ] "+Arrays.deepToString(b.toArray()));
		                    				cardinfor.put(name,Arrays.deepToString(b.toArray())); 
		                    			}
		                    			else if(cc.B()<17){
		                    				int a= (int)(Math.random()*36);
		                    				b.add(card[a]);
		                    				int f= (int)(Math.random()*36);
		                    				Aa.add(card[a]);
		                    				sendAllMsg("[ "+"딜러"+" ] "+hidden());
		                    				out.writeUTF("[ "+name+" ] "+Arrays.deepToString(b.toArray()));
		                    				cardinfor.put(name,Arrays.deepToString(b.toArray()));
		                    				
		                    			}
                        			}
                        		}
                        	}
                        	else {
                        		out.writeUTF("/시작패확인 먼저 누르시오");
                        	}
                        	
            		}
                        else if(msg.trim().equals("/stand")) {
                        	if(finder.containsKey(name)) {
                        		if(b.contains("A")) {
                            		int c;
                            		for(int i=0; i<b.size(); i++) {
                            			if(b.get(i)=="A") {
                            				out.writeUTF(i+"번째 취할 점수 1또는 11입력하시오");
                            				String str=in.readUTF();
                            				if(str.equals("1")) {
                            					c = Integer.parseInt(str);
                            					out.writeUTF(i+"번째 취할 점수 1점");
                            					cc.ch=c;
                            				}
                            				else if(str.equals("11")) {
                            					c= Integer.parseInt(str);
                            					out.writeUTF(i+"번째 취할 점수 11점");
                            					cc.ch=c;
                            				}
                        				    else {
                        				    	out.writeUTF("다시 입력하시오");
                        				    	i-=1;
                        					}
                            			}
                            		}
                            	}
    		                    	if(cc.n()>21) {//사용자 카드 패 합이 21이상면 버스트
    		                    		
    		                    		BigInteger big2=new BigInteger("2");
    		                    		String num=clientMapp.get(name);
    		                			BigInteger big=new BigInteger(num);
    		                        	BigInteger big3=big.multiply(big2);
    		                        	out.writeUTF(name+" 님 버스트 입니다.");
    		                        	out.writeUTF(name+"손실금액"+big);
    		                        	out.writeUTF("딜러 얻은금액"+big3);
    		                        	out.writeUTF("게임을종료합니다.");
    		                        	exit();
    		        				 }
    	        				 else if(cc.n()==21) {//사용자 카드 패 합이 딜러 보다 먼저 21이면 승리
    	        				    
    	        					String num=clientMapp.get(name);
    	                 			BigInteger big=new BigInteger(num);
    	        					BigInteger big2=new BigInteger("2");
    	        			        BigInteger big3=big.multiply(big2);
    	        			        out.writeUTF(name+" 님 합이21 승리 입니다.");
    	        			        out.writeUTF(name+"얻은금액"+big3);
    	        			        out.writeUTF("딜러 손실금액"+big);
    	        			        out.writeUTF("게임을종료합니다.");
    	        			        exit();
    	        			      
    	        				}
    	        				 else if(cc.n()==cc.B()) {// 카드 패 합이 똑같으면 무승부
    	        					
    	        					String num=clientMapp.get(name);
    	                 			BigInteger big=new BigInteger(num);
    	                 			out.writeUTF("무승부 입니다.");
    	                 			out.writeUTF(name+"얻은금액"+big);
    	                 			out.writeUTF("딜러 얻은금액"+big);
    	                 			out.writeUTF("게임을종료합니다.");
    	                 			exit();
    	        				}
    	        			
    	        				 else if(cc.n()<cc.B()) {//딜러의 카드 패 합이 사용자 카드 패 합 보다 크면 name 패배, 딜러 승리
    	        				       String num=clientMapp.get(name);
    	               			       BigInteger big=new BigInteger(num);
    	        				       BigInteger big2=new BigInteger("2");
    	        		        	   BigInteger big3=big.multiply(big2);
    	        		        	   out.writeUTF(name+" < 딜러 이므로 "+name+" 님 패배 입니다.");
    	        		        	   out.writeUTF(name+"손실금액"+big);
    	        		        	   out.writeUTF("딜러 얻은금액"+big3);
    	        		        	   out.writeUTF("게임을종료합니다.");
    	        		        	   exit();
    	        					}
            					else if(cc.n()>cc.B()) {//사용자의 카드 패 합이 딜러 카드 패 합보다 크면 사용자 승리 딜러 패배
    	        						String num=clientMapp.get(name);
    	                    			BigInteger big=new BigInteger(num);
    	        						BigInteger big2=new BigInteger("2");
    	        			        	BigInteger big3=big.multiply(big2);
    	        			        	out.writeUTF(name+" > 딜러 이므로 "+name+" 님 승리 입니다.");
    	        			        	out.writeUTF(name+"얻은금액"+big3);
    	        			        	out.writeUTF("딜러 손실금액"+big);
    	        			        	out.writeUTF("게임을종료합니다.");
    	        			        	exit();
            					}
                        	}
                        	else {
                        		out.writeUTF("/시작패확인 먼저 누르시오");
                        	}
                        	
                        }
                    else{
                         out.writeUTF("잘못된 명령어입니다.");
                       }
                    }else{
                        sendAllMsg("[ "+name+" ] "+msg); //현재 소켓에서 읽어온메시지를 해쉬맵에 저장된 모든
                        //출력스트림으로 보낸다. 
                    }
                }
            }catch(Exception e){
                System.out.println(e + "----> ");
            }finally{
                //예외가 발생할때 퇴장. 해쉬맵에서 해당 데이터 제거.
                //보통 종료하거나 나가면 java.net.SocketException: 예외발생
                clientMap.remove(name);
                clientMapp.remove(name);
                cardinfor.remove(name);
                if(name !="") {
                	sendAllMsg(name + "님이 퇴장하셨습니다.");   
                	System.out.println("현재 접속자 수는 "+clientMap.size()+"명 입니다.");
                }  
                if(clientMap.size()==0) {
                	System.exit(0);//서버종료
                }
            }
        }
    }
}
