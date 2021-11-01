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
			System.out.print("ù��° ��¥�� �⵵�� �Է��Ͻÿ�");
			int year1=sc.nextInt();
			System.out.print("ù��° ��¥�� ���� �Է��Ͻÿ�");
			int month1=sc.nextInt();
			System.out.print("ù��° ��¥�� �ϸ� �Է��Ͻÿ�.");
			int day1=sc.nextInt();
			
			 LocalDate date1 = new LocalDate(year1,month1 ,day1 );
		     System.out.println("Date1= " + date1);
		     
		     System.out.print("�ι�° ��¥�� �⵵�� �Է��Ͻÿ�");
		     int year2=sc.nextInt();
			 System.out.print("�ι�° ��¥�� ���� �Է��Ͻÿ�");
			 int month2=sc.nextInt();
			 System.out.print("�ι�° ��¥�� �ϸ� �Է��Ͻÿ�.");
			 int day2=sc.nextInt();
				
		     LocalDate date2 = new LocalDate(year2,month2 ,day2 );
			 System.out.println("Date2= " + date2);
			 int a= Days.daysBetween(new LocalDate(date1), new LocalDate(date2)).getDays();
			 if(a<0) {
				 System.out.println("�� ��¥�� �ٽ��Է��Ͻÿ�");
			 }
			 else if(a==0) {
				 System.out.println("�� ��¥�� �ٽ��Է��Ͻÿ�");
			 }
			 else {
			 
			 int dayOfWeek = date1.getDayOfWeek();

		        String dayOfWeekStr = "";
		        switch (dayOfWeek) {
		            case 1:
		                dayOfWeekStr = "������";
		                break;
		            case 2:
		                dayOfWeekStr = "ȭ����";
		                break;
		            case 3:
		                dayOfWeekStr = "������";
		                break;
		            case 4:
		                dayOfWeekStr = "�����";
		                break;
		            case 5:
		                dayOfWeekStr = "�ݿ���";
		                break;
		            case 6:
		                dayOfWeekStr = "�����";
		                break;
		            case 7:
		                dayOfWeekStr = "�Ͽ���";
		                break;
		        }
		        int dayOfWeekk = date2.getDayOfWeek();

		        String dayOfWeekStrr = "";
		        switch (dayOfWeek) {
		            case 1:
		                dayOfWeekStrr = "������";
		                break;
		            case 2:
		                dayOfWeekStrr = "ȭ����";
		                break;
		            case 3:
		                dayOfWeekStrr = "������";
		                break;
		            case 4:
		                dayOfWeekStrr = "�����";
		                break;
		            case 5:
		                dayOfWeekStrr = "�ݿ���";
		                break;
		            case 6:
		                dayOfWeekStrr = "�����";
		                break;
		            case 7:
		                dayOfWeekStrr = "�Ͽ���";
		                break;
		        }
		        /*System.out.println(dayOfWeekStr);*/
		        /*System.out.println(dayOfWeekStrr);*/
		       System.out.println("������ �Է��Ͻÿ�:");
		       String day=sc.next();
		       if(day.equals("������")) {
		    	   if(dayOfWeekStr=="������") {
		    	   
                   for(int year=year1; year<=year2; year++) {
		    		   for(int i=0; i<=a/7; i++ ) {
		    			   LocalDate date3 = new LocalDate(year, 1, day1);
		    			   ara.add(date3.plusDays(7*i));
		    			  
		    		   }
		    		   
		    		   
		    	   }
                   int d=ara.size();
    			   System.out.println("������ "+d+"�� �Դϴ�.");
                   
		    	   }
		    	   
		       
		    	   else if(dayOfWeekStr=="ȭ����") {
		    		for(int year=year1; year<=year2; year++) {
		    			
		    		   for(int i=1; i<=a/7; i++ ) {
		    			   LocalDate date3 = new LocalDate(year, 1, day1);
		    			   ara.add(date3.plusDays((7*i)-1));
		    			   
		    		   }
		    		   
		    		}
		    		int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
		    	   }
                   else if(dayOfWeekStr=="������") {
                	   for(int year=year1; year<=year2; year++) {
   		    			
    		    		   for(int i=1; i<=a/7; i++ ) {
    		    			   LocalDate date3 = new LocalDate(year, 1, day1);
    		    			   ara.add(date3.plusDays((7*i)-2));
    		    			  
    		    		   }
    		    		  
    		    		}
                	   int d=ara.size();
        			   System.out.println("������ "+d+"�� �Դϴ�.");
		    		   
		    	   }
                   else if(dayOfWeekStr=="�����") {
                	   for(int year=year1; year<=year2; year++) {
      		    			
    		    		   for(int i=1; i<=a/7; i++ ) {
    		    			   LocalDate date3 = new LocalDate(year, 1, day1);
    		    			   ara.add(date3.plusDays((7*i)-3));
    		    			 
    		    		   }
    		    		  
    		    		}
                	   int d=ara.size();
        			   System.out.println("������ "+d+"�� �Դϴ�.");
		    		   
		    	   }
                   else if(dayOfWeekStr=="�ݿ���") {
                	   for(int year=year1; year<=year2; year++) {
      		    			
    		    		   for(int i=1; i<=a/7; i++ ) {
    		    			   LocalDate date3 = new LocalDate(year, 1, day1);
    		    			   ara.add(date3.plusDays((7*i)-4));
    		    			
    		    		   }
    		    		}
                	   int d=ara.size();
        			   System.out.println("������ "+d+"�� �Դϴ�.");
		    		   
		    	   }
                   else if(dayOfWeekStr=="�����") {
                	   for(int year=year1; year<=year2; year++) {
      		    			
    		    		   for(int i=1; i<=a/7; i++ ) {
    		    			   LocalDate date3 = new LocalDate(year, 1, day1);
    		    			   ara.add(date3.plusDays((7*i)-5));
    		    			   
    		    		   }
    		    		  
    		    		}
                	   int d=ara.size();
        			   System.out.println("������ "+d+"�� �Դϴ�.");
		    		   
		    	   }
                   else if(dayOfWeekStr=="�Ͽ���") {
                	   for(int year=year1; year<=year2; year++) {
      		    			
    		    		   for(int i=1; i<=a/7; i++ ) {
    		    			   LocalDate date3 = new LocalDate(year, 1, day1);
    		    			   ara.add(date3.plusDays((7*i)-6));
    		    			  
    		    		   }
    		    		}
                	int d=ara.size();
    			   System.out.println("������ "+d+"�� �Դϴ�.");   
		    		   
		    	   }
		    	   
		    	  
		       }
		       else if(day.equals("ȭ����")) {
		    	   if(dayOfWeekStr=="������") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+1));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
		    	   else if(dayOfWeekStr=="ȭ����") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
		    	   else if(dayOfWeekStr=="������") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-1));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                   else if(dayOfWeekStr=="�����") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-2));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                   else if(dayOfWeekStr=="�ݿ���") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-3));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                   else if(dayOfWeekStr=="�����") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-4));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                  else if(dayOfWeekStr=="�Ͽ���") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-5));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
		    	   
		    	   
		       }
		       else if(day.equals("������")) {
                 if(dayOfWeekStr=="������") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+2));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                 else if(dayOfWeekStr=="ȭ����") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+1));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                 else if(dayOfWeekStr=="������") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                 else if(dayOfWeekStr=="�����") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-1));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                 else if(dayOfWeekStr=="�ݿ���") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-2));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                 else if(dayOfWeekStr=="�����") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-3));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                 else if(dayOfWeekStr=="�Ͽ���") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-4));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
              
		    	   
		       }
		       else if(day.equals("�����")) {
                   if(dayOfWeekStr=="������") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+3));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                   else if(dayOfWeekStr=="ȭ����") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+2));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                   else if(dayOfWeekStr=="������") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+1));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                   else if(dayOfWeekStr=="�����") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                   else if(dayOfWeekStr=="�ݿ���") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-1));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                  else if(dayOfWeekStr=="�����") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-2));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                  else if(dayOfWeekStr=="�Ͽ���") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-3));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
		    	   
                
		    	   
		       }
		       else if(day.equals("�ݿ���")) {
		    	   if(dayOfWeekStr=="������") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+4));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
		    	   else if(dayOfWeekStr=="ȭ����") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+3));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
		    	   else if(dayOfWeekStr=="������") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+2));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
		    	   else if(dayOfWeekStr=="�����") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+1));
			    			 
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
		    	   else if(dayOfWeekStr=="�ݿ���") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
		    	   else if(dayOfWeekStr=="�����") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-1));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                   else if(dayOfWeekStr=="�Ͽ���") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-2));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                  
			    	   
		    	   
                  
		       }
		       else if(day.equals("�����")) {
                   if(dayOfWeekStr=="������") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+5));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                   else if(dayOfWeekStr=="ȭ����") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+4));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                   else if(dayOfWeekStr=="������") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+3));
			    			 
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                   else if(dayOfWeekStr=="�����") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+2));
			    			 
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                   else if(dayOfWeekStr=="�ݿ���") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+1));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                   else if(dayOfWeekStr=="�����") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
                   else if(dayOfWeekStr=="�Ͽ���") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=1; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i-1));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
		    	   
                 
		    	   
		       }
		       else if(day.equals("�Ͽ���")) {
		    	   if(dayOfWeekStr=="������") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+6));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
		    	   else if(dayOfWeekStr=="ȭ����") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+5));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
		    	   else if(dayOfWeekStr=="������") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+4));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
		    	   else if(dayOfWeekStr=="�����") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+3));
			    			 
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
		    	   else if(dayOfWeekStr=="�ݿ���") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+2));
			    			
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
		    	   else if(dayOfWeekStr=="�����") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i+1));
			    			  
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
			    	   }
		    	   else if(dayOfWeekStr=="�Ͽ���") {
			    	   
	                   for(int year=year1; year<=year2; year++) {
			    		   for(int i=0; i<=a/7; i++ ) {
			    			   LocalDate date3 = new LocalDate(year, 1, day1);
			    			   ara.add(date3.plusDays(7*i));
			    			   
			    		   }
			    	   }
	                   int d=ara.size();
	    			   System.out.println("������ "+d+"�� �Դϴ�.");
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
				System.out.println("�ڿ����� �Է��Ͻÿ�:");
	              continue;
			} 
	
		
			}

	}

	}
