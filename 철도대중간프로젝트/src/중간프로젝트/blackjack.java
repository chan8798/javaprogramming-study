package 중간프로젝트;
import java.util.*;
import java.util.InputMismatchException;
public class blackjack {
	public static String name;
	public String[] card;
	public List<Object> Ar;
	public List<Object> Arr;

	public void name() {//name 카드 패 공개
		System.out.println(name);
		for(int i=0; i<Ar.size(); i++) {
			System.out.print(Ar.get(i)+" ");
		}
		System.out.println();
	}
	
	public String nameblackjack() {//name 블랙잭
		if(Ar.get(0)=="A" && Ar.get(1)=="10") {
			return "블랙잭 입니다.";
		}
		else if (Ar.get(0)=="A" && Ar.get(1)=="J")  {
			return "블랙잭 입니다.";
		}
		else if (Ar.get(0)=="A" && Ar.get(1)=="Q")  {
			return "블랙잭 입니다.";
		}
		else if (Ar.get(0)=="A" && Ar.get(1)=="K")  {
			return "블랙잭 입니다.";
		}
		else if (Ar.get(0)=="10" && Ar.get(1)=="A")  {
			return "블랙잭 입니다.";
		}
		else if (Ar.get(0)=="J" && Ar.get(1)=="A")  {
			return "블랙잭 입니다.";
		}
		else if (Ar.get(0)=="Q" && Ar.get(1)=="A")  {
			return "블랙잭 입니다.";
		}
		else if (Ar.get(0)=="K" && Ar.get(1)=="A")  {
			return "블랙잭 입니다.";
		}
		else {
			return " ";
		}
	}
	
	public void Ai() { //딜러 패 전부 공개
		System.out.println("딜러");
		for(int i=0; i<Arr.size(); i++) {
			System.out.print(Arr.get(i)+" ");
		}
		System.out.println();
	}
	
	public void hiddenAi() { //딜러 패 한장 비공개
		System.out.println("딜러");
		for(int i=0; i<Arr.size(); i++) {
			if(i==0)
				System.out.print("?"+" ");
			else
			System.out.print(Arr.get(i)+" ");
		}
		System.out.println();
	}
	
	public String Aiblackjack() {// 딜러 블랙잭 조건
		if(Arr.get(0)=="A" && Arr.get(1)=="10") {
			return "블랙잭 입니다.";
		}
		else if (Arr.get(0)=="A" && Arr.get(1)=="J")  {
			return "블랙잭 입니다.";
		}
		else if (Arr.get(0)=="A" && Arr.get(1)=="Q")  {
			return "블랙잭 입니다.";
		}
		else if (Arr.get(0)=="A" && Arr.get(1)=="K")  {
			return "블랙잭 입니다.";
		}
		else if (Arr.get(0)=="10" && Arr.get(1)=="A")  {
			return "블랙잭 입니다.";
		}
		else if (Arr.get(0)=="J" && Arr.get(1)=="A")  {
			return "블랙잭 입니다.";
		}
		else if (Arr.get(0)=="Q" && Arr.get(1)=="A")  {
			return "블랙잭 입니다.";
		}
		else if (Arr.get(0)=="K" && Arr.get(1)=="A")  {
			return "블랙잭 입니다.";
		}
		else {
			return " ";
		}
	}
	
	public void namecard() {//name 카드한장 드로우
		int a= (int)(Math.random()*36);
		Ar.add(card[a]);
		System.out.println(name);
		for(int i=0; i<Ar.size(); i++) {
			System.out.print(Ar.get(i)+" ");
		}
		System.out.println();
		
	}
	
