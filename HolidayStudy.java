package project;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;


public class HolidayStudy {
	public static void main(String args[])  {
		Scanner scanner=new Scanner(System.in);
		
			
	       
			
		
			 while(true) {
			 
			int choice;
			Date now = Calendar.getInstance().getTime();
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy"+"년"+"MM"+"월"+"dd"+"일"+"HH"+"시"+"mm"+"분"+"ss"+"초");
		    String formatedNow = formatter.format(now);
		
		    System.out.println("-----------------------------------");
		    System.out.println("           현재시간은           ");
			System.out.println("-->"+formatedNow+"<--");
			
			System.out.println("-----------------------------------");
			
			
			
		 
		    
		    System.out.println("   다음<조건>을 참조하고 입력하시오");
		    
		    System.out.println("============<조 건>=============");
		    System.out.println("토요일,일요일 공부한다.      ->1를 입력");
	    	System.out.println("토요일,일요일 쉰다.         ->2를 입력");
	    	System.out.println("토요일엔 공부하고 일요일엔 쉰다.->3를 입력");
	    	System.out.println("일요일엔 공부하고 토요일엔 쉰다.->4를 입력");
	    	System.out.println("================================");
		    
		    try {
				  choice=scanner.nextInt();
						
				  
				  
					} 
					catch  (InputMismatchException ime) {
						 scanner = new Scanner( System.in ); 
			             System.out.println("A selection that is out of condition. Please reenter.");
			              continue;
			             }
			       
		    
		    if(choice==1) { 
		    int time;
	    	System.out.println("하루 1만 시간을 위해 투입하는 시간을 입력하시오:");
	    	try {
				  time=scanner.nextInt();
			      after1000Hours(cal,time);
						
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
					  after1000Hourss(cal,time);
							
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
					  after1000Hoursss(cal,time);
							
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
					  after1000Hourssss(cal,time);
							
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
		    else {
		    	System.out.println("A selection that is out of condition. Please reenter.");
		    }
		    
		    }
		}
		
		public static void after1000Hours(Calendar k, int time) {
	    	
			int a=(10000%time);
		    if(time<0) {
		    	System.out.println("->I can't confirm it, please reenter it.");
		    }
	    	 
		    else if(time>24) {
		    	System.out.println("->I can't confirm it, please reenter it.");
		    }
		    else  {
		    	 k.add(Calendar.DATE, (10000/time)-1);
		         SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		         
		             System.out.println(df.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
		    }
	

}
		
public static void after1000Hourss(Calendar k, int time) {
	    	
			int a=(10000%time);
		    if(time<0) {
		    	System.out.println("->I can't confirm it, please reenter it.");
		    }
	    	 
		    else if(time>24) {
		    	System.out.println("->I can't confirm it, please reenter it.");
		    }
		    else  {
		    	if(((10000/time/7)/7/7/7)>=1&&((10000/time/7)/7/7/7)<=7){
		    		 k.getTime();
		    		 k.add(Calendar.DATE, (10000/time)+((10000/time/7))+(((10000/time/7))/7)+(((10000/time/7))/7/7)+(((10000/time/7))/7/7/7)-1);
			         SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
			         SimpleDateFormat dc= new SimpleDateFormat("E요일");
				       
				     dc.format(k.getTime());
			         df.format(k.getTime());
			         
			         if(dc.format(k.getTime()).equals("일요일")) {
				    	    k.getTime();
				    		k.add(Calendar.DATE, 2);
					        SimpleDateFormat dfa = new SimpleDateFormat("yyyy년 MM월 dd일");
					        SimpleDateFormat dca= new SimpleDateFormat("E요일");
					        System.out.println(dfa.format(k.getTime()));
					        System.out.println(dca.format(k.getTime()));
				      }
				      else if(dc.format(k.getTime()).equals("토요일")) {
				    	    k.getTime();
				    		k.add(Calendar.DATE, 2);
					        SimpleDateFormat dfa = new SimpleDateFormat("yyyy년 MM월 dd일");
					        SimpleDateFormat dca= new SimpleDateFormat("E요일");
					        System.out.println(dfa.format(k.getTime()));
					        System.out.println(dca.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
				      }
				      else if(dc.format(k.getTime()).equals("월요일")) {
				    	     System.out.println(df.format(k.getTime()));
						     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
				        
				      }
				      else if(dc.format(k.getTime()).equals("화요일")) {
				    	     System.out.println(df.format(k.getTime()));
						     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
				        
				      }
				      else if(dc.format(k.getTime()).equals("수요일")) {
				    	     System.out.println(df.format(k.getTime()));
						     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
				        
				      }
				      else if(dc.format(k.getTime()).equals("목요일")) {
				    	     System.out.println(df.format(k.getTime()));
						     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
				        
				      }
				      else if(dc.format(k.getTime()).equals("금요일")) {
				    	     System.out.println(df.format(k.getTime()));
						     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
				        
				      }
		
			         
			        
			         
			        
			          
		    		
		    	}
		    	else if(((10000/time)/7/7/7)>=1&&((10000/time)/7/7/7)<=7){
		    			
		    		k.getTime();
		    		k.add(Calendar.DATE, (10000/time)+((10000/time/7))+(10000/time/7/7)+(10000/time/7/7/7)-1);
			        SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
			        SimpleDateFormat dc= new SimpleDateFormat("E요일");
			        df.format(k.getTime());
			        dc.format(k.getTime());
			        
			        
			      if(dc.format(k.getTime()).equals("일요일")) {
			    	    k.getTime();
			    		k.add(Calendar.DATE, 2);
				        SimpleDateFormat dfa = new SimpleDateFormat("yyyy년 MM월 dd일");
				        SimpleDateFormat dca= new SimpleDateFormat("E요일");
				        System.out.println(dfa.format(k.getTime()));
				        System.out.println(dca.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
			      }
			      else if(dc.format(k.getTime()).equals("토요일")) {
			    	    k.getTime();
			    		k.add(Calendar.DATE, 2);
				        SimpleDateFormat dfa = new SimpleDateFormat("yyyy년 MM월 dd일");
				        SimpleDateFormat dca= new SimpleDateFormat("E요일");
				        System.out.println(dfa.format(k.getTime()));
				        System.out.println(dca.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
			      }
			      else if(dc.format(k.getTime()).equals("월요일")) {
			    	     System.out.println(df.format(k.getTime()));
					     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
			        
			      }
			      else if(dc.format(k.getTime()).equals("화요일")) {
			    	     System.out.println(df.format(k.getTime()));
					     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
			        
			      }
			      else if(dc.format(k.getTime()).equals("수요일")) {
			    	     System.out.println(df.format(k.getTime()));
					     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
			        
			      }
			      else if(dc.format(k.getTime()).equals("목요일")) {
			    	     System.out.println(df.format(k.getTime()));
					     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
			        
			      }
			      else if(dc.format(k.getTime()).equals("금요일")) {
			    	     System.out.println(df.format(k.getTime()));
					     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
			        
			      }
	
		    	
		    	}
		    	else if((10000/time/7)/7>=1&&(10000/time/7)/7<=7){
		    		 k.getTime();
			         k.add(Calendar.DATE, (10000/time)+((10000/time/7))+(((10000/time/7))/7)-1);
				     SimpleDateFormat dfq = new SimpleDateFormat("yyyy년 MM월 dd일 ");
			         SimpleDateFormat dcw= new SimpleDateFormat("E요일");   
				     dcw.format(k.getTime());
			         dfq.format(k.getTime());
			         
			         if(dcw.format(k.getTime()).equals("일요일")) {
				    	    k.getTime();
				    		k.add(Calendar.DATE, 2);
					        SimpleDateFormat dfa = new SimpleDateFormat("yyyy년 MM월 dd일");
					        SimpleDateFormat dca= new SimpleDateFormat("E요일");
					        System.out.println(dfa.format(k.getTime()));
					        System.out.println(dca.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
				      }
				      else if(dfq.format(k.getTime()).equals("토요일")) {
				    	    k.getTime();
				    		k.add(Calendar.DATE, 2);
					        SimpleDateFormat dfa = new SimpleDateFormat("yyyy년 MM월 dd일");
					        SimpleDateFormat dca= new SimpleDateFormat("E요일");
					        System.out.println(dfa.format(k.getTime()));
					        System.out.println(dca.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
				      }
				      else if(dcw.format(k.getTime()).equals("월요일")) {
				    	     System.out.println(dfq.format(k.getTime()));
						     System.out.println(dcw.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
				        
				      }
				      else if(dcw.format(k.getTime()).equals("화요일")) {
				    	     System.out.println(dfq.format(k.getTime()));
						     System.out.println(dcw.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
				        
				      }
				      else if(dcw.format(k.getTime()).equals("수요일")) {
				    	     System.out.println(dfq.format(k.getTime()));
						     System.out.println(dcw.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
				        
				      }
				      else if(dcw.format(k.getTime()).equals("목요일")) {
				    	     System.out.println(dfq.format(k.getTime()));
						     System.out.println(dcw.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
				        
				      }
				      else if(dcw.format(k.getTime()).equals("금요일")) {
				    	     System.out.println(dfq.format(k.getTime()));
						     System.out.println(dcw.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
				        
				      }
			         
			         
			         
		    	}
		    		
		    	}
		    	 
		    }

public static void after1000Hoursss(Calendar k, int time) {
	
	int a=(10000%time);
    if(time<0) {
    	System.out.println("->I can't confirm it, please reenter it.");
    }
	 
    else if(time>24) {
    	System.out.println("->I can't confirm it, please reenter it.");
    }
    else  {
      if(10000/time/14/14/14>=1&&10000/time/14/14/14<=7){
 			
     		k.getTime();
     		k.add(Calendar.DATE, (10000/time)+((10000/time/14))+(10000/time/14/14)+(10000/time/14/14/14)-1);
 	        SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
 	        SimpleDateFormat dc= new SimpleDateFormat("E요일");
 	        df.format(k.getTime());
 	        dc.format(k.getTime());
 	        
 	        
 	      if(dc.format(k.getTime()).equals("토요일")) {
 	    	 System.out.println(df.format(k.getTime()));
			 System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 	      }
 	      else if(dc.format(k.getTime()).equals("일요일")) {
 	    	    k.getTime();
	    		k.add(Calendar.DATE, 1);
		        SimpleDateFormat dfa = new SimpleDateFormat("yyyy년 MM월 dd일");
		        SimpleDateFormat dca= new SimpleDateFormat("E요일");
		        System.out.println(dfa.format(k.getTime()));
		        System.out.println(dca.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 	      }
 	      else if(dc.format(k.getTime()).equals("월요일")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 	        
 	      }
 	      else if(dc.format(k.getTime()).equals("화요일")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 	        
 	      }
 	      else if(dc.format(k.getTime()).equals("수요일")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 	        
 	      }
 	      else if(dc.format(k.getTime()).equals("목요일")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 	        
 	      }
 	      else if(dc.format(k.getTime()).equals("금요일")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 	        
 	      }

     	
     	}
     	else if(10000/time/14/14>=1&& 10000/time/14/14<=7){
     		 k.getTime();
 	         k.add(Calendar.DATE, (10000/time)+((10000/time/14))+(((10000/time/14))/14)-1);
 		     SimpleDateFormat dfq = new SimpleDateFormat("yyyy년 MM월 dd일 ");
 	         SimpleDateFormat dcw= new SimpleDateFormat("E요일");   
 		     dcw.format(k.getTime());
 	         dfq.format(k.getTime());
 	         
 	         if(dcw.format(k.getTime()).equals("토요일")) {
 	        	System.out.println(dfq.format(k.getTime()));
				System.out.println(dcw.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 		    	   
 		      }
 		      else if(dcw.format(k.getTime()).equals("일요일")) {
 		    	k.getTime();
 	    		k.add(Calendar.DATE, 1);
 		        SimpleDateFormat dfa = new SimpleDateFormat("yyyy년 MM월 dd일");
 		        SimpleDateFormat dca= new SimpleDateFormat("E요일");
 		        System.out.println(dfa.format(k.getTime()));
 		        System.out.println(dca.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 		    	 
 		      }
 		      else if(dcw.format(k.getTime()).equals("월요일")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 		        
 		      }
 		      else if(dcw.format(k.getTime()).equals("화요일")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 		        
 		      }
 		      else if(dcw.format(k.getTime()).equals("수요일")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 		        
 		      }
 		      else if(dcw.format(k.getTime()).equals("목요일")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 		        
 		      }
 		      else if(dcw.format(k.getTime()).equals("금요일")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 		        
 		      }
    	}
    	
    	}
    }

public static void after1000Hourssss(Calendar k, int time) {
	
	int a=(10000%time);
    if(time<0) {
    	System.out.println("->I can't confirm it, please reenter it.");
    }
	 
    else if(time>24) {
    	System.out.println("->I can't confirm it, please reenter it.");
    }
    else  {
    	 if(10000/time/14/14/14>=1&&10000/time/14/14/14<=7){
 			
     		k.getTime();
     		k.add(Calendar.DATE, (10000/time)+((10000/time/14))+(10000/time/14/14)+(10000/time/14/14/14)-1);
 	        SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
 	        SimpleDateFormat dc= new SimpleDateFormat("E요일");
 	        df.format(k.getTime());
 	        dc.format(k.getTime());
 	        
 	        
 	      if(dc.format(k.getTime()).equals("일요일")) {
 	    	 System.out.println(df.format(k.getTime()));
			 System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 	      }
 	      else if(dc.format(k.getTime()).equals("토요일")) {
 	    	    k.getTime();
	    		k.add(Calendar.DATE, 2);
		        SimpleDateFormat dfa = new SimpleDateFormat("yyyy년 MM월 dd일");
		        SimpleDateFormat dca= new SimpleDateFormat("E요일");
		        System.out.println(dfa.format(k.getTime()));
		        System.out.println(dca.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 	      }
 	      else if(dc.format(k.getTime()).equals("월요일")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 	        
 	      }
 	      else if(dc.format(k.getTime()).equals("화요일")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 	        
 	      }
 	      else if(dc.format(k.getTime()).equals("수요일")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 	        
 	      }
 	      else if(dc.format(k.getTime()).equals("목요일")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 	        
 	      }
 	      else if(dc.format(k.getTime()).equals("금요일")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 	        
 	      }

     	
     	}
     	else if(10000/time/14/14>=1&& 10000/time/14/14<=7){
     		 k.getTime();
 	         k.add(Calendar.DATE, (10000/time)+((10000/time/14))+(((10000/time/14))/14)-1);
 		     SimpleDateFormat dfq = new SimpleDateFormat("yyyy년 MM월 dd일 ");
 	         SimpleDateFormat dcw= new SimpleDateFormat("E요일");   
 		     dcw.format(k.getTime());
 	         dfq.format(k.getTime());
 	         
 	         if(dcw.format(k.getTime()).equals("일요일")) {
 	        	System.out.println(dfq.format(k.getTime()));
				System.out.println(dcw.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 		    	   
 		      }
 		      else if(dcw.format(k.getTime()).equals("토요일")) {
 		    	k.getTime();
 	    		k.add(Calendar.DATE, 2);
 		        SimpleDateFormat dfa = new SimpleDateFormat("yyyy년 MM월 dd일");
 		        SimpleDateFormat dca= new SimpleDateFormat("E요일");
 		        System.out.println(dfa.format(k.getTime()));
 		        System.out.println(dca.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 		    	 
 		      }
 		      else if(dcw.format(k.getTime()).equals("월요일")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 		        
 		      }
 		      else if(dcw.format(k.getTime()).equals("화요일")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 		        
 		      }
 		      else if(dcw.format(k.getTime()).equals("수요일")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 		        
 		      }
 		      else if(dcw.format(k.getTime()).equals("목요일")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 		        
 		      }
 		      else if(dcw.format(k.getTime()).equals("금요일")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"에 종료되며,"+a+"시간의 추가시간이 남습니다.");
 		        
 		      }
     	}
    }
}
}