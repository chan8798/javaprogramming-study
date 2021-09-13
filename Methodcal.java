package project;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.util.InputMismatchException;


public class Methodcal {
	public static void main(String args[]) {
	       
		Scanner scanner=new Scanner(System.in);
        Date now = Calendar.getInstance().getTime();
		
		System.out.println(now); 
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
	
		String formatedNow = formatter.format(now);
		
		
		System.out.println("현재시간은"+formatedNow);
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(new Date());
	   
	    int number;
	   
		System.out.println("더할 날수를 입력하세요");
		while (true) {
			try {
				number= scanner.nextInt();
				if(number>0) {
				break;
				}
				else {
					 System.out.println("0의외에 양의정수를 입력하시오: ");
					 continue;
				}
			}
			catch  (InputMismatchException ime) {
				scanner = new Scanner( System.in ); 
	             System.out.println("잘못 입력했습니다. 정수만 입력할 수 있어요. 다시입력하시오.");
	             
	             System.out.println(
	             ime.getClass().getName() + " 예외가 " + ime.getMessage() + " 때문에 발생했습니다. ");
					
				}
		}
		
		addDays(cal,number);
		
			
		
			
	    
	   int plusehour;
	 
	 
		System.out.println("더할 시간을 숫자로 입력하시오");
		while(true) {
			
		 try {
			plusehour=scanner.nextInt();
			if(plusehour>0) {
			break;
			}
			else {
				 System.out.println("0외의 양의정수를 입력하시오:");
				 continue;
			 }
		 }
		 catch  (InputMismatchException ime) {
				scanner = new Scanner( System.in ); 
	             System.out.println("잘못 입력했습니다. 정수만 입력할 수 있어요. 다시입력하시오.");
	             
	             System.out.println(
	             ime.getClass().getName() + " 예외가 " + ime.getMessage() + " 때문에 발생했습니다. ");
					
				}
		}
		
		
		addHours(cal,plusehour);
		
		
	
	    int time;
	
		System.out.println("하루 1만 시간을 위해 투입하는 시간을 입력하시오.");
		while(true) {
			try {
			 
		 time=scanner.nextInt();
		 if(time>0) {
		 break;
		 }
		 else {
			 System.out.println("하루에 학습은 꼭해야합니다. 다시입력하시오:");
			 continue;
		 }
	}
			catch  (InputMismatchException ime) {
				scanner = new Scanner( System.in ); 
	             System.out.println("잘못 입력했습니다. 정수만 입력할 수 있어요. 다시입력하시오.");
	             
	             System.out.println(
	             ime.getClass().getName() + " 예외가 " + ime.getMessage() + " 때문에 발생했습니다. ");
					
				}
			
			}
			
		if(time<=24) {
		after1000Hours(cal,time);
		
		}

		
		else  {
		System.out.println("하루는 24시간 입니다. 24보다 작은 수를 입력하시오");
		System.out.println("24보다 작은 정수를 입력하시오.");
		time=scanner.nextInt();
		after1000Hours(cal,time);
		}
	}
	
    public static void addDays(Calendar n,int m) {
    	n.add(Calendar.DATE, m);
    	SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
    	

		String[] week = {"일","월","화","수","목","금","토"};
		Date getDate; 
        try {
    	getDate = df.parse(df.format(n.getTime())); 
    	n.setTime(getDate); 
    	int w = n.get(Calendar.DAY_OF_WEEK)-1; 
    	System.out.println(m+"일을 더한 날짜는"+df.format(n.getTime())+ "이며, " + week[w] +"요일 입니다"); 
        } 
        catch (ParseException e) { 
        	e.printStackTrace(); 
        	} 
        catch (Exception e) { 
        	e.printStackTrace(); 
        	}
        

    }
    public static void addHours(Calendar n,int t) {
    	n.add(Calendar.HOUR, t);
    	SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd HH");
    	System.out.println("yyyyMMDD HH"+"-"+df.format(n.getTime()));
    	}
    public static void after1000Hours(Calendar k, int time) {
    	int a=(10000%time);
    	
    	
        k.add(Calendar.DATE, (10000/time)-1);
        SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        if(a==0) {
        
            System.out.println(df.format(k.getTime())+"에 종료된다.");
        
            }
            else {
            System.out.println(df.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
            }
     
    	}
    }
  