	public void Aicard() {//딜러 카드 한장 드로우
		int a= (int)(Math.random()*36);
		Arr.add(card[a]);
		System.out.println("딜러");
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
			System.out.println("플레이어 이름을 입력하시오");
		    name=sc.next();
			for(int i=0; i<1; i++) {
			    	Scanner scc=new Scanner(System.in);
			    	try {
			    		System.out.println("배팅할 금액을 입력하시오");//사용자가 배팅할 금액 입력
		            int money=scc.nextInt();
		            if(money<=0) {
		            	System.out.println("다시 입력하시오");
						i=-1;
		            }
		            else {
		            	System.out.println("딜러가 배팅한 금액은"+money+"입니다.");
		                let(name,money);
		            }
			    		}
			    	catch(InputMismatchException e) {
	
					System.out.println("다시 입력하시오");
					i=-1;
				
			 }    
			}
		} 
			
					
			
			    
		
		
		public static void let(String name,int money) {
		List<Object> Ar=new ArrayList<Object>();// 사용자 카드패
		List<Object> Arr=new ArrayList<Object>(); // 딜러 카드패
		List<Object> burst=new ArrayList<Object>(); // burst실행시 burst배열에 burst라는 문자열를 삽입
		List<Object> hit=new ArrayList<Object>();// hit실행시 hit배열에 hit라는 문자열를 삽입
		String[] card=new String[] {"A","10","J","Q","K","♠2","♡2","◇2","♣2","♠3","♡3","◇3","♣3"
                                   ,"♠4","♡4","◇4","♣4","♠5","♡5","◇5","♣5","♠6","♡6","◇6","♣6"
                                   ,"♠7","♡7","◇7","♣7","♠8","♡8","◇8","♣8","♠9","♡9","◇9","♣9"};// 게임에서 시용될 카드	
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
	   
		System.out.println(name+" 에게 배분된 카드는");
		for(int i=0; i<Ar.size(); i++) {
			System.out.print(Ar.get(i)+" ");
		}
		System.out.println();
		
		
		for(int k=0; k<2; k++) {
			int a= (int)(Math.random()*36);
			Arr.add(card[a]);
			
		}
		
		System.out.println("딜러에게 배분된 카드는");
		for(int i=0; i<Arr.size(); i++) {
			if(i==0)
				System.out.print("?"+" ");	
			else	
				System.out.print(Arr.get(i)+" ");
			
		}
		System.out.println();
		
		if(pl.nameblackjack()=="블랙잭 입니다." ) {
			System.out.println(name+" 님 블랙잭이군요~!!!");
			System.out.println("=========================");
			System.out.println(name+"손실금액"+0);
			System.out.println(name+"얻은금액"+money*3);
			System.out.println("딜러 손실금액"+money);
			System.out.println("딜러 얻은금액"+0);
			System.out.println("=========================");
			pl.Ai();
		}
		else if(pl.Aiblackjack()=="블랙잭 입니다.") {
			System.out.println(name+" 님 딜러님이 블랙잭이어서 졌습니다.~!!!");
			System.out.println(name+"손실금액"+money);
			System.out.println(name+"얻은금액"+0);
			System.out.println("딜러 손실금액"+0);
			System.out.println("딜러 얻은금액"+money*3);
			pl.Ai();
		}
		else if(pl.nameblackjack()=="블랙잭 입니다." && pl.Aiblackjack()=="블랙잭 입니다.") {
			System.out.println("both "+name+" and 딜러 둘다 블랙잭 무승부 입니다.");
			System.out.println(name+"손실금액"+0);
			System.out.println(name+"얻은금액"+money);
			System.out.println("딜러 손실금액"+0);
			System.out.println("딜러 얻은금액"+money);
			pl.Ai();
		}
		else {
		while(true) {
			System.out.print("Hit>(h), Doubledown>(d), stand>(s)");
			Scanner sc=new Scanner(System.in);
			String c=sc.next();
			for(int i=0;i<Ar.size();i++) {
				Scanner b=new Scanner(System.in);
				try {
					if(Ar.get(i)=="A") {
					System.out.println(i+1+"번째 A취할 점수 1또는 11입력");
					int ch=b.nextInt();
					if(ch==1) {
						cc.ch=ch;
					}
					else if(ch==11) {
						cc.ch=ch;
					}
					else {
						System.out.println(i+1+"번째 A취할 점수 1또는 11 다시 입력");
						i-=1;
					}
					
				}
					
				}
				catch(InputMismatchException e) {
					System.out.println(i+1+"번째 A취할 점수 1또는 11 다시 입력");
					i-=1;
				}
				
			}
			if(c.equals("h")) {
				if(burst.size()==1) {
					System.out.println(name+" 님  Doubledown 하셔서 카드 못 뽑습니다.");
					if(cc.B()>=17) {
						pl.name();
						pl.hiddenAi();
					}	
					else if(cc.B()<17) {
						pl.name();
						pl.Aicard();
						if(cc.n()==cc.B()) {
							System.out.println("무승부 입니다.");
							System.out.println("=========================");
							System.out.println(name+"손실금액"+0);
							System.out.println(name+"얻은금액"+money);
							System.out.println("딜러 손실금액"+0);
							System.out.println("딜러 얻은금액"+money);
							System.out.println("=========================");
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
						System.out.println(name+" 님 버스트 입니다.");
						System.out.println("=========================");
						System.out.println(name+"손실금액"+money);
						System.out.println(name+"얻은금액"+0);
						System.out.println("딜러 손실금액"+0);
						System.out.println("딜러 얻은금액"+money*2);
						System.out.println("=========================");
						break;
					 }
					 else if(cc.n()==21) {
						System.out.println(name+" 님 합이21 승리 입니다.");
						System.out.println("=========================");
						System.out.println(name+"손실금액"+0);
						System.out.println(name+"얻은금액"+money*2);
						System.out.println("딜러 손실금액"+money);
						System.out.println("딜러 얻은금액"+0);
						System.out.println("=========================");
						break;
					}
					 else if(cc.n()==cc.B()) {
						System.out.println("무승부 입니다.");
						System.out.println("=========================");
						System.out.println(name+"손실금액"+0);
						System.out.println(name+"얻은금액"+money);
						System.out.println("딜러 손실금액"+0);
						System.out.println("딜러 얻은금액"+money);
						System.out.println("=========================");
						break;
					}
				}
				else if(cc.B()<17) {
					
					pl.namecard();
					pl.Aicard();
					if(cc.n()>21) {
						System.out.println(name+"님 버스트 입니다.");
						System.out.println("=========================");
						System.out.println(name+"손실금액"+money);
						System.out.println(name+"얻은금액"+0);
						System.out.println("딜러 손실금액"+0);
						System.out.println("딜러 얻은금액"+money*2);
						System.out.println("=========================");
						break;
					 }
					 else if(cc.n()==21) {
						System.out.println(name+" 님 합이21 승리 입니다.");
						System.out.println("=========================");
						System.out.println(name+"손실금액"+0);
						System.out.println(name+"얻은금액"+money*2);
						System.out.println("딜러 손실금액"+money);
						System.out.println("딜러 얻은금액"+0);
						System.out.println("=========================");
						break;
					}
				     else if(cc.n()==cc.B()) {
						System.out.println("무승부 입니다.");
						System.out.println("=========================");
						System.out.println(name+"손실금액"+0);
						System.out.println(name+"얻은금액"+money);
						System.out.println("딜러 손실금액"+0);
						System.out.println("딜러 얻은금액"+money);
						System.out.println("=========================");
						break;
					}
				}
			}
				
			}	
			else if(c.equals("d")) {
				if(hit.size()>=1) {
					System.out.println(name+" 님  첫 턴에 hit 하셔서 doubledown못 합니다.");
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
					System.out.println(name+" 님  Doubledown 하셔서 카드 못 뽑습니다.");
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
				    System.out.println(name+"이"+money+" 만큼 더 배팅합니다.");
				    System.out.println(name+"총 배팅 금액>>"+money*2);
				    System.out.println("딜러도 추가 배팅 금액은"+money+"입니다.");
				    System.out.println("딜러도 총 배팅 금액>>"+money*2);
				    money=money*2;
				    pl.namecard();
				    pl.Aicard();
				}
			
			}
		
            else if(c.equals("s")) {
				    if(cc.n()==cc.B()) {
						pl.name();
						pl.Ai();
						System.out.println("무승부 입니다.");
						System.out.println("=========================");
						System.out.println(name+"손실금액"+0);
						System.out.println(name+"얻은금액"+money);
						System.out.println("딜러 손실금액"+0);
						System.out.println("딜러 얻은금액"+money);
						System.out.println("=========================");
						break;
					}
					else if(cc.n()<cc.B()) {
						System.out.println(name+" < 딜러 이므로 "+name+" 님 패배 입니다.");
						pl.name();
						pl.Ai();
						System.out.println("=========================");
						System.out.println(name+"손실금액"+money);
						System.out.println(name+"얻은금액"+0);
						System.out.println("딜러 손실금액"+0);
						System.out.println("딜러 얻은금액"+money*2);
						System.out.println("=========================");
						break;
						
					}
					else if(cc.n()>cc.B()) {
						pl.name();
						pl.Ai();
						System.out.println(name+" > 딜러 이므로 "+name+" 님 승리 입니다.");
						System.out.println("=========================");
						System.out.println(name+"손실금액"+0);
						System.out.println(name+"얻은금액"+money*2);
						System.out.println("딜러 손실금액"+money);
						System.out.println("딜러 얻은금액"+0);
						System.out.println("=========================");
						break;
						
					}
				
			}
		}
	  }
		}
	
}
