
import java.util.Scanner;
import java.util.InputMismatchException;

public class AA {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		

		    int n;
			while(true)	{
				
			try {
				
				System.out.println("수를 입력하세요: ");
				n= scanner.nextInt();
				break;
			}
			catch(InputMismatchException e ) {
					System.out.println("재 입력을 받으시오.");
					scanner.nextLine();
					
			}		
			}
				for(int j=1; j<10; j++) { 
					System.out.println(n+"*"+j+"="+n*j);}
			scanner.close();
	}
	}	

					
					
			
		
	


