package blackjack;
import java.util.*;
public class blackjack {
	public String name;
	public String[] card;
	public List<Object> Ar;
	public List<Object> Arr;

	public void name() {//name ī�� �� ����
		System.out.println(name);
		for(int i=0; i<Ar.size(); i++) {
			System.out.print(Ar.get(i)+" ");
		}
		System.out.println();
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
		int a= (int)(Math.random()*40);
		Ar.add(card[a]);
		System.out.println(name);
		for(int i=0; i<Ar.size(); i++) {
			System.out.print(Ar.get(i)+" ");
		}
		System.out.println();
		
	}
	
	public void Aicard() {//���� ī�� ���� ��ο�
		int a= (int)(Math.random()*40);
		Arr.add(card[a]);
		System.out.println("����");
		for(int i=0; i<Arr.size(); i++) {
			if(i==0) {
				System.out.print("?"+" ");
			}
			else {
				System.out.print(Arr.get(i)+" ");
			}
		}
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Object> Ar=new ArrayList<Object>();
		List<Object> Arr=new ArrayList<Object>();
		List<Object> Ars=new ArrayList<Object>();
		List<Object> Arss=new ArrayList<Object>();
		List<Object> burst=new ArrayList<Object>();
		List<Object> hit=new ArrayList<Object>();
		String[] card=new String[] {"��1","��1","��1","��1","��2","��2","��2","��2","��3","��3","��3","��3"
                                   ,"��4","��4","��4","��4","��5","��5","��5","��5","��6","��6","��6","��6"
                                   ,"��7","��7","��7","��7","��8","��8","��8","��8","��9","��9","��9","��9"
                                   ,"10","J","Q","K","A"};
		System.out.println("�÷��̾� �̸��� �Է��Ͻÿ�");
		String name=sc.next();
		System.out.println("������ �ݾ��� �Է��Ͻÿ�");
		long money=sc.nextLong();
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
			int a= (int)(Math.random()*40);
			Ar.add(card[a]);
		}
	    
	    
		System.out.println(name+"���� ��е� ī���");
		for(int i=0; i<Ar.size(); i++) {
			System.out.print(Ar.get(i)+" ");
		}
		System.out.println();
		
		
		for(int k=0; k<2; k++) {
			int a= (int)(Math.random()*40);
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
			System.out.println(name+"�� �����̱���~!!!");
			
		}
		else if(pl.Aiblackjack()=="���� �Դϴ�.") {
			System.out.println(name+"�� �������� �����̾ �����ϴ�.~!!!");
			pl.Ai();
		}
		else if(pl.nameblackjack()=="���� �Դϴ�." && pl.Aiblackjack()=="���� �Դϴ�.") {
			System.out.println("both "+name+" and ���� �Ѵ� ���� ���º� �Դϴ�.");
			pl.Ai();
		}
		else {
		while(true) {
			System.out.print("Hit>(h), Doubledown>(d), stand>(s)");
			String c=sc.next();
			if(c.equals("h")) {
				if(burst.size()==1) {
					System.out.println(name+"��  Doubledown �ϼż� ī�� �� �̽��ϴ�.");
					if(cc.B()>=17) {
						pl.name();
						pl.hiddenAi();
					}	
					else if(cc.B()<17) {
						pl.name();
						pl.Aicard();
						if(cc.n()==cc.B()) {
							System.out.println("���º� �Դϴ�.");
							break;
						}
					}
				 }	
				
			else {
				hit.add("hit");
				if(cc.B()>=17) {
					pl.namecard();
					pl.hiddenAi();
					 if(cc.n()>21) {
						System.out.println(name+"�� ����Ʈ �Դϴ�.");
						break;
					 }
					 else if(cc.n()==21) {
						System.out.println(name+"�� ����21 �¸� �Դϴ�.");
						break;
					}
					 else if(cc.n()==cc.B()) {
						System.out.println("���º� �Դϴ�.");
						break;
					}
				}
				else if(cc.B()<17) {
					pl.namecard();
					pl.Aicard();
					if(cc.n()>21) {
						System.out.println(name+"�� ����Ʈ �Դϴ�.");
						break;
					 }
					 else if(cc.n()==21) {
						System.out.println(name+"�� ����21 �¸� �Դϴ�.");
						break;
					}
				     else if(cc.n()==cc.B()) {
						System.out.println("���º� �Դϴ�.");
						break;
					}
				}
			}
				
			}	
			else if(c.equals("d")) {
				if(hit.size()>=1) {
					System.out.println(name+"��  ù �Ͽ� hit �ϼż� doubledown�� �մϴ�.");
					if(cc.B()>=17) {
						pl.name();
						pl.hiddenAi();
					}	
					else if(cc.B()<17) {
						pl.name();
						pl.Aicard();
						}
					}
				
				else if(burst.size()==1) {
					System.out.println(name+"��  Doubledown �ϼż� ī�� �� �̽��ϴ�.");
					if(cc.B()>=17) {
						pl.name();
						pl.hiddenAi();
					}	
					else if(cc.B()<17) {
						pl.name();
						pl.Aicard();
					}
				}
				else {
					burst.add("burst");
				    System.out.println(money*2+"��ŭ �� �����մϴ�.");
				    pl.namecard();
				    pl.Aicard();
				}
			
			}
		
            else if(c.equals("s")) {
				if(hit.size()< 1&& burst.size()<1) {
					System.out.println("ù �Ͽ� stand�� �� �� �����ϴ�.");
				}
				else {
					if(cc.n()==cc.B()) {
						pl.name();
						pl.Ai();
						System.out.println("���º� �Դϴ�.");
						break;
					}
					else if(cc.n()<cc.B()) {
						pl.name();
						pl.Ai();
						System.out.println(name+" < ���� �̹Ƿ� "+name+" �� �й� �Դϴ�.");
						break;
					}
					else if(cc.n()>cc.B()) {
						pl.name();
						pl.Ai();
						System.out.println(name+" > ���� �̹Ƿ�"+name+"�� �¸� �Դϴ�.");
						break;
					}
				}
			}
		}
	  }
	}	
}

