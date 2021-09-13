import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class MethodCal {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
        Date now = Calendar.getInstance().getTime();
		
		System.out.println(now); 
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
	
		String formatedNow = formatter.format(now);
		
		
		System.out.println("현재시간은"+formatedNow);
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(new Date());
	    
		System.out.println("더할 날수를 입력하세요");
		int number= scanner.nextInt();
		addDays(cal,number);
		
		System.out.println("더할 시간을 숫자로 입력하시오");
		int plusehour=scanner.nextInt();
		addHours(cal,plusehour);
		
		System.out.println("하루 1만 시간을 위해 투입하는 시간을 입력하시오.<단 일요일에는 쉽니다.>");
		int Studytime=scanner.nextInt();
		after1000Hours(cal,Studytime);
		
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
        k.add(Calendar.DATE, (10000/(time*6)-1));
        SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(df.format(k.getTime())+"에 종료되며 추가로"+10000%(time*6)+"시간이 더 필요합니다.");
    }

}