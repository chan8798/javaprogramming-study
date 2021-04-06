import java.util.Scanner;

public class AA3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
	   	System.out.print("정수를 입력하시오 ");
    	 int time =scanner.nextInt();
       
    	 int second= time%60;
    	 int minute= (time/60)%60;
    	 int hour= (time/60)/60;
    	 
    		
    		
    		System.out.print("시간은 "+hour);
    	    System.out.print("분은"+minute);
    	    System.out.print("초는"+second);
    	
	}
}
