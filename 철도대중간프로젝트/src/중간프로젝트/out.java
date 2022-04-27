package 중간프로젝트;

public class out {
	public static void main(String args[]) {
		String[] card=new String[] {"A","10","J","Q","K","♠2","♡2","◇2","♣2","♠3","♡3","◇3","♣3"
                ,"♠4","♡4","◇4","♣4","♠5","♡5","◇5","♣5","♠6","♡6","◇6","♣6"
                ,"♠7","♡7","◇7","♣7","♠8","♡8","◇8","♣8","♠9","♡9","◇9","♣9"};
		/*for(int i=0; i<card.length; i++)
			System.out.println(card[i]+" ");*/
		
		for(int k=0; k<11; k++) {
			int a= (int)(Math.random()*36);
			System.out.println(card[a]+" ");
		}
	}

}
