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
				
			System.out.println("현재시간은"+formatedNow);
		    Calendar cal = Calendar.getInstance();
		    cal.setTime(new Date());
		    
		    System.out.println("다음<조건>을 참조하고 입력하시오.");
		    
		    System.out.println("============<조 건>=============");
		    System.out.println("토요일,일요일 공부한다.      ->1를 입력");
	    	System.out.println("토요일,일요일 쉰다.         ->2를 입력");
	    	System.out.println("토요일엔 공부하고 일요일엔 쉰다.->3를 입력");
	    	System.out.println("일요일엔 공부하고 토요일엔 쉰다.->4를 입력");
	    	System.out.println("================================");
		    
		    try {
				  choice=scanner.nextInt();
						
				  
				  
					} 
					catch  (InputMismatchException ime) {
						 scanner = new Scanner( System.in ); 
			             System.out.println("다시입력하시오:");
			              continue;
			             }
			       
		    
		    if(choice==1) { 
		    int time;
	    	System.out.println("하루 1만 시간을 위해 투입하는 시간을 입력하시오:");
	    	try {
				  time=scanner.nextInt();
			      after1000Hours(cal,time);
						
					} 
					catch  (InputMismatchException ime) {
						 scanner = new Scanner( System.in ); 
			             System.out.println("다시입력하시오:");
			              continue;
			             }
			          catch(ArithmeticException e) {
						System.out.println("다시입력하시오:");
						continue;
					}  
		    
		    }
		    else if(choice==2) {
			    int time;
		    	System.out.println("하루 1만 시간을 위해 투입하는 시간을 입력하시오:");
		    	try {
					  time=scanner.nextInt();
					  after1000Hourss(cal,time);
							
						} 
						catch  (InputMismatchException ime) {
							 scanner = new Scanner( System.in ); 
				             System.out.println("다시입력하시오:");
				              continue;
				             }
				          catch(ArithmeticException e) {
							System.out.println("다시입력하시오:");
							continue;
						}  
		    	
		    }
		    else if(choice==3) {
			    int time;
		    	System.out.println("하루 1만 시간을 위해 투입하는 시간을 입력하시오:");
		    	try {
					  time=scanner.nextInt();
					  after1000Hoursss(cal,time);
							
						} 
						catch  (InputMismatchException ime) {
							 scanner = new Scanner( System.in ); 
				             System.out.println("다시입력하시오:");
				              continue;
				             }
				          catch(ArithmeticException e) {
							System.out.println("다시입력하시오:");
							continue;
						}  
		    	
		    }
		    else if(choice==4) {
			    int time;
		    	System.out.println("하루 1만 시간을 위해 투입하는 시간을 입력하시오:");
		    	try {
					  time=scanner.nextInt();
					  after1000Hourssss(cal,time);
							
						} 
						catch  (InputMismatchException ime) {
							 scanner = new Scanner( System.in ); 
				             System.out.println("다시입력하시오:");
				              continue;
				             }
				          catch(ArithmeticException e) {
							System.out.println("다시입력하시오:");
							continue;
						}  
		    	
		    }
		    else {
		    	System.out.println("다시입력하시오:");
		    }
		    
		    }
		    
		}
		public static void after1000Hours(Calendar k, int time) {
	    	
			int a=(10000%time);
		    if(time<0) {
		    	System.out.println("다시입력하시오:");
		    }
	    	 
		    else if(time>24) {
		    	System.out.println("다시입력하시오:");
		    }
		    else  {
		    	 k.add(Calendar.DATE, (10000/time)-1);
		         SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		         
		             System.out.println(df.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
		    }
	

}
public static void after1000Hourss(Calendar k, int time) {
	    	
			int a=(10000%time);
		    if(time<0) {
		    	System.out.println("다시입력하시오:");
		    }
	    	 
		    else if(time>24) {
		    	System.out.println("다시입력하시오:");
		    }
		    else  {
		    	 k.add(Calendar.DATE, (10000/time)+((10000/7)*2)-1);
		         SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		         
		             System.out.println(df.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
		    }
}
public static void after1000Hoursss(Calendar k, int time) {
	
	int a=(10000%time);
    if(time<0) {
    	System.out.println("다시입력하시오:");
    }
	 
    else if(time>24) {
    	System.out.println("다시입력하시오:");
    }
    else  {
    	 k.add(Calendar.DATE, (10000/time)+((10000/7))-1);
         SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
         
             System.out.println(df.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
    }
}
public static void after1000Hourssss(Calendar k, int time) {
	
	int a=(10000%time);
    if(time<0) {
    	System.out.println("다시입력하시오:");
    }
	 
    else if(time>24) {
    	System.out.println("다시입력하시오:");
    }
    else  {
    	 k.add(Calendar.DATE, (10000/time)+((10000/7))-1);
         SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
         
             System.out.println(df.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
    }
}
}