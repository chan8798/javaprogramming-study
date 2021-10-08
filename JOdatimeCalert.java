import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTime;
import java.lang.NoClassDefFoundError;
import java.util.Scanner;
import org.joda.time.IllegalFieldValueException;
import java.lang.IllegalArgumentException;
import java.util.Date;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.Days;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;
public class JOdatimeCalert {
	public static void main(String args[]) {
		HashSet<LocalDate> ara = new HashSet();	// 1 2 3 4
		HashSet<LocalDate> arrr = new HashSet();
		HashSet<LocalDate> set = new HashSet();
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 날짜의 년도를 입력하시오");
		int year1=sc.nextInt();
		System.out.print("첫번째 날짜의 월를 입력하시오");
		int month1=sc.nextInt();
		System.out.print("첫번째 날짜의 일를 입력하시오.");
		int day1=sc.nextInt();
		
		 LocalDate date1 = new LocalDate(year1,month1 ,day1 );
	     System.out.println("Date1= " + date1);
	      
	     System.out.print("두번째 날짜의 년도를 입력하시오");
	     int year2=sc.nextInt();
		 System.out.print("두번째 날짜의 월를 입력하시오");
		 int month2=sc.nextInt();
		 System.out.print("두번째 날짜의 일를 입력하시오.");
		 int day2=sc.nextInt();
			
	     LocalDate date2 = new LocalDate(year2,month2 ,day2 );
		 System.out.println("Date2= " + date2);
		 
		 
		 System.out.print("1과31사이의 수를 입력하시오: ");
		 int day3=sc.nextInt();
		
		 for(int year=year1; year<=year2; year++) {
			  for(int i=0; i<12;i++) {
			         LocalDate date3 = new LocalDate(year, 1, day3);
				   	 
			         System.out.println(ara.add(date3.plusMonths(i)));
					 System.out.println(date3.plusMonths(i));
				        }
		 
		 
		 }
	    
		 int a= Days.daysBetween(new LocalDate(date1), new LocalDate(date2)).getDays(); 
		 System.out.print("입력하신 두 날짜의 차이는"+a+"입니다.\n");
		 
		 
		 for(int i=0; i<=a; i++) {
			 
			 System.out.print(arrr.add(date1.plusDays(i)));
			 System.out.println(date1.plusDays(i));
			
		 }
		 Iterator<LocalDate> it = arrr.iterator();
		 while(it.hasNext()) {
			 LocalDate temp = (LocalDate) it.next();
				if(ara.contains(temp)) { // 중복이 있는지 확인하기(생략가능)
					set.add(temp);
				}
			}
		
			
			System.out.println("두 날짜사이에 입력된 수의 일은"+set.size()+"개 입니다.");//set 크기 
		
	}
	

}
