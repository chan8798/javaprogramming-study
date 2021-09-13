package ch10;
import java.util.InputMismatchException;
import java.util.Scanner;



public class InputMissmatchExceptionTest {
	 public void start() {
		 
	        System.out.println("������ �Է��ϼ���! ");
	        
	        Scanner input = new Scanner( System.in );
	        
	        int number = 0;
	        
	        // ����ڰ� ������ �Է��� ������ �ݺ��Ѵ�.
	        while(true) { 
	            
	            // �ϴ� ������ ���� �ȳ��� ������ �ϴ� �õ��غ���.
	            try { 
	                
	                // ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ��...
	                number = input.nextInt(); 
	                //���ڸ� �Է��ص� �Ǵ°� �ƴѰ�?
	                //���ܰ� �߻��ϸ� �ؿ� �� �����ϰ� �ٷ� catch�� ����.
	                break;
	            }
	            // try ������ �ڵ尡 InputMismatchException �� �����ٸ�,
	            // ���ܸ� �޾ƿ´�.
	            // catch�� ����Ǵ� ������ ���α׷��� ������� �ʴ´�.
	            catch ( InputMismatchException ime ) {
	                
	                // Scanner�� ���׸� �ذ��ϱ� ���� �ڵ�
	                input = new Scanner( System.in ); 
	                System.out.println("�߸� �Է��߽��ϴ�. ������ �Է��� �� �־��.");
	                
	                // ���� �ȵǴ� �ڵ�
	                // ������ ��ü���� ������ �˰� ���� �� ����.
	                // ��ü���� ������ �˰� �� �ڿ��� �ݵ�� ������ �Ѵ�.
	                //ime.printStackTrace();
	                
	                // �ֿ��ؾ��ϴ� �ڵ�
	                // � ���ܰ� ��� �߻��ߴ��� ������ �˷��ش�.
	                System.out.println(
	                        ime.getClass().getName() + " ���ܰ� " + ime.getMessage() + " ������ �߻��߽��ϴ�. ");
	            }
	        }
	        
	        
	        System.out.println("����� �Է��� ������ " + number + " �Դϴ�.");
	 }
	        public static void main(String[] args) {
	            InputMissmatchExceptionTest test = new InputMissmatchExceptionTest();
	            test.start();
	     
	        }


	


}
