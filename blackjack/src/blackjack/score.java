package blackjack;

import java.util.ArrayList;
import java.util.List;

public class score {
	public String name;
	public String[] card;
	public List<Object> Ar;
	public List<Object> Arr;
	
	public int n() {
		List<Object> Arss=new ArrayList<Object>();
	    List<Object> Ars=new ArrayList<Object>();
		/*System.out.println(name);*/
		for(int i=0; i<Ar.size(); i++) {
			/*System.out.print(Ar.get(i)+" ");*/
			Object a=Ar.get(i);
			namescore(a,Ars,Arss);
		}
		/*System.out.println();*/
		for(int k=0; k<Ars.size(); k++) {
			/*System.out.print(Ars.get(k)+" ");*/
		}
		/*System.out.println();*/
	   int sum=0;
       for(int k=0; k<Ars.size(); k++) {
    	   int i = (int)Ars.get(k) ;
		   sum+=i;
		}  
		/*System.out.println("Ars의 sum"+sum);*/  
		for(int k=0; k<Arss.size(); k++) {
			/*System.out.print(Arss.get(k)+" ");*/
		}
		/*System.out.println();*/
		int suum=0;
	    for(int k=0; k<Arss.size(); k++) {
	        int i = (int)Arss.get(k) ;
			suum+=i;
	   }
	   /*System.out.println("Arss의 sum"+suum);*/
	    if(sum<=suum) {
	    	return sum;
	    }
	    else if(sum>=suum) {
	    	return suum;
	    }
	    else if(sum==21 && suum!=21) {
	    	return sum;
	    }
	    else if(sum!=21 && suum==21) {
	    	return suum;
	    }
	    else {
	    	return sum;
	    }
	}
	
    public void namescore(Object a,List<Object> Ars,List<Object> Arss) {
		if(a=="♠1") {
			Ars.add(1);
		    Arss.add(1);
		}
		if(a=="♡1") {
			Ars.add(1);
		    Arss.add(1);
		}
		if(a=="◇1") {
			Ars.add(1);
		    Arss.add(1);
		}
		if(a=="♣1") {
			Ars.add(1);
	        Arss.add(1);
		}
		if(a=="♠2") {
			Ars.add(2);
            Arss.add(2);
		}
        if(a=="♡2") {
    		Ars.add(2);
            Arss.add(2);
        }
        if(a=="◇2") {
        	Ars.add(2);
            Arss.add(2);
        }
        if(a=="♣2") {
            Ars.add(2);
            Arss.add(2);
        }
        if(a=="♠3") {
    		Ars.add(3);
            Arss.add(3);
        }
        if(a=="♡3") {
        	Ars.add(3);
            Arss.add(3);
        }
        if(a=="◇3") {
            Ars.add(3);
            Arss.add(3);
        }
        if(a=="♣3") {
            Ars.add(3);
            Arss.add(3);
        }
        if(a=="♠4") {
            Ars.add(4);
        	Arss.add(4);
        }
        if(a=="♡4") {
        	Ars.add(4);
            Arss.add(4);
        }
        if(a=="◇4") {
            Ars.add(4);
            Arss.add(4);
        }
        if(a=="♣4") {
            Ars.add(4);
            Arss.add(4);
        }
        if(a=="♠5") {
            Ars.add(5);
        	Arss.add(5);
        }
        if(a=="♡5") {
        	Ars.add(5);
            Arss.add(5);
        }
        if(a=="◇5") {
            Ars.add(5);
            Arss.add(5);
        }
        if(a=="♣5") {
            Ars.add(5);
            Arss.add(5);
        }
        if(a=="♠6") {
            Ars.add(6);
        	Arss.add(6);
        }
        if(a=="♡6") {
        	Ars.add(6);
            Arss.add(6);
        }
        if(a=="◇6") {
            Ars.add(6);
            Arss.add(6);
        }
        if(a=="♣6") {
            Ars.add(6);
            Arss.add(6);
        }
        if(a=="♠7") {
            Ars.add(7);
        	Arss.add(7);
        }
        if(a=="♡7") {
        	Ars.add(7);
            Arss.add(7);
        }
        if(a=="◇7") {
            Ars.add(7);
            Arss.add(7);
        }
        if(a=="♣7") {
            Ars.add(7);
            Arss.add(7);
        }
        if(a=="♠8") {
            Ars.add(8);
        	Arss.add(8);
        }
        if(a=="♡8") {
        	Ars.add(8);
            Arss.add(8);
        }
        if(a=="◇8") {
            Ars.add(8);
            Arss.add(8);
        }
        if(a=="♣8") {
            Ars.add(8);
            Arss.add(8);
        }
        if(a=="♠9") {
            Ars.add(9);
        	Arss.add(9);
        }
        if(a=="♡9") {
        	Ars.add(9);
            Arss.add(9);
        }
        if(a=="◇9") {
            Ars.add(9);
            Arss.add(9);
        }
        if(a=="♣9") {
            Ars.add(9);
            Arss.add(9);
        }
        if(a=="10") {
            Ars.add(10);
            Arss.add(10);
        }
        if(a=="J") {
            Ars.add(10);
            Arss.add(10);
        }
        if(a=="Q") {
            Ars.add(10);
            Arss.add(10);
        }
        if(a=="K") {
            Ars.add(10);
            Arss.add(10);
        }
        if(a=="A") {
            Ars.add(1);
            Arss.add(11);
        }
    }
	public int B() {
		List<Object> br=new ArrayList<Object>();
	    List<Object> brs=new ArrayList<Object>();
		/*System.out.println("딜러");*/
		for(int i=0; i<Arr.size(); i++) {
			/*System.out.print(Arr.get(i)+" ");*/
			Object a=Arr.get(i);
			AiScore(a,br,brs);
		}
		/*System.out.println();*/	
		for(int k=0; k<br.size(); k++) {
			/*System.out.print(br.get(k)+" ");*/
		}
		/*System.out.println();*/
	   int sum=0;
       for(int k=0; k<br.size(); k++) {
    	   int i = (int)br.get(k) ;
		   sum+=i;
		}
      /* System.out.println("br의 sum"+sum);*/
	   for(int k=0; k<brs.size(); k++) {
			/*System.out.print(brs.get(k)+" ");*/
		}
		/*System.out.println();*/
				
		int suum=0;
	    for(int k=0; k<brs.size(); k++) {
	    	int i = (int)brs.get(k) ;
			suum+=i;
		}
	    /*System.out.println("Arss의 sum"+suum);*/
	    if(sum>=suum) {
	    	return suum;
	    }
	    else if(sum<=suum) {
	    	return sum;
	    }
	    else if(sum==21 && suum!=21) {
	    	return sum;
	    }
	    else if(sum!=21 && suum==21) {
	    	return suum;
	    }
	    else {
	    	return sum;
	    }
		}
	
