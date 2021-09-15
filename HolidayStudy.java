package project;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;

public class HolidayStudy {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			int choice;
			Date now = Calendar.getInstance().getTime();
			
			System.out.println(now); 
			
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		
			String formatedNow = formatter.format(now);
				
			System.out.println("����ð���"+formatedNow);
		    Calendar cal = Calendar.getInstance();
		    cal.setTime(new Date());
		    
		    System.out.println("����<����>�� �����ϰ� �Է��Ͻÿ�.");
		    
		    System.out.println("============<�� ��>=============");
		    System.out.println("�����,�Ͽ��� �����Ѵ�.      ->1�� �Է�");
	    	System.out.println("�����,�Ͽ��� ����.         ->2�� �Է�");
	    	System.out.println("����Ͽ� �����ϰ� �Ͽ��Ͽ� ����.->3�� �Է�");
	    	System.out.println("�Ͽ��Ͽ� �����ϰ� ����Ͽ� ����.->4�� �Է�");
	    	System.out.println("================================");
		    
		    try {
				  choice=scanner.nextInt();
						
				  
				  
					} 
					catch  (InputMismatchException ime) {
						 scanner = new Scanner( System.in ); 
			             System.out.println("�ٽ��Է��Ͻÿ�:");
			              continue;
			             }
			       
		    
		    if(choice==1) { 
		    int time;
	    	System.out.println("�Ϸ� 1�� �ð��� ���� �����ϴ� �ð��� �Է��Ͻÿ�:");
	    	try {
				  time=scanner.nextInt();
			      after1000Hours(cal,time);
						
					} 
					catch  (InputMismatchException ime) {
						 scanner = new Scanner( System.in ); 
			             System.out.println("�ٽ��Է��Ͻÿ�:");
			              continue;
			             }
			          catch(ArithmeticException e) {
						System.out.println("�ٽ��Է��Ͻÿ�:");
						continue;
					}  
		    
		    }
		    else if(choice==2) {
			    int time;
		    	System.out.println("�Ϸ� 1�� �ð��� ���� �����ϴ� �ð��� �Է��Ͻÿ�:");
		    	try {
					  time=scanner.nextInt();
					  after1000Hourss(cal,time);
							
						} 
						catch  (InputMismatchException ime) {
							 scanner = new Scanner( System.in ); 
				             System.out.println("�ٽ��Է��Ͻÿ�:");
				              continue;
				             }
				          catch(ArithmeticException e) {
							System.out.println("�ٽ��Է��Ͻÿ�:");
							continue;
						}  
		    	
		    }
		    else if(choice==3) {
			    int time;
		    	System.out.println("�Ϸ� 1�� �ð��� ���� �����ϴ� �ð��� �Է��Ͻÿ�:");
		    	try {
					  time=scanner.nextInt();
					  after1000Hoursss(cal,time);
							
						} 
						catch  (InputMismatchException ime) {
							 scanner = new Scanner( System.in ); 
				             System.out.println("�ٽ��Է��Ͻÿ�:");
				              continue;
				             }
				          catch(ArithmeticException e) {
							System.out.println("�ٽ��Է��Ͻÿ�:");
							continue;
						}  
		    	
		    }
		    else if(choice==4) {
			    int time;
		    	System.out.println("�Ϸ� 1�� �ð��� ���� �����ϴ� �ð��� �Է��Ͻÿ�:");
		    	try {
					  time=scanner.nextInt();
					  after1000Hourssss(cal,time);
							
						} 
						catch  (InputMismatchException ime) {
							 scanner = new Scanner( System.in ); 
				             System.out.println("�ٽ��Է��Ͻÿ�:");
				              continue;
				             }
				          catch(ArithmeticException e) {
							System.out.println("�ٽ��Է��Ͻÿ�:");
							continue;
						}  
		    	
		    }
		    else {
		    	System.out.println("�ٽ��Է��Ͻÿ�:");
		    }
		    
		    }
		    
		}
		public static void after1000Hours(Calendar k, int time) {
	    	
			int a=(10000%time);
		    if(time<0) {
		    	System.out.println("�ٽ��Է��Ͻÿ�:");
		    }
	    	 
		    else if(time>24) {
		    	System.out.println("�ٽ��Է��Ͻÿ�:");
		    }
		    else  {
		    	 k.add(Calendar.DATE, (10000/time)-1);
		         SimpleDateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
		         
		             System.out.println(df.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
		    }
	

}
public static void after1000Hourss(Calendar k, int time) {
	    	
			int a=(10000%time);
		    if(time<0) {
		    	System.out.println("�ٽ��Է��Ͻÿ�:");
		    }
	    	 
		    else if(time>24) {
		    	System.out.println("�ٽ��Է��Ͻÿ�:");
		    }
		    else  {
		    	 k.add(Calendar.DATE, (10000/time)+((10000/7)*2)-1);
		         SimpleDateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
		         
		             System.out.println(df.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
		    }
}
public static void after1000Hoursss(Calendar k, int time) {
	
	int a=(10000%time);
    if(time<0) {
    	System.out.println("�ٽ��Է��Ͻÿ�:");
    }
	 
    else if(time>24) {
    	System.out.println("�ٽ��Է��Ͻÿ�:");
    }
    else  {
    	 k.add(Calendar.DATE, (10000/time)+((10000/7))-1);
         SimpleDateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
         
             System.out.println(df.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
    }
}
public static void after1000Hourssss(Calendar k, int time) {
	
	int a=(10000%time);
    if(time<0) {
    	System.out.println("�ٽ��Է��Ͻÿ�:");
    }
	 
    else if(time>24) {
    	System.out.println("�ٽ��Է��Ͻÿ�:");
    }
    else  {
    	 k.add(Calendar.DATE, (10000/time)+((10000/7))-1);
         SimpleDateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
         
             System.out.println(df.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
    }
}
}