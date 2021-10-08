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
		 /*System.out.print("�Է��Ͻ� �� ��¥�� ���̴�"+a+"�Դϴ�.\n");*/
		 if(a<0) {
			 System.out.println("Date1>Date2�̱� ������ Date1���� �ٽ��Է����ּ���");
             continue;
		 }
		
		 else {
			 System.out.print("1��31������ ���� �Է��Ͻÿ�: ");
			 int day3=sc.nextInt();
			 if(day3==29) {
	           for(int year=year1; year<=year2; year++) {
				 LocalDate date3 = new LocalDate(year, 1, day3);
				 
				if(year%4==0) /*�����϶�*/{
					for(int i=0; i<12;i++) {
				        ara.add(date3.plusMonths(i));
				        
				        }
	           }
				else if(year%4!=0)/*������ �ƴҶ�*/ {
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
				System.out.println("�ڿ����� �Է��Ͻÿ�:");
	              continue;
			} 
		}
	 
	}
           public static void SolveList(HashSet<LocalDate> k,HashSet<LocalDate> b) {
			Set<LocalDate> intersection = new HashSet<LocalDate>(k);
            intersection.retainAll(b);
            /*System.out.println("Intersection: " + intersection);*/
            System.out.println("�ݺ��Ǵ� ���� ������"+(intersection.size())+"�Դϴ�.");  
            
		}	
			 
	}		 		        
					        
					        
					        
				
			
			 
			
		
		
		
			
	
	

		
		
		
		
		  
	
		
		


