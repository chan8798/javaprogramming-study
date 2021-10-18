import org.joda.time.LocalDate;
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
import java.util.InputMismatchException;
import java.lang.ArithmeticException;
import java.util.Collection;
public class MMsstudy {
	public static void main (String[] args) {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			   int choice;
			   LocalDate today = LocalDate.now();
			   HashSet<LocalDate> arrr = new HashSet();
			   HashSet<LocalDate> set = new HashSet();
			    System.out.println("�����,�Ͽ��Ͽ��� ���Ѵ�.--->1�� �Է�");
				System.out.println("�����,�Ͽ����� ����.--->2�� �Է�");
				System.out.println("����Ͽ��� ���ϰ�,�Ͽ����� ����.--->3�� �Է�");
				System.out.println("����� ����,�Ͽ����� �� �Ѵ�.--->4�� �Է�");
				System.out.println("���α׷� �����--------------->5�� �Է�");
			try {
				
				 choice=scanner.nextInt();
					
			}	
			catch  (InputMismatchException ime) {
				 scanner = new Scanner( System.in ); 
	             System.out.println("A selection that is out of condition. Please reenter.");
	              continue;
	             }	
			 if(choice==1){
				 int time;
			    	System.out.println("�Ϸ� 1�� �ð��� ���� �����ϴ� �ð��� �Է��Ͻÿ�:");
			    	try {
						  time=scanner.nextInt();
						  after1000Hourss(today ,time);
								
							} 
							catch  (InputMismatchException ime) {
								 scanner = new Scanner( System.in ); 
					             System.out.println("->I can't confirm it, please reenter it.");
					              continue;
					             }
					          catch(ArithmeticException e) {
								System.out.println("I can't confirm it, please reenter it.");
								continue;
							}  
				 
			 }
			 else if(choice==2) {
				  int time;
			    	System.out.println("�Ϸ� 1�� �ð��� ���� �����ϴ� �ð��� �Է��Ͻÿ�:");
			    	try {
						  time=scanner.nextInt();
						  after1000Hoursss(today, time);
								
							} 
							catch  (InputMismatchException ime) {
								 scanner = new Scanner( System.in ); 
					             System.out.println("->I can't confirm it, please reenter it.");
					              continue;
					             }
					          catch(ArithmeticException e) {
								System.out.println("->I can't confirm it, please reenter it.");
								continue;
							}  
				 
			 }
			 else if(choice==3) {
				   int time;
			    	System.out.println("�Ϸ� 1�� �ð��� ���� �����ϴ� �ð��� �Է��Ͻÿ�:");
			    	try {
						  time=scanner.nextInt();
						  after1000Hourssss(today ,time);
								
							} 
							catch  (InputMismatchException ime) {
								 scanner = new Scanner( System.in ); 
					             System.out.println("->I can't confirm it, please reenter it.");
					              continue;
					             }
					          catch(ArithmeticException e) {
								System.out.println("->I can't confirm it, please reenter it.");
								continue;
							}  
				 
			 }
			 else if(choice==4) {
				 int time;
			    	System.out.println("�Ϸ� 1�� �ð��� ���� �����ϴ� �ð��� �Է��Ͻÿ�:");
			    	try {
						  time=scanner.nextInt();
						  after1000Hoursssss(today ,time);
								
							} 
							catch  (InputMismatchException ime) {
								 scanner = new Scanner( System.in ); 
					             System.out.println("->I can't confirm it, please reenter it.");
					              continue;
					             }
					          catch(ArithmeticException e) {
								System.out.println("->I can't confirm it, please reenter it.");
								continue;
							}  
			    	
			    }	
			 else if(choice==5) {
			    	
			    	break;
			    }
			 else {
			    	System.out.println("A selection that is out of condition. Please reenter.");
			    }
			}	
			System.out.println("Exit the program.");
				}
	public static void after1000Hourss(LocalDate today, int time) {
		int a=(10000%time);
		int b=(10000/time);
	    if(time<0) {
	    	System.out.println("->I can't confirm it, please reenter it.");
	    }
    	 
	    else if(time>24) {
	    	System.out.println("->I can't confirm it, please reenter it.");
	    }
	    else {
	    	int dayOfWeek = today.plusDays(b-1).getDayOfWeek();  
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
	    	System.out.println(today.plusDays(b-1)+" "+dayOfWeekStr);
	    	System.out.println(a+"�ð��� �߰��ð��� �����ϴ�.");
	    	   }
	}
	public static void after1000Hoursss(LocalDate today, int time) {
		int a=(10000%time);
		int b=(10000/time);
		 if(time<0) {
		    	System.out.println("->I can't confirm it, please reenter it.");
		    }
	    	 
		    else if(time>24) {
		    	System.out.println("->I can't confirm it, please reenter it.");
		    }
		HashSet<LocalDate> ara = new HashSet();	
		int dayOfWeek = today.getDayOfWeek();  
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
      if(dayOfWeekStr.equals("������")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  
    	  if(b%5==0) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/5)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    	  }
    	  else if(b%5==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/5)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==2) {
        	  System.out.println((today.plusDays(1)).plusDays(7*((b/5)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==3) {
        	  System.out.println((today.plusDays(2)).plusDays(7*((b/5)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==4) {
        	  System.out.println((today.plusDays(3)).plusDays(7*((b/5)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  
    	  
    	  
      }
      else if(dayOfWeekStr.equals("ȭ����")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%5==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/5)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%5==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/5)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==2) {
        	  System.out.println((today.plusDays(1)).plusDays(7*((b/5)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==3) {
        	  System.out.println((today.plusDays(2)).plusDays(7*((b/5)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==4) {
        	  System.out.println((today.plusDays(3)).plusDays(7*((b/5)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  
      }
      else if(dayOfWeekStr.equals("������")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%5==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/5)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%5==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/5)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==2) {
        	  System.out.println((today.plusDays(1)).plusDays(7*((b/5)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==3) {
        	  System.out.println((today.plusDays(2)).plusDays(7*((b/5)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==4) {
        	  System.out.println((today.plusDays(5)).plusDays(7*((b/5)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  
      }
      else if(dayOfWeekStr.equals("�����")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%5==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/5)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%5==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/5)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==2) {
        	  System.out.println((today.plusDays(1)).plusDays(7*((b/5)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==3) {
        	  System.out.println((today.plusDays(4)).plusDays(7*((b/5)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==4) {
        	  System.out.println((today.plusDays(5)).plusDays(7*((b/5)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  
      }
      else if(dayOfWeekStr.equals("�ݿ���")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%5==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/5)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%5==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/5)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==2) {
        	  System.out.println((today.plusDays(3)).plusDays(7*((b/5)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==3) {
        	  System.out.println((today.plusDays(4)).plusDays(7*((b/5)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==4) {
        	  System.out.println((today.plusDays(5)).plusDays(7*((b/5)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  
      }
      else if(dayOfWeekStr.equals("�����")) {
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%5==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/5)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%5==1) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/5)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==2) {
        	  System.out.println((today.plusDays(3)).plusDays(7*((b/5)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==3) {
        	  System.out.println((today.plusDays(4)).plusDays(7*((b/5)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==4) {
        	  System.out.println((today.plusDays(5)).plusDays(7*((b/5)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  
      }
      else if(dayOfWeekStr.equals("�Ͽ���")) {
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  
    	  if(b%5==0) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/5)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%5==1) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/5)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==2) {
        	  System.out.println((today.plusDays(2)).plusDays(7*((b/5)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
          else if(b%5==3) {
        	  System.out.println((today.plusDays(3)).plusDays(7*((b/5)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    	  }
          else if(b%5==4) {
        	  System.out.println((today.plusDays(4)).plusDays(7*((b/5)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    	  }
    	  
    
    	 
      }
      
}
	public static void after1000Hourssss(LocalDate today, int time) {
		int a=(10000%time);
		int b=(10000/time);
		 if(time<0) {
		    	System.out.println("->I can't confirm it, please reenter it.");
		    }
	    	 
		    else if(time>24) {
		    	System.out.println("->I can't confirm it, please reenter it.");
		    }
		HashSet<LocalDate> ara = new HashSet();	
		int dayOfWeek = today.getDayOfWeek();  
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
      if(dayOfWeekStr.equals("������")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  
    	  
      }
      else if(dayOfWeekStr.equals("ȭ����")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  
      }
      else if(dayOfWeekStr.equals("������")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  
      }
      else if(dayOfWeekStr.equals("�����")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
      }
      else if(dayOfWeekStr.equals("�ݿ���")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
      }
      else if(dayOfWeekStr.equals("�����")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
      }
      else if(dayOfWeekStr.equals("�Ͽ���")) {
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
      }
      
		
	}
    public static void after1000Hoursssss(LocalDate today, int time) {
    	int a=(10000%time);
		int b=(10000/time);
		 if(time<0) {
		    	System.out.println("->I can't confirm it, please reenter it.");
		    }
	    	 
		    else if(time>24) {
		    	System.out.println("->I can't confirm it, please reenter it.");
		    }
		HashSet<LocalDate> ara = new HashSet();	
		int dayOfWeek = today.getDayOfWeek();  
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
      if(dayOfWeekStr.equals("������")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"�Ͽ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  
      } 
      else if(dayOfWeekStr.equals("ȭ����")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"�Ͽ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
       }
      else if(dayOfWeekStr.equals("������")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"�Ͽ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
       }
      else if(dayOfWeekStr.equals("�����")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"�Ͽ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
   	   
      }
      else if(dayOfWeekStr.equals("�ݿ���")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"�Ͽ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
   	   
      }
      else if(dayOfWeekStr.equals("�����")) {
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"�Ͽ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
   	   
      }
      else if(dayOfWeekStr.equals("�Ͽ���")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"�ݿ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"�Ͽ���");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"ȭ����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"������");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"�����");
    		  System.out.println("�߰���"+a+"�ð��� �����ϴ�.");
    		  
    	  }
   	   
      }
	}
	    	
}