	public void AiScore(Object a,List<Object> br,List<Object> brs) {
		if(a=="♠1") {
			br.add(1);
		    brs.add(1);
		}
		if(a=="♡1") {
			br.add(1);
		    brs.add(1);
		}
		if(a=="◇1") {
			br.add(1);
		    brs.add(1);
		}
		if(a=="♣1") {
			br.add(1);
	        brs.add(1);
		}
		if(a=="♠2") {
			br.add(2);
            brs.add(2);
		}
        if(a=="♡2") {
    		br.add(2);
            brs.add(2);
        }
        if(a=="◇2") {
        	br.add(2);
            brs.add(2);
        }
        if(a=="♣2") {
            br.add(2);
            brs.add(2);
        }
        if(a=="♠3") {
    		br.add(3);
            brs.add(3);
        }
        if(a=="♡3") {
        	br.add(3);
            brs.add(3);
        }
        if(a=="◇3") {
            br.add(3);
            brs.add(3);
        }
        if(a=="♣3") {
            br.add(3);
            brs.add(3);
        }
        if(a=="♠4") {
            br.add(4);
        	brs.add(4);
        }
        if(a=="♡4") {
        	br.add(4);
            brs.add(4);
        }
        if(a=="◇4") {
            br.add(4);
            brs.add(4);
        }
        if(a=="♣4") {
            br.add(4);
            brs.add(4);
        }
        if(a=="♠5") {
            br.add(5);
        	brs.add(5);
        }
        if(a=="♡5") {
        	br.add(5);
            brs.add(5);
        }
        if(a=="◇5") {
            br.add(5);
            brs.add(5);
        }
        if(a=="♣5") {
            br.add(5);
            brs.add(5);
        }
        if(a=="♠6") {
            br.add(6);
        	brs.add(6);
        }
        if(a=="♡6") {
        	br.add(6);
            brs.add(6);
        }
        if(a=="◇6") {
            br.add(6);
            brs.add(6);
        }
        if(a=="♣6") {
            br.add(6);
            brs.add(6);
        }
        if(a=="♠7") {
            br.add(7);
        	brs.add(7);
        }
        if(a=="♡7") {
        	br.add(7);
            brs.add(7);
        }
        if(a=="◇7") {
            br.add(7);
            brs.add(7);
        }
        if(a=="♣7") {
            br.add(7);
            brs.add(7);
        }
        if(a=="♠8") {
            br.add(8);
        	brs.add(8);
        }
        if(a=="♡8") {
        	br.add(8);
            brs.add(8);
        }
        if(a=="◇8") {
            br.add(8);
            brs.add(8);
        }
        if(a=="♣8") {
            br.add(8);
            brs.add(8);
        }
        if(a=="♠9") {
            br.add(9);
        	brs.add(9);
        }
        if(a=="♡9") {
        	br.add(9);
            brs.add(9);
        }
        if(a=="◇9") {
            br.add(9);
            brs.add(9);
        }
        if(a=="♣9") {
            br.add(9);
            brs.add(9);
        }
        if(a=="10") {
            br.add(10);
            brs.add(10);
        }
        if(a=="J") {
            br.add(10);
            brs.add(10);
        }
        if(a=="Q") {
            br.add(10);
            brs.add(10);
        }
        if(a=="K") {
            br.add(10);
            brs.add(10);
        }
        if(a=="A") {
            br.add(1);
            brs.add(11);
        }
	}


}
