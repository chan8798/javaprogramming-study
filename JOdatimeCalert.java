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
		 
		 
		 System.out.print("1��31������ ���� �Է��Ͻÿ�: ");
		 int day3=sc.nextInt();
		
		 for(int year=year1; year<=year2; year++) {
			  for(int i=0; i<12;i++) {
			         LocalDate date3 = new LocalDate(year, 1, day3);
				   	 
			         System.out.println(ara.add(date3.plusMonths(i)));
					 System.out.println(date3.plusMonths(i));
				        }
		 
		 
		 }
	    
		 int a= Days.daysBetween(new LocalDate(date1), new LocalDate(date2)).getDays(); 
		 System.out.print("�Է��Ͻ� �� ��¥�� ���̴�"+a+"�Դϴ�.\n");
		 
		 
		 for(int i=0; i<=a; i++) {
			 
			 System.out.print(arrr.add(date1.plusDays(i)));
			 System.out.println(date1.plusDays(i));
			
		 }
		 Iterator<LocalDate> it = arrr.iterator();
		 while(it.hasNext()) {
			 LocalDate temp = (LocalDate) it.next();
				if(ara.contains(temp)) { // �ߺ��� �ִ��� Ȯ���ϱ�(��������)
					set.add(temp);
				}
			}
		
			
			System.out.println("�� ��¥���̿� �Էµ� ���� ����"+set.size()+"�� �Դϴ�.");//set ũ�� 
		
	}
	

}
