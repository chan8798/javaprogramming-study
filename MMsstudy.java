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
			    System.out.println("토요일,일요일에도 일한다.--->1를 입력");
				System.out.println("토요일,일요일은 쉰다.--->2를 입력");
				System.out.println("토요일에는 일하고,일요일은 쉰다.--->3를 입력");
				System.out.println("토요일 쉬고,일요일은 일 한다.--->4를 입력");
				System.out.println("프로그램 종료시--------------->5를 입력");
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
			    	System.out.println("하루 1만 시간을 위해 투입하는 시간을 입력하시오:");
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
			    	System.out.println("하루 1만 시간을 위해 투입하는 시간을 입력하시오:");
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
			    	System.out.println("하루 1만 시간을 위해 투입하는 시간을 입력하시오:");
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
			    	System.out.println("하루 1만 시간을 위해 투입하는 시간을 입력하시오:");
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
	    	System.out.println(today.plusDays(b-1)+" "+dayOfWeekStr);
	    	System.out.println(a+"시간의 추가시간이 남습니다.");
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
      if(dayOfWeekStr.equals("월요일")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  
    	  if(b%5==0) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/5)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    	  }
    	  else if(b%5==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/5)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==2) {
        	  System.out.println((today.plusDays(1)).plusDays(7*((b/5)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==3) {
        	  System.out.println((today.plusDays(2)).plusDays(7*((b/5)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==4) {
        	  System.out.println((today.plusDays(3)).plusDays(7*((b/5)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  
    	  
    	  
      }
      else if(dayOfWeekStr.equals("화요일")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%5==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/5)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%5==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/5)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==2) {
        	  System.out.println((today.plusDays(1)).plusDays(7*((b/5)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==3) {
        	  System.out.println((today.plusDays(2)).plusDays(7*((b/5)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==4) {
        	  System.out.println((today.plusDays(3)).plusDays(7*((b/5)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  
      }
      else if(dayOfWeekStr.equals("수요일")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%5==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/5)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%5==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/5)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==2) {
        	  System.out.println((today.plusDays(1)).plusDays(7*((b/5)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==3) {
        	  System.out.println((today.plusDays(2)).plusDays(7*((b/5)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==4) {
        	  System.out.println((today.plusDays(5)).plusDays(7*((b/5)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  
      }
      else if(dayOfWeekStr.equals("목요일")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%5==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/5)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%5==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/5)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==2) {
        	  System.out.println((today.plusDays(1)).plusDays(7*((b/5)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==3) {
        	  System.out.println((today.plusDays(4)).plusDays(7*((b/5)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==4) {
        	  System.out.println((today.plusDays(5)).plusDays(7*((b/5)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  
      }
      else if(dayOfWeekStr.equals("금요일")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%5==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/5)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%5==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/5)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==2) {
        	  System.out.println((today.plusDays(3)).plusDays(7*((b/5)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==3) {
        	  System.out.println((today.plusDays(4)).plusDays(7*((b/5)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==4) {
        	  System.out.println((today.plusDays(5)).plusDays(7*((b/5)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  
      }
      else if(dayOfWeekStr.equals("토요일")) {
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%5==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/5)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%5==1) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/5)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==2) {
        	  System.out.println((today.plusDays(3)).plusDays(7*((b/5)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==3) {
        	  System.out.println((today.plusDays(4)).plusDays(7*((b/5)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==4) {
        	  System.out.println((today.plusDays(5)).plusDays(7*((b/5)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  
      }
      else if(dayOfWeekStr.equals("일요일")) {
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  
    	  if(b%5==0) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/5)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%5==1) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/5)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==2) {
        	  System.out.println((today.plusDays(2)).plusDays(7*((b/5)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
          else if(b%5==3) {
        	  System.out.println((today.plusDays(3)).plusDays(7*((b/5)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    	  }
          else if(b%5==4) {
        	  System.out.println((today.plusDays(4)).plusDays(7*((b/5)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
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
      if(dayOfWeekStr.equals("월요일")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"토요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  
    	  
      }
      else if(dayOfWeekStr.equals("화요일")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"토요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  
      }
      else if(dayOfWeekStr.equals("수요일")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"토요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  
      }
      else if(dayOfWeekStr.equals("목요일")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"토요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
      }
      else if(dayOfWeekStr.equals("금요일")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"토요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
      }
      else if(dayOfWeekStr.equals("토요일")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"토요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
      }
      else if(dayOfWeekStr.equals("일요일")) {
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"토요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
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
      if(dayOfWeekStr.equals("월요일")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"일요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  
      } 
      else if(dayOfWeekStr.equals("화요일")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"일요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
       }
      else if(dayOfWeekStr.equals("수요일")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"일요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
       }
      else if(dayOfWeekStr.equals("목요일")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"일요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
   	   
      }
      else if(dayOfWeekStr.equals("금요일")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"일요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
   	   
      }
      else if(dayOfWeekStr.equals("토요일")) {
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  ara.add(today.plusDays(6));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(6)).plusDays(7*((b/6)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"일요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
   	   
      }
      else if(dayOfWeekStr.equals("일요일")) {
    	  ara.add(today.plusDays(0));
    	  ara.add(today.plusDays(1));
    	  ara.add(today.plusDays(2));
    	  ara.add(today.plusDays(3));
    	  ara.add(today.plusDays(4));
    	  ara.add(today.plusDays(5));
    	  
    	  if(b%6==0) {
    		  System.out.println((today.plusDays(5)).plusDays(7*((b/6)-1))+"금요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==1) {
    		  System.out.println((today.plusDays(0)).plusDays(7*((b/6)-1))+"일요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==2) {
    		  System.out.println((today.plusDays(1)).plusDays(7*((b/6)-1))+"월요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==3) {
    		  System.out.println((today.plusDays(2)).plusDays(7*((b/6)-1))+"화요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==4) {
    		  System.out.println((today.plusDays(3)).plusDays(7*((b/6)-1))+"수요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
    	  else if(b%6==5) {
    		  System.out.println((today.plusDays(4)).plusDays(7*((b/6)-1))+"목요일");
    		  System.out.println("추가로"+a+"시간이 남습니다.");
    		  
    	  }
   	   
      }
	}
	    	
}