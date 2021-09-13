package ch10;
import java.util.Scanner;
import java.util.InputMismatchException;


public class ggggg {
	public static void main(String args[]) {
		
		int number;
		Scanner scanner=new Scanner(System.in);
		 
		System.out.println("더할 날수를 입력하세요");
		while (true) {
			try {
				
				number= scanner.nextInt();
				
				break;
			}
			catch  (InputMismatchException ime) {
				scanner = new Scanner( System.in ); 
	             System.out.println("잘못 입력했습니다. 정수만 입력할 수 있어요. 다시입력하시오.");
	             
	             System.out.println(
	             ime.getClass().getName() + " 예외가 " + ime.getMessage() + " 때문에 발생했습니다. ");
					
				}
					
					}
		System.out.println(number+1);
			    }
				
	}


