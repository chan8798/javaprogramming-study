import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTime;
import java.util.Scanner;
import java.util.Set;
import org.joda.time.IllegalFieldValueException;
import java.lang.IllegalArgumentException;
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
import java.util.InputMismatchException;
public class project1 {
	public static void main(String args[]) {
		while(true) {
			try {
			HashSet<LocalDate> ara = new HashSet();	
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
			 int a= Days.daysBetween(new LocalDate(date1), new LocalDate(date2)).getDays();
			 if(a<0) {
				 System.out.println("두 날짜를 다시입력하시오");
			 }
			 else if(a==0) {
				 System.out.println("두 날짜를 다시입력하시오");
			 }
			 else {
			 
			 int dayOfWeek = date1.getDayOfWeek();

		        String dayOfWeekStr = "";
		        switch (dayOfWeek) {
		            case 1:
		                dayOfWeekStr = "월요일";
		                break;
		            case 2:
		                dayOfWeekStr = "화요일";
		                break;
		            case 3:
		                dayOfWeekStr = "수요일";
		                break;
		            case 4:
		                dayOfWeekStr = "목요일";
		                break;
		            case 5:
		                dayOfWeekStr = "금요일";
		                break;
		            case 6:
		                dayOfWeekStr = "토요일";
		                break;
		            case 7:
		                dayOfWeekStr = "일요일";
		                break;
		        }
		        int dayOfWeekk = date2.getDayOfWeek();

		        String dayOfWeekStrr = "";
		        switch (dayOfWeek) {
		            case 1:
		                dayOfWeekStrr = "월요일";
		                break;
		            case 2:
		                dayOfWeekStrr = "화요일";
		                break;
		            case 3:
		                dayOfWeekStrr = "수요일";
		                break;
		            case 4:
		                dayOfWeekStrr = "목요일";
		                break;
		            case 5:
		                dayOfWeekStrr = "금요일";
		                break;
		            case 6:
		                dayOfWeekStrr = "토요일";
		                break;
		            case 7:
		                dayOfWeekStrr = "일요일";
		                break;
		        }
		        /*System.out.println(dayOfWeekStr);*/
		        /*System.out.println(dayOfWeekStrr);*/
		       System.out.println("요일을 입력하시오:");
		       String day=sc.next();
		       if(day.equals("월요일")) {
		    	   if(dayOfWeekStr=="월요일") {
		    	   
                   for(int year=year1; year<=year2; year++) {
		    		   for(int i=0; i<=a/7; i++ ) {
		    			   LocalDate date3 = new LocalDate(year, 1, day1);
		    			   ara.add(date3.plusDays(7*i));
		    			  
		    		   }
		    		   
		    		   
		    	   }
                   int d=ara.size();
    			   System.out.println("개수는 "+d+"개 입니다.");
                   
		    	   }
		    	   
		       
		    	   else if(dayOfWeekStr=="화요일") {
		    		for(int year=year1; year<=year2; year++) {
		    			
		    		   for(int i=1; i<=a/7; i++ ) {
		    			   LocalDate date3 = new LocalDate(year, 1, day1);
		    			   ara.add(date3.plusDays((7*i)-1));
		    			   
		    		   }
		    		   
		    		}
		    		int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
		    	   }
                   else if(dayOfWeekStr=="수요일") {
                	   for(int year=year1; year<=year2; year++) {
   		    			
    		    		   for(int i=1; i<=a/7; i++ ) {
    		    			   LocalDate date3 = new LocalDate(year, 1, day1);
    		    			   ara.add(date3.plusDays((7*i)-2));
    		    			  
    		    		   }
    		    		  
    		    		}
                	   int d=ara.size();
        			   System.out.println("개수는 "+d+"개 입니다.");
		    		   
		    	   }
                   else if(dayOfWeekStr=="목요일") {
                	   for(int year=year1; year<=year2; year++) {
      		    			
    		    		   for(int i=1; i<=a/7; i++ ) {
    		    			   LocalDate date3 = new LocalDate(year, 1, day1);
    		    			   ara.add(date3.plusDays((7*i)-3));
    		    			 
    		    		   }
    		    		  
    		    		}
                	   int d=ara.size();
        			   System.out.println("개수는 "+d+"개 입니다.");
		    		   
		    	   }
                   else if(dayOfWeekStr=="금요일") {
                	   for(int year=year1; year<=year2; year++) {
      		    			
    		    		   for(int i=1; i<=a/7; i++ ) {
    		    			   LocalDate date3 = new LocalDate(year, 1, day1);
    		    			   ara.add(date3.plusDays((7*i)-4));
    		    			
    		    		   }
    		    		}
                	   int d=ara.size();
        			   System.out.println("개수는 "+d+"개 입니다.");
		    		   
		    	   }
                   else if(dayOfWeekStr=="토요일") {
                	   for(int year=year1; year<=year2; year++) {
      		    			
    		    		   for(int i=1; i<=a/7; i++ ) {
    		    			   LocalDate date3 = new LocalDate(year, 1, day1);
    		    			   ara.add(date3.plusDays((7*i)-5));
    		    			   
    		    		   }
    		    		  
    		    		}
                	   int d=ara.size();
        			   System.out.println("개수는 "+d+"개 입니다.");
		    		   
		    	   }
                   else if(dayOfWeekStr=="일요일") {
                	   for(int year=year1; year<=year2; year++) {
      		    			
    		    		   for(int i=1; i<=a/7; i++ ) {
    		    			   LocalDate date3 = new LocalDate(year, 1, day1);
    		    			   ara.add(date3.plusDays((7*i)-6));
    		    			  
    		    		   }
    		    		}
                	int d=ara.size();
    			   System.out.println("개수는 "+d+"개 입니다.");   
		    		   
		    	   }
		    	   
		    	  
		       }
		       else if(day.equals("화요일")) {
		    	   if(dayOfWeekStr=="월요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+1));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
		    	   else if(dayOfWeekStr=="화요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
		    	   else if(dayOfWeekStr=="수요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-1));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                   else if(dayOfWeekStr=="목요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-2));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                   else if(dayOfWeekStr=="금요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-3));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                   else if(dayOfWeekStr=="토요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-4));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                  else if(dayOfWeekStr=="일요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-5));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
		    	   
		    	   
		       }
		       else if(day.equals("수요일")) {
                 if(dayOfWeekStr=="월요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+2));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                 else if(dayOfWeekStr=="화요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+1));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                 else if(dayOfWeekStr=="수요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                 else if(dayOfWeekStr=="목요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-1));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                 else if(dayOfWeekStr=="금요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-2));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                 else if(dayOfWeekStr=="토요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-3));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                 else if(dayOfWeekStr=="일요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-4));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
              
		    	   
		       }
		       else if(day.equals("목요일")) {
                   if(dayOfWeekStr=="월요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+3));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                   else if(dayOfWeekStr=="화요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+2));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                   else if(dayOfWeekStr=="수요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+1));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                   else if(dayOfWeekStr=="목요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                   else if(dayOfWeekStr=="금요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-1));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                  else if(dayOfWeekStr=="토요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-2));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                  else if(dayOfWeekStr=="일요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-3));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
		    	   
                
		    	   
		       }
		       else if(day.equals("금요일")) {
		    	   if(dayOfWeekStr=="월요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+4));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
		    	   else if(dayOfWeekStr=="화요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+3));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
		    	   else if(dayOfWeekStr=="수요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+2));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
		    	   else if(dayOfWeekStr=="목요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+1));
			    			 
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
		    	   else if(dayOfWeekStr=="금요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
		    	   else if(dayOfWeekStr=="토요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-1));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                   else if(dayOfWeekStr=="일요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-2));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                  
			    	   
		    	   
                  
		       }
		       else if(day.equals("토요일")) {
                   if(dayOfWeekStr=="월요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+5));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                   else if(dayOfWeekStr=="화요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+4));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                   else if(dayOfWeekStr=="수요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+3));
			    			 
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                   else if(dayOfWeekStr=="목요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+2));
			    			 
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                   else if(dayOfWeekStr=="금요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+1));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                   else if(dayOfWeekStr=="토요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
                   else if(dayOfWeekStr=="일요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-1));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
		    	   
                 
		    	   
		       }
		       else if(day.equals("일요일")) {
		    	   if(dayOfWeekStr=="월요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+6));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
		    	   else if(dayOfWeekStr=="화요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+5));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
		    	   else if(dayOfWeekStr=="수요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+4));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
		    	   else if(dayOfWeekStr=="목요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+3));
			    			 
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
		    	   else if(dayOfWeekStr=="금요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+2));
			    			
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
		    	   else if(dayOfWeekStr=="토요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+1));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
		    	   else if(dayOfWeekStr=="일요일") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("개수는 "+d+"개 입니다.");
			    	   }
		  }
		       else {
		    	   System.out.println("please re-enter ");
		       }
			 }
			}
		     catch  (IllegalFieldValueException ime) {
					
	             System.out.println("A selection that is out of condition. Please reenter.");
	              continue;
	             }
        
			 catch (IllegalArgumentException ime) {
	    	
	    	   System.out.println("A selection that is out of condition. Please reenter.");
	              continue;
	       }
			catch(InputMismatchException ime) {
				System.out.println("자연수로 입력하시오:");
	              continue;
			} 
	
		
			}

	}

	}
