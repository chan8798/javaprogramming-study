import java.util.*;
import java.math.BigInteger;
import java.lang.NumberFormatException;
import java.util.InputMismatchException;
public class blackjack {
	public static String name; //����� �̸�
	public String[] card; //������ ī�� �迭�� ����
	public List<Object> Ar; // ����� ī�� ��
	public List<Object> Arr;// ���� ī�� ��
    public int ss;
    public Object ac;

    public void name() {//name ī�� �� ����
		System.out.println(name);
		for(int i=0; i<Ar.size(); i++) {
			System.out.print(Ar.get(i)+" ");
		}
		System.out.println();
	}
	
	public void nameshuffle() {//���� ī�� ����
		int rNum[] = new int[Ar.size()];
		boolean room[]=new boolean[Ar.size()];
		List<Object> Ars=new ArrayList<Object>();
		int index=0;
		int rnd;
		while(index<Ar.size()) {
			rnd=(int)(Math.random()*Ar.size());
			if(!room[rnd]){ 
				room[rnd] = true; 
				rNum[index]= rnd; 
				index++; 
			}
		}
    	
		
		for(int i=0; i<=rNum.length; i++){	
			
			if(i<rNum.length) {
				this.ac=Ar.get(rNum[i]);
			    Ars.add(ac);
			}
			else if(i==rNum.length) {
				Ar.clear();
				Ar.addAll(Ars);
		
			}
			
		}	
				 
		
		System.out.println(name);
		for(int k=0; k<Ar.size(); k++){
			System.out.print(Ar.get(k)+" ");
			
		}
		System.out.println();
		
				
	}	
	 public void nameAcsore() {
		 for(int i=0;i<Ar.size();i++) {
				Scanner b=new Scanner(System.in);
				try {
					if(Ar.get(i)=="A") {
					System.out.println(i+1+"��° A���� ���� 1�Ǵ� 11�Է�");
					int ch=b.nextInt();
					if(ch==1) {
						this.ss=ch;
						Asc();//Asc �޼ҵ�� �̵�
					}
					else if(ch==11) {
						this.ss=ch;
						Asc();//Asc �޼ҵ�� �̵�
					}
					else {
						System.out.println(i+1+"��° A���� ���� 1�Ǵ� 11 �ٽ� �Է�");
						i-=1;//�ٽ� ���Է� �ϵ��� �ݺ��� �ε��� ���� ����
					}
				}
				}
				catch(InputMismatchException e) {
					System.out.println(i+1+"��° A���� ���� 1�Ǵ� 11 �ٽ� �Է�");
					i-=1;//�ٽ� ���Է� �ϵ��� �ݺ��� �ε��� ���� ����
				}
			}	
	}		
	 
	public int Asc() {
		return ss;
	}
			
	public String nameblackjack() {//name ����
		if(Ar.get(0)=="A" && Ar.get(1)=="10") {
			return "���� �Դϴ�.";
		}
		else if (Ar.get(0)=="A" && Ar.get(1)=="J")  {
			return "���� �Դϴ�.";
		}
		else if (Ar.get(0)=="A" && Ar.get(1)=="Q")  {
			return "���� �Դϴ�.";
		}
		else if (Ar.get(0)=="A" && Ar.get(1)=="K")  {
			return "���� �Դϴ�.";
		}
		else if (Ar.get(0)=="10" && Ar.get(1)=="A")  {
			return "���� �Դϴ�.";
		}
		else if (Ar.get(0)=="J" && Ar.get(1)=="A")  {
			return "���� �Դϴ�.";
		}
		else if (Ar.get(0)=="Q" && Ar.get(1)=="A")  {
			return "���� �Դϴ�.";
		}
		else if (Ar.get(0)=="K" && Ar.get(1)=="A")  {
			return "���� �Դϴ�.";
		}
		else {
			return " ";
		}
	}
	
	public void Ai() { //���� �� ���� ����
		System.out.println("����");
		for(int i=0; i<Arr.size(); i++) {
			System.out.print(Arr.get(i)+" ");
		}
		System.out.println();
	}
	
	public void hiddenAi() { //���� �� ���� �����
		System.out.println("����");
		for(int i=0; i<Arr.size(); i++) {
			if(i==0)
				System.out.print("?"+" ");
			else
			System.out.print(Arr.get(i)+" ");
		}
		System.out.println();
	}
	
