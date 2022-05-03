import java.util.*;
public class talkgame {
	public List<Object> talk;
	public List<Object> maintalk;
	public String talking;
	public boolean is;
	public int much;
	
	public boolean existword() {
		List<Object> jointalk=new ArrayList<Object>();
		for(int i=0; i<maintalk.size()-1; i++) {
			jointalk.add(maintalk.get(i));
		}
		return jointalk.contains(talking);
	}
		
	public String tg() {
		int r=talk.size();
		int k=r-much;
		if(talk.get(k-1).equals(talk.get(k))) {
			return "Yes";
		}
		else {
			return "No";
		}
	}
	
	public String wordword() {
		List<Object> sametalk=new ArrayList<Object>();
		List<Object> check=new ArrayList<Object>();
    	for(int i=talk.size()-much; i<talk.size(); i++ ) {
    		sametalk.add(talk.get(i));
    	  }
    	
    	for(int i=0; i<sametalk.size();i++) {
    		if(sametalk.get(i).equals(sametalk.get(0))) {
				check.add("O");
    		}
    	}
        if(check.size()==sametalk.size()) {
        	return "same";
        }
        else {
        	return " ";
        }
    }
    	
    public static void main(String[] args) {
		for(int i=0; i<1; i++) {
			Scanner sc=new Scanner(System.in);
			try {
				System.out.println("게임할 인원 수를 입력 하시오.");
				int num=sc.nextInt();
				if(num<=1) {
					System.out.println("다시 입력하시오");
					i-=1;
				}
				else {
					name(num); 
				}
				
			}
			catch(InputMismatchException e) {
				System.out.println("다시 입력하시오");
				i-=1;
			}
		}
	}
	public static void name(int num) {
		String player[]=new String[num];
		for(int i=0; i<=num; i++) {
			Scanner sc=new Scanner(System.in);
			if(i<num) {
				System.out.println(i+1+"번째 참석자 이름을 쓰시오");
				String name=sc.next();
			    player[i]=name;
			}
			else if(i==num) {
				talkgame(player);
			}
		}
	
	}
	public static void talkgame(String player[]) {
		List<Object> talk=new ArrayList<Object>();
		List<Object> maintalk=new ArrayList<Object>();
		List<Object> joinpeople=new ArrayList<Object>();
		List<Object> ss=new ArrayList<Object>();
		talkgame tk=new talkgame();
		
		tk.talk=talk;
		tk.maintalk=maintalk;

		while(true) {
			for(int i=0;i<player.length;i++) {
				Scanner sc=new Scanner(System.in);
				System.out.print(i+1+"번째 선수 "+player[i]+">>");
				joinpeople.add(player[i]);
				String talking=sc.next();
				maintalk.add(talking);
				tk.talking=talking;
				
				if(joinpeople.size()<2) {
					String[] array_word;
					array_word = talking.split("");
					for(int k=0; k<array_word.length;k++) {
						talk.add(array_word[k]);
				   	}
					int much=array_word.length;
					tk.much=much;
					
					if(tk.wordword().equals("same")) {
						System.out.println(i+1+"번째 선수 "+player[i]+"다시입력>>");
						maintalk.remove(maintalk.get(maintalk.size()-1));
						joinpeople.remove(joinpeople.get(joinpeople.size()-1));
						for(int k=talk.size()-much; k<talk.size(); k++) {
							talk.remove(talk.get(k));
						}
						i-=1;
				    }
					else if(tk.wordword().equals(" ")){
						
					}
					
				}	
				
				
				else if(joinpeople.size()>=2) {
					String[] array_word;
					array_word = talking.split(""); //배열에 한글자씩 저장하기
					for(int k=0; k<array_word.length;k++) {
						talk.add(array_word[k]);
					}
					int much=array_word.length;
					tk.much=much;
					
					if(tk.wordword().equals("same")) {
						System.out.println(i+1+"번째 선수 "+player[i]+"다시입력>>");
						maintalk.remove(maintalk.get(maintalk.size()-1));
						joinpeople.remove(joinpeople.get(joinpeople.size()-1));
						for(int k=talk.size()-much; k<talk.size(); k++) {
							talk.remove(talk.get(k));
						}
						i-=1;	
					}
					
					else if(tk.wordword().equals(" ")){
						if(tk.existword()==true) {
							System.out.println(i+1+"번째 선수 "+player[i]+" 님 탈락입니다." );
							ss.add("fail");
							break;
						}
						else if(tk.existword()==false) {
						
							if(tk.tg().equals("Yes")) {
							}
							else if(tk.tg().equals("No")){
								System.out.println(i+1+"번째 선수 "+player[i]+" 님 탈락입니다.");
								ss.add("fail");
								break;
				           
						}
					}
						
				}
			}
				
		}
			if(ss.size()>=1) {
				break;
			}
			else {
				continue;
			}
		
		}
		
	}
}
	
	

	
	
	