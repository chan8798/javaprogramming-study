package 중간프로젝트;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class score {
	public String name;
	public String[] card;
	public List<Object> Ar;
	public List<Object> Arr;
	public int ch;
	
	public int n() {
	    List<Object> Ars=new ArrayList<Object>();
		for(int i=0; i<Ar.size(); i++) {
			if(Ar.get(i)=="A") {
				Object a=Ar.get(i);
	    		namescore(a,Ars,ch);
	    	}
	    	else {
	    		Object a=Ar.get(i);
				namescore(a,Ars,ch);
	    	}
		}
	   int sum=0;
       for(int k=0; k<Ars.size(); k++) {
    	   int i = (int)Ars.get(k) ;
		   sum+=i;
		}  
		return sum;
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
	public int B() {
		List<Object> br=new ArrayList<Object>();
		for(int i=0; i<Arr.size(); i++) {
			Object a=Arr.get(i);
			if(a=="A") {
				int score[];
				score=new int[] {1,11};
				int ch=(int)(Math.random()*1);
				br.add(score[ch]);
			}
			else {
				AiScore(a,br);
			}
		}
	   int sum=0;
       for(int k=0; k<br.size(); k++) {
    	   int i = (int)br.get(k) ;
		   sum+=i;
		}
	    return sum;
	  
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
      ;
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