	public String Aiblackjack() {// ���� ���� ����
		if(Arr.get(0)=="A" && Arr.get(1)=="10") {
			return "���� �Դϴ�.";
		}
		else if (Arr.get(0)=="A" && Arr.get(1)=="J")  {
			return "���� �Դϴ�.";
		}
		else if (Arr.get(0)=="A" && Arr.get(1)=="Q")  {
			return "���� �Դϴ�.";
		}
		else if (Arr.get(0)=="A" && Arr.get(1)=="K")  {
			return "���� �Դϴ�.";
		}
		else if (Arr.get(0)=="10" && Arr.get(1)=="A")  {
			return "���� �Դϴ�.";
		}
		else if (Arr.get(0)=="J" && Arr.get(1)=="A")  {
			return "���� �Դϴ�.";
		}
		else if (Arr.get(0)=="Q" && Arr.get(1)=="A")  {
			return "���� �Դϴ�.";
		}
		else if (Arr.get(0)=="K" && Arr.get(1)=="A")  {
			return "���� �Դϴ�.";
		}
		else {
			return " ";
		}
	}
	
	public void namecard() {//name ī������ ��ο�
		int a= (int)(Math.random()*36);
		Ar.add(card[a]);
		System.out.println(name);
		for(int i=0; i<Ar.size(); i++) {
			System.out.print(Ar.get(i)+" ");
		}
		System.out.println();
		
	}
	
