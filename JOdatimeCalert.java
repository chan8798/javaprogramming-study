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
public class JOdatimeCalert {
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
		 /*System.out.print("입력하신 두 날짜의 차이는"+a+"입니다.\n");*/
		 if(a<0) {
			 System.out.println("Date1>Date2이기 때문에 Date1부터 다시입력해주세요");
             continue;
		 }
		
		 else {
			 System.out.print("1과31사이의 수를 입력하시오: ");
			 int day3=sc.nextInt();
			 if(day3==29) {
	           for(int year=year1; year<=year2; year++) {
				 LocalDate date3 = new LocalDate(year, 1, day3);
				 
				if(year%4==0) /*윤년일때*/{
					for(int i=0; i<12;i++) {
				        ara.add(date3.plusMonths(i));
				        
				        }
	           }
				else if(year%4!=0)/*윤년이 아닐때*/ {
			        for(int i=0; i<1;i++) {
			        ara.add(date3.plusMonths(i));
			        
			        }
			        for(int i=2; i<12;i++) {
			      
			   	 
				 ara.add(date3.plusMonths(i));
				 
			        }
			 }
	           }
			 }
				 else if(day3==30) {

					 for(int year=year1; year<=year2; year++) {
					 LocalDate date3 = new LocalDate(year, 1, day3);
					
				        ara.add(date3.plusMonths(3));
				        ara.add(date3.plusMonths(5));
				        ara.add(date3.plusMonths(8));
				        ara.add(date3.plusMonths(10));
				    }
				}	    
				        
				        
				        
				 
				 
				 else if(day3==31) {
					 for(int year=year1; year<=year2; year++) {
						 LocalDate date3 = new LocalDate(year, 1, day3);
						 
						    ara.add(date3.plusMonths(0));
					        ara.add(date3.plusMonths(2));
					        ara.add(date3.plusMonths(4));
					        ara.add(date3.plusMonths(6));
					        ara.add(date3.plusMonths(7));
					        ara.add(date3.plusMonths(9));
					        ara.add(date3.plusMonths(11));
					 }      	
				 }  
					     
			     else {
			    	 
			 for(int year=year1; year<=year2; year++) {
				  for(int i=0; i<12;i++) {
				         LocalDate date3 = new LocalDate(year, 1, day3);
				         ara.add(date3.plusMonths(i));
				     }   		       
			 }
			}
			 for(int i=0; i<=a; i++) {
				 arrr.add(date1.plusDays(i));
				
			}		 
			  SolveList(ara,arrr);
		    
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
           public static void SolveList(HashSet<LocalDate> k,HashSet<LocalDate> b) {
			Set<LocalDate> intersection = new HashSet<LocalDate>(k);
            intersection.retainAll(b);
            /*System.out.println("Intersection: " + intersection);*/
            System.out.println("반복되는 수의 개수는"+(intersection.size())+"입니다.");  
            
		}	
			 
	}		 		        
					        
					        
					        
				
			
			 
			
		
		
		
			
	
	

		
		
		
		
		  
	
		
		


