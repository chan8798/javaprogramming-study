package ch10;
import java.util.Scanner;
import java.util.InputMismatchException;


public class ggggg {
	public static void main(String args[]) {
		
		int number;
		Scanner scanner=new Scanner(System.in);
		 
		System.out.println("���� ������ �Է��ϼ���");
		while (true) {
			try {
				
				number= scanner.nextInt();
				
				break;
			}
			catch  (InputMismatchException ime) {
				scanner = new Scanner( System.in ); 
	             System.out.println("�߸� �Է��߽��ϴ�. ������ �Է��� �� �־��. �ٽ��Է��Ͻÿ�.");
	             
	             System.out.println(
	             ime.getClass().getName() + " ���ܰ� " + ime.getMessage() + " ������ �߻��߽��ϴ�. ");
					
				}
					
					}
		System.out.println(number+1);
			    }
				
	}


