
import java.util.Scanner;
import java.util.InputMismatchException;

public class AA {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		

		    int n;
			while(true)	{
				
			try {
				
				System.out.println("���� �Է��ϼ���: ");
				n= scanner.nextInt();
				break;
			}
			catch(InputMismatchException e ) {
					System.out.println("�� �Է��� �����ÿ�.");
					scanner.nextLine();
					
			}		
			}
				for(int j=1; j<10; j++) { 
					System.out.println(n+"*"+j+"="+n*j);}
			scanner.close();
	}
	}	

					
					
			
		
	


