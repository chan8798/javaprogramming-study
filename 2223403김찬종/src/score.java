import java.util.ArrayList;
import java.util.List;

public class score {
	public String name;// blackjack클래스 사용자 이름
	public String[] card; //클래스 card 집합 모음 배열
	public List<Object> b; //사용자 카드 패
	public List<Object> Aa;//딜러 카드 패
	public int ch;// blackjack클래스 사용자 패 A 1점 11점 선택한 숫자 정수형
	
	public int n() {//사용자 카드 패
	    List<Object> Ars=new ArrayList<Object>();//사용자 카드를 하나씩 Ars 리스트에 넣어줌
		for(int i=0; i<b.size(); i++) {
			if(b.get(i)=="A") {//A가 존재 할떄 선택한 숫자(1,11)을 namescore 메소드 이동
				Object a=b.get(i);
	    		namescore(a,Ars,ch);
	    	}
	    	else {// A외의 문자일 경우 namescore 메소드 이동
	    		
	    		Object a=b.get(i);
				namescore(a,Ars,ch);
	    	}
		}
	   int sum=0;
       for(int k=0; k<Ars.size(); k++) {//사용자 카드 패의 합
    	   int i = (int)Ars.get(k) ;
		   sum+=i;
		}  
		return sum;// 합을 반환함
	}
	
    public void namescore(Object a,List<Object> Ars,int ch) {
		if(a=="♠2") {
			Ars.add(2);
        }
        if(a=="♡2") {
    		Ars.add(2);
         }
        if(a=="◇2") {
        	Ars.add(2);
        }
        if(a=="♣2") {
            Ars.add(2);
        }
        if(a=="♠3") {
    		Ars.add(3);
        }
        if(a=="♡3") {
        	Ars.add(3);
        }
        if(a=="◇3") {
            Ars.add(3);
         }
        if(a=="♣3") {
            Ars.add(3);
        }
        if(a=="♠4") {
            Ars.add(4);
        }
        if(a=="♡4") {
        	Ars.add(4);
        }
        if(a=="◇4") {
            Ars.add(4);
        }
        if(a=="♣4") {
            Ars.add(4);
        }
        if(a=="♠5") {
            Ars.add(5);
        }
        if(a=="♡5") {
        	Ars.add(5);
        }
        if(a=="◇5") {
            Ars.add(5);
        }
        if(a=="♣5") {
            Ars.add(5);
        }
        if(a=="♠6") {
            Ars.add(6);
        }
        if(a=="♡6") {
        	Ars.add(6);
        }
        if(a=="◇6") {
            Ars.add(6);
        }
        if(a=="♣6") {
            Ars.add(6);
        }
        if(a=="♠7") {
            Ars.add(7);
        }
        if(a=="♡7") {
        	Ars.add(7);
        }
        if(a=="◇7") {
            Ars.add(7);
        }
        if(a=="♣7") {
            Ars.add(7);
        }
        if(a=="♠8") {
            Ars.add(8);
        }
        if(a=="♡8") {
        	Ars.add(8);
        }
        if(a=="◇8") {
            Ars.add(8);
        }
        if(a=="♣8") {
            Ars.add(8);
        }
        if(a=="♠9") {
            Ars.add(9);
        }
        if(a=="♡9") {
        	Ars.add(9);
        }
        if(a=="◇9") {
            Ars.add(9);
        }
        if(a=="♣9") {
            Ars.add(9);
        }
        if(a=="10") {
            Ars.add(10);
        }
        if(a=="J") {
            Ars.add(10);
        }
        if(a=="Q") {
            Ars.add(10);
        }
        if(a=="K") {
            Ars.add(10);
        }
        if(a=="A") {
        	if(ch==1) {
        		Ars.add(1);
        	}
        	else if(ch==11) {
        		Ars.add(11);
        	}
        }
    }
	public int B() {//딜러 카드 패의 합
		List<Object> br=new ArrayList<Object>();//딜러 카드를 하나씩 br리스트에 넣어줌
		for(int i=0; i<Aa.size(); i++) {
			Object a=Aa.get(i);
			if(a=="A") {// 딜러 패에 A가 존재하면 1,11 중 하나의 숫자를 선택함
				int score[];//score정수형 배열
				score=new int[] {1,11};// score의 배열 원소 1,11 
				int ch=(int)(Math.random()*1);// score배열 인덱스가 0,1이므로 0,1중 임의의정수 하나를 선택
				br.add(score[ch]);//선택된 정수가 score의 인덱스이어서 br리스트에 넣어줌
			}
			else {
				AiScore(a,br);//A외에 Aiscore 메소드로 이동
			}
		}
	   int sum=0;
       for(int k=0; k<br.size(); k++) {//딜러 카드 패의 합을 구하는 과정
    	   int i = (int)br.get(k) ;
		   sum+=i;
		}
	    return sum;// 딜러 카드 패의 합 반환
	 }
	public void AiScore(Object a,List<Object> br) {
		if(a=="♠2") {
			br.add(2);
        }
        if(a=="♡2") {
    		br.add(2);
        }
        if(a=="◇2") {
        	br.add(2);
        }
        if(a=="♣2") {
            br.add(2);
        }
        if(a=="♠3") {
    		br.add(3);
        }
        if(a=="♡3") {
        	br.add(3);
        }
        if(a=="◇3") {
            br.add(3);
        }
        if(a=="♣3") {
            br.add(3);
        }
        if(a=="♠4") {
            br.add(4);
        }
        if(a=="♡4") {
        	br.add(4);
        }
        if(a=="◇4") {
            br.add(4);
        }
        if(a=="♣4") {
            br.add(4);
        }
        if(a=="♠5") {
            br.add(5);
        }
        if(a=="♡5") {
        	br.add(5);
        }
        if(a=="◇5") {
            br.add(5);
        }
        if(a=="♣5") {
            br.add(5);
        }
        if(a=="♠6") {
            br.add(6);
        }
        if(a=="♡6") {
        	br.add(6);
        }
        if(a=="◇6") {
            br.add(6);
        }
        if(a=="♣6") {
            br.add(6);
        }
        if(a=="♠7") {
            br.add(7);
        }
        if(a=="♡7") {
        	br.add(7);
        }
        if(a=="◇7") {
            br.add(7);
        }
        if(a=="♣7") {
            br.add(7);
        }
        if(a=="♠8") {
            br.add(8);
        }
        if(a=="♡8") {
        	br.add(8);
        }
        if(a=="◇8") {
            br.add(8);
        }
        if(a=="♣8") {
            br.add(8);
        }
        if(a=="♠9") {
            br.add(9);
        }
        if(a=="♡9") {
        	br.add(9);
        }
        if(a=="◇9") {
            br.add(9);
        }
        if(a=="♣9") {
            br.add(9);
        }
        if(a=="10") {
            br.add(10);
        }
        if(a=="J") {
            br.add(10);
        }
        if(a=="Q") {
            br.add(10);
        }
        if(a=="K") {
            br.add(10);
        }
	}
}