	public void Aicard() {//���� ī�� ���� ��ο�,ī�� �� ���� �Ⱥ��� ��
		int a= (int)(Math.random()*36);
		Arr.add(card[a]);
		System.out.println("����");
		for(int i=0; i<Arr.size(); i++) {
			if(i==0) {
				System.out.print("?"+" ");// ���� �ε��� 0�κп� ī�� �� ���� ����(�� ������)
			}
			else {
				System.out.print(Arr.get(i)+" ");
			}
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
			System.out.println("�÷��̾� �̸��� �Է��Ͻÿ�");
		    name=sc.next();
			for(int i=0; i<1; i++) {
			    	Scanner scc=new Scanner(System.in);
			    	try {
			    		System.out.println("������ �ݾ��� �Է��Ͻÿ�");//����ڰ� ������ �ݾ� �Է�
		            String money=scc.next();
		            BigInteger big=new BigInteger(money);
			        BigInteger val=new BigInteger("0");
			        int choice= big.compareTo(val);
			        if(choice==-1) { //big<val �϶� 
			        	System.out.println("�ٽ� �Է��Ͻÿ�");
					    i-=1;
			        }
			        else if(choice==1){// big>val �϶� ���Է� �õ�
			        	System.out.println("������ ������ �ݾ���"+money+"�Դϴ�.");
			        	let(name,big);
			        }
			        
			        else if(choice==0) {// big=val �϶� ���Է� �õ�
			        	System.out.println("�ٽ� �Է��Ͻÿ�");
					    i-=1;
			        }
			    		}
			    	catch(NumberFormatException e) { // ���ڰ� ���ԵǾ� ������ ���Է� �õ�
			        	System.out.println("�ٽ� �Է��Ͻÿ�");
					    i-=1;
					}
			}
		} 
		public static void let(String name, BigInteger big) {
		List<Object> Ar=new ArrayList<Object>();// ����� ī����
		List<Object> Arr=new ArrayList<Object>(); // ���� ī����
		List<Object> doubledown=new ArrayList<Object>(); // burst����� burst�迭�� burst��� ���ڿ��� ����
		List<Object> hit=new ArrayList<Object>();// hit����� hit�迭�� hit��� ���ڿ��� ����
		
	    String[] card=new String[] {"A","10","J","Q","K","��2","��2","��2","��2","��3","��3","��3","��3"
                                   ,"��4","��4","��4","��4","��5","��5","��5","��5","��6","��6","��6","��6"
                                   ,"��7","��7","��7","��7","��8","��8","��8","��8","��9","��9","��9","��9"};// ���ӿ��� �ÿ�� ī��	
		blackjack pl=new blackjack();	
		score cc=new score();
		pl.name=name;
		pl.card=card;
		pl.Ar=Ar;
		pl.Arr=Arr;
	    cc.Ar=Ar;
	    cc.Arr=Arr;
	    cc.name=name;
	    cc.card=card;
        
		for(int k=0; k<2; k++) {
			int a= (int)(Math.random()*36);
			Ar.add(card[a]);
		}
	   
		System.out.println(name+" ���� ��е� ī���");
		for(int i=0; i<Ar.size(); i++) {
			System.out.print(Ar.get(i)+" ");
		}
		System.out.println();
		
		
		for(int k=0; k<2; k++) {
			int a= (int)(Math.random()*36);
			Arr.add(card[a]);
			
		}
	
		
		System.out.println("�������� ��е� ī���");
		for(int i=0; i<Arr.size(); i++) {
			if(i==0)
				System.out.print("?"+" ");	
			else	
				System.out.print(Arr.get(i)+" ");
			
		}
		System.out.println();
		
		if(pl.nameblackjack()=="���� �Դϴ�." ) {
			BigInteger big2=new BigInteger("3");
        	BigInteger big3=big.multiply(big2);
			System.out.println(name+" �� �����̱���~!!!");
			System.out.println("=========================");
			System.out.println(name+"�սǱݾ�"+0);
			System.out.println(name+"�����ݾ�"+big3);
			System.out.println("���� �սǱݾ�"+big);
			System.out.println("���� �����ݾ�"+0);
			System.out.println("=========================");
			pl.Ai();
		}
		else if(pl.Aiblackjack()=="���� �Դϴ�.") {
			BigInteger big2=new BigInteger("3");
        	BigInteger big3=big.multiply(big2);
			System.out.println(name+" �� �������� �����̾ �����ϴ�.~!!!");
			System.out.println(name+"�սǱݾ�"+big);
			System.out.println(name+"�����ݾ�"+0);
			System.out.println("���� �սǱݾ�"+0);
			System.out.println("���� �����ݾ�"+big3);
			pl.Ai();
		}
		else if(pl.nameblackjack()=="���� �Դϴ�." && pl.Aiblackjack()=="���� �Դϴ�."){
			System.out.println("both "+name+" and ���� �Ѵ� ���� ���º� �Դϴ�.");
			System.out.println(name+"�սǱݾ�"+0);
			System.out.println(name+"�����ݾ�"+big);
			System.out.println("���� �սǱݾ�"+0);
			System.out.println("���� �����ݾ�"+big);
			pl.Ai();
		}
		else {
		while(true) {
			System.out.print("Hit>(h), Doubledown>(d), stand>(s), shuffle(sf)");
			Scanner sc=new Scanner(System.in);
			String c=sc.next();
			if(c.equals("h")) {
				if(doubledown.size()==1) {//ó�� ī�� ������ doubledown�� �ϸ� hit(ī�� ���� ��ο�)����
					System.out.println(name+" ��  Doubledown �ϼż� ī�� �� �̽��ϴ�.");
					if(cc.B()>=17) {//������ ���� 17�̻��̸� ī�� ���� ��ο� �� ��.
						pl.name();// ����� ī�� ������
						pl.hiddenAi();// ���� ī�� ������ �������� �ʰ� ������
					}	
					else if(cc.B()<17) {//������ ���� 17�̸��̸� ī�� ���� ��ο�
						pl.name();// ����� ī�� ������
						pl.Aicard();//���� ī�� ���� ��ο� �ϰ� ī�� ������ �������� �ʰ� ������
			
					}
				 }	
				
			    else {// ó�� ī�� ���� �� doubledown�� ���� ������ hit �� �� ����
					hit.add("hit");
					if(cc.B()>=17) {//������ ���� 17�̻��̸� ī�� ���� ��ο� �� ��.
						pl.namecard();//����� ��ο� �� ī�带 ������
						pl.hiddenAi();// ���� ī�� ������ �������� �ʰ� ������
						
					}
					else if(cc.B()<17) {//������ ���� 17�̸��̸� ī�� ���� ��ο�
						pl.namecard();//����� ��ο� �� ī�带 ������
						pl.Aicard();//���� ī�� ���� ��ο� �ϰ� ī�� ������ �������� �ʰ� ������
			
					}
			}
		}	
			else if(c.equals("d")) {
				if(hit.size()>=1) {//ó���� hit�� �ϸ� doubledown����
					System.out.println(name+" ��  ù �Ͽ� hit �ϼż� doubledown�� �մϴ�.");
				}
				else if(doubledown.size()==1) {//ù ��° doubledown�ϸ� �ٽ� doubledown����
					System.out.println(name+" ��  ù �Ͽ� doubledown �ϼż� doubledown�� �մϴ�.");
				}
				else {
					doubledown.add("doubledown");
					BigInteger big2=new BigInteger("2");
		        	BigInteger big3=big.multiply(big2);
				    System.out.println(name+"��"+big+" ��ŭ �� �����մϴ�.");
				    System.out.println(name+"�� ���� �ݾ�>>"+big3);
				    System.out.println("������ �߰� ���� �ݾ���"+big+"�Դϴ�.");
				    System.out.println("������ �� ���� �ݾ�>>"+big3);
				    big=big.multiply(big2);
				    if(cc.B()>=17) {//������ ���� 17�̻��̸� ī�� ���� ��ο� �� ��.
						pl.namecard();//����� ��ο� �� ī�带 ������
						pl.hiddenAi();// ���� ī�� ������ �������� �ʰ� ������
						
					}
					else if(cc.B()<17) {//������ ���� 17�̸��̸� ī�� ���� ��ο�
						pl.namecard();//����� ��ο� �� ī�带 ������
						pl.Aicard();//���� ī�� ���� ��ο� �ϰ� ī�� ������ �������� �ʰ� ������
			
					}
				}
			
			}
		    else if(c.equals("s")) {
		    	pl.nameAcsore();//����� ī�� �п� A�� ���� �� ��� 1�Ǵ� 11 ���ڸ� ����
		        int ch=pl.Asc();//���õ� ���� ��ȯ�Ȱ��� ch�� �־� ��
		        cc.ch=ch;	//ch�� score�� ch���� �־���
		        	
            	if(cc.n()>21) {//����� ī�� �� ���� 21�̸� ����Ʈ
            		BigInteger big2=new BigInteger("2");
                	BigInteger big3=big.multiply(big2);
					System.out.println(name+" �� ����Ʈ �Դϴ�.");
					System.out.println("=========================");
					System.out.println(name+"�սǱݾ�"+big);
					System.out.println(name+"�����ݾ�"+0);
					System.out.println("���� �սǱݾ�"+0);
					System.out.println("���� �����ݾ�"+big3);
					System.out.println("=========================");
					System.out.println("������ ���� �� ����");
					pl.Ai();
					System.out.println("������ ������"+cc.B()+"�Դϴ�.");
					System.out.println(name+"�� ������"+cc.n()+"�Դϴ�.");
					break;//���� ���� while ���� ���
				 }
				 else if(cc.n()==21) {//����� ī�� �� ���� ���� ���� ���� 21�̸� �¸�
					BigInteger big2=new BigInteger("2");
			        BigInteger big3=big.multiply(big2);
					System.out.println(name+" �� ����21 �¸� �Դϴ�.");
					System.out.println("=========================");
					System.out.println(name+"�սǱݾ�"+0);
					System.out.println(name+"�����ݾ�"+big3);
					System.out.println("���� �սǱݾ�"+big);
					System.out.println("���� �����ݾ�"+0);
					System.out.println("=========================");
					System.out.println("������ ���� �� ����");
					pl.Ai();
					System.out.println("������ ������"+cc.B()+"�Դϴ�.");
					System.out.println(name+"�� ������"+cc.n()+"�Դϴ�.");
					break;
				}
				 else if(cc.n()==cc.B()) {// ī�� �� ���� �Ȱ����� ���º�
					System.out.println("���º� �Դϴ�.");
					System.out.println("=========================");
					System.out.println(name+"�սǱݾ�"+0);
					System.out.println(name+"�����ݾ�"+big);
					System.out.println("���� �սǱݾ�"+0);
					System.out.println("���� �����ݾ�"+big);
					System.out.println("=========================");
					System.out.println("������ ���� �� ����");
					pl.Ai();
					System.out.println("������ ������"+cc.B()+"�Դϴ�.");
					System.out.println(name+"�� ������"+cc.n()+"�Դϴ�.");
					break;
				}
			
			   else if(cc.n()<cc.B()) {//������ ī�� �� ���� ����� ī�� �� �� ���� ũ�� name �й�, ���� �¸�
				        BigInteger big2=new BigInteger("2");
		        	    BigInteger big3=big.multiply(big2);
						System.out.println(name+" < ���� �̹Ƿ� "+name+" �� �й� �Դϴ�.");
						pl.name();
						pl.hiddenAi();
						System.out.println("=========================");
						System.out.println(name+"�սǱݾ�"+big);
						System.out.println(name+"�����ݾ�"+0);
						System.out.println("���� �սǱݾ�"+0);
						System.out.println("���� �����ݾ�"+big3);
						System.out.println("=========================");
						System.out.println("������ ���� �� ����");
						pl.Ai();
						System.out.println("������ ������"+cc.B()+"�Դϴ�.");
						System.out.println(name+"�� ������"+cc.n()+"�Դϴ�.");
						break;
					}
					else if(cc.n()>cc.B()) {//������� ī�� �� ���� ���� ī�� �� �պ��� ũ�� ����� �¸� ���� �й�
						BigInteger big2=new BigInteger("2");
			        	BigInteger big3=big.multiply(big2);
						pl.name();
						pl.hiddenAi();
						System.out.println(name+" > ���� �̹Ƿ� "+name+" �� �¸� �Դϴ�.");
						System.out.println("=========================");
						System.out.println(name+"�սǱݾ�"+0);
						System.out.println(name+"�����ݾ�"+big3);
						System.out.println("���� �սǱݾ�"+big);
						System.out.println("���� �����ݾ�"+0);
						System.out.println("=========================");
						System.out.println("������ ���� �� ����");
						pl.Ai();
						System.out.println("������ ������"+cc.B()+"�Դϴ�.");
						System.out.println(name+"�� ������"+cc.n()+"�Դϴ�.");
						break;
						
					}
            }
		    else if(c.equals("sf")) {//����� ī�� �� ����(ī�� �и� ����, ���� ī�� �и� �����ش�.
		    	pl.nameshuffle();
		    	pl.hiddenAi();				
				
		    }
				}
		}
	  }
		}
	

