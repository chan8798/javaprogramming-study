import java.util.Scanner;

public class AA3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
	   	System.out.print("������ �Է��Ͻÿ� ");
    	 int time =scanner.nextInt();
       
    	 int second= time%60;
    	 int minute= (time/60)%60;
    	 int hour= (time/60)/60;
    	 
    		
    		
    		System.out.print("�ð��� "+hour);
    	    System.out.print("����"+minute);
    	    System.out.print("�ʴ�"+second);
    	
	}
}
