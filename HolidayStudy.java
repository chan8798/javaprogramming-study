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
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy"+"��"+"MM"+"��"+"dd"+"��"+"HH"+"��"+"mm"+"��"+"ss"+"��");
		    String formatedNow = formatter.format(now);
		
		    System.out.println("-----------------------------------");
		    System.out.println("           ����ð���           ");
			System.out.println("-->"+formatedNow+"<--");
			
			System.out.println("-----------------------------------");
			
			
			
		 
		    
		    System.out.println("   ����<����>�� �����ϰ� �Է��Ͻÿ�");
		    
		    System.out.println("============<�� ��>=============");
		    System.out.println("�����,�Ͽ��� �����Ѵ�.      ->1�� �Է�");
	    	System.out.println("�����,�Ͽ��� ����.         ->2�� �Է�");
	    	System.out.println("����Ͽ� �����ϰ� �Ͽ��Ͽ� ����.->3�� �Է�");
	    	System.out.println("�Ͽ��Ͽ� �����ϰ� ����Ͽ� ����.->4�� �Է�");
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
	    	System.out.println("�Ϸ� 1�� �ð��� ���� �����ϴ� �ð��� �Է��Ͻÿ�:");
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
		    	System.out.println("�Ϸ� 1�� �ð��� ���� �����ϴ� �ð��� �Է��Ͻÿ�:");
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
		    	System.out.println("�Ϸ� 1�� �ð��� ���� �����ϴ� �ð��� �Է��Ͻÿ�:");
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
		    	System.out.println("�Ϸ� 1�� �ð��� ���� �����ϴ� �ð��� �Է��Ͻÿ�:");
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
		         SimpleDateFormat df = new SimpleDateFormat("yyyy�� MM�� dd�� E����");
		         
		             System.out.println(df.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
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
			         SimpleDateFormat df = new SimpleDateFormat("yyyy�� MM�� dd�� E����");
			         SimpleDateFormat dc= new SimpleDateFormat("E����");
				       
				     dc.format(k.getTime());
			         df.format(k.getTime());
			         
			         if(dc.format(k.getTime()).equals("�Ͽ���")) {
				    	    k.getTime();
				    		k.add(Calendar.DATE, 2);
					        SimpleDateFormat dfa = new SimpleDateFormat("yyyy�� MM�� dd��");
					        SimpleDateFormat dca= new SimpleDateFormat("E����");
					        System.out.println(dfa.format(k.getTime()));
					        System.out.println(dca.format(k.getTime()));
				      }
				      else if(dc.format(k.getTime()).equals("�����")) {
				    	    k.getTime();
				    		k.add(Calendar.DATE, 2);
					        SimpleDateFormat dfa = new SimpleDateFormat("yyyy�� MM�� dd��");
					        SimpleDateFormat dca= new SimpleDateFormat("E����");
					        System.out.println(dfa.format(k.getTime()));
					        System.out.println(dca.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
				      }
				      else if(dc.format(k.getTime()).equals("������")) {
				    	     System.out.println(df.format(k.getTime()));
						     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
				        
				      }
				      else if(dc.format(k.getTime()).equals("ȭ����")) {
				    	     System.out.println(df.format(k.getTime()));
						     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
				        
				      }
				      else if(dc.format(k.getTime()).equals("������")) {
				    	     System.out.println(df.format(k.getTime()));
						     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
				        
				      }
				      else if(dc.format(k.getTime()).equals("�����")) {
				    	     System.out.println(df.format(k.getTime()));
						     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
				        
				      }
				      else if(dc.format(k.getTime()).equals("�ݿ���")) {
				    	     System.out.println(df.format(k.getTime()));
						     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
				        
				      }
		
			         
			        
			         
			        
			          
		    		
		    	}
		    	else if(((10000/time)/7/7/7)>=1&&((10000/time)/7/7/7)<=7){
		    			
		    		k.getTime();
		    		k.add(Calendar.DATE, (10000/time)+((10000/time/7))+(10000/time/7/7)+(10000/time/7/7/7)-1);
			        SimpleDateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
			        SimpleDateFormat dc= new SimpleDateFormat("E����");
			        df.format(k.getTime());
			        dc.format(k.getTime());
			        
			        
			      if(dc.format(k.getTime()).equals("�Ͽ���")) {
			    	    k.getTime();
			    		k.add(Calendar.DATE, 2);
				        SimpleDateFormat dfa = new SimpleDateFormat("yyyy�� MM�� dd��");
				        SimpleDateFormat dca= new SimpleDateFormat("E����");
				        System.out.println(dfa.format(k.getTime()));
				        System.out.println(dca.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
			      }
			      else if(dc.format(k.getTime()).equals("�����")) {
			    	    k.getTime();
			    		k.add(Calendar.DATE, 2);
				        SimpleDateFormat dfa = new SimpleDateFormat("yyyy�� MM�� dd��");
				        SimpleDateFormat dca= new SimpleDateFormat("E����");
				        System.out.println(dfa.format(k.getTime()));
				        System.out.println(dca.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
			      }
			      else if(dc.format(k.getTime()).equals("������")) {
			    	     System.out.println(df.format(k.getTime()));
					     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
			        
			      }
			      else if(dc.format(k.getTime()).equals("ȭ����")) {
			    	     System.out.println(df.format(k.getTime()));
					     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
			        
			      }
			      else if(dc.format(k.getTime()).equals("������")) {
			    	     System.out.println(df.format(k.getTime()));
					     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
			        
			      }
			      else if(dc.format(k.getTime()).equals("�����")) {
			    	     System.out.println(df.format(k.getTime()));
					     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
			        
			      }
			      else if(dc.format(k.getTime()).equals("�ݿ���")) {
			    	     System.out.println(df.format(k.getTime()));
					     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
			        
			      }
	
		    	
		    	}
		    	else if((10000/time/7)/7>=1&&(10000/time/7)/7<=7){
		    		 k.getTime();
			         k.add(Calendar.DATE, (10000/time)+((10000/time/7))+(((10000/time/7))/7)-1);
				     SimpleDateFormat dfq = new SimpleDateFormat("yyyy�� MM�� dd�� ");
			         SimpleDateFormat dcw= new SimpleDateFormat("E����");   
				     dcw.format(k.getTime());
			         dfq.format(k.getTime());
			         
			         if(dcw.format(k.getTime()).equals("�Ͽ���")) {
				    	    k.getTime();
				    		k.add(Calendar.DATE, 2);
					        SimpleDateFormat dfa = new SimpleDateFormat("yyyy�� MM�� dd��");
					        SimpleDateFormat dca= new SimpleDateFormat("E����");
					        System.out.println(dfa.format(k.getTime()));
					        System.out.println(dca.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
				      }
				      else if(dfq.format(k.getTime()).equals("�����")) {
				    	    k.getTime();
				    		k.add(Calendar.DATE, 2);
					        SimpleDateFormat dfa = new SimpleDateFormat("yyyy�� MM�� dd��");
					        SimpleDateFormat dca= new SimpleDateFormat("E����");
					        System.out.println(dfa.format(k.getTime()));
					        System.out.println(dca.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
				      }
				      else if(dcw.format(k.getTime()).equals("������")) {
				    	     System.out.println(dfq.format(k.getTime()));
						     System.out.println(dcw.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
				        
				      }
				      else if(dcw.format(k.getTime()).equals("ȭ����")) {
				    	     System.out.println(dfq.format(k.getTime()));
						     System.out.println(dcw.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
				        
				      }
				      else if(dcw.format(k.getTime()).equals("������")) {
				    	     System.out.println(dfq.format(k.getTime()));
						     System.out.println(dcw.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
				        
				      }
				      else if(dcw.format(k.getTime()).equals("�����")) {
				    	     System.out.println(dfq.format(k.getTime()));
						     System.out.println(dcw.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
				        
				      }
				      else if(dcw.format(k.getTime()).equals("�ݿ���")) {
				    	     System.out.println(dfq.format(k.getTime()));
						     System.out.println(dcw.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
				        
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
 	        SimpleDateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
 	        SimpleDateFormat dc= new SimpleDateFormat("E����");
 	        df.format(k.getTime());
 	        dc.format(k.getTime());
 	        
 	        
 	      if(dc.format(k.getTime()).equals("�����")) {
 	    	 System.out.println(df.format(k.getTime()));
			 System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 	      }
 	      else if(dc.format(k.getTime()).equals("�Ͽ���")) {
 	    	    k.getTime();
	    		k.add(Calendar.DATE, 1);
		        SimpleDateFormat dfa = new SimpleDateFormat("yyyy�� MM�� dd��");
		        SimpleDateFormat dca= new SimpleDateFormat("E����");
		        System.out.println(dfa.format(k.getTime()));
		        System.out.println(dca.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 	      }
 	      else if(dc.format(k.getTime()).equals("������")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 	        
 	      }
 	      else if(dc.format(k.getTime()).equals("ȭ����")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 	        
 	      }
 	      else if(dc.format(k.getTime()).equals("������")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 	        
 	      }
 	      else if(dc.format(k.getTime()).equals("�����")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 	        
 	      }
 	      else if(dc.format(k.getTime()).equals("�ݿ���")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 	        
 	      }

     	
     	}
     	else if(10000/time/14/14>=1&& 10000/time/14/14<=7){
     		 k.getTime();
 	         k.add(Calendar.DATE, (10000/time)+((10000/time/14))+(((10000/time/14))/14)-1);
 		     SimpleDateFormat dfq = new SimpleDateFormat("yyyy�� MM�� dd�� ");
 	         SimpleDateFormat dcw= new SimpleDateFormat("E����");   
 		     dcw.format(k.getTime());
 	         dfq.format(k.getTime());
 	         
 	         if(dcw.format(k.getTime()).equals("�����")) {
 	        	System.out.println(dfq.format(k.getTime()));
				System.out.println(dcw.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 		    	   
 		      }
 		      else if(dcw.format(k.getTime()).equals("�Ͽ���")) {
 		    	k.getTime();
 	    		k.add(Calendar.DATE, 1);
 		        SimpleDateFormat dfa = new SimpleDateFormat("yyyy�� MM�� dd��");
 		        SimpleDateFormat dca= new SimpleDateFormat("E����");
 		        System.out.println(dfa.format(k.getTime()));
 		        System.out.println(dca.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 		    	 
 		      }
 		      else if(dcw.format(k.getTime()).equals("������")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 		        
 		      }
 		      else if(dcw.format(k.getTime()).equals("ȭ����")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 		        
 		      }
 		      else if(dcw.format(k.getTime()).equals("������")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 		        
 		      }
 		      else if(dcw.format(k.getTime()).equals("�����")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 		        
 		      }
 		      else if(dcw.format(k.getTime()).equals("�ݿ���")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 		        
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
 	        SimpleDateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
 	        SimpleDateFormat dc= new SimpleDateFormat("E����");
 	        df.format(k.getTime());
 	        dc.format(k.getTime());
 	        
 	        
 	      if(dc.format(k.getTime()).equals("�Ͽ���")) {
 	    	 System.out.println(df.format(k.getTime()));
			 System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 	      }
 	      else if(dc.format(k.getTime()).equals("�����")) {
 	    	    k.getTime();
	    		k.add(Calendar.DATE, 2);
		        SimpleDateFormat dfa = new SimpleDateFormat("yyyy�� MM�� dd��");
		        SimpleDateFormat dca= new SimpleDateFormat("E����");
		        System.out.println(dfa.format(k.getTime()));
		        System.out.println(dca.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 	      }
 	      else if(dc.format(k.getTime()).equals("������")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 	        
 	      }
 	      else if(dc.format(k.getTime()).equals("ȭ����")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 	        
 	      }
 	      else if(dc.format(k.getTime()).equals("������")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 	        
 	      }
 	      else if(dc.format(k.getTime()).equals("�����")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 	        
 	      }
 	      else if(dc.format(k.getTime()).equals("�ݿ���")) {
 	    	     System.out.println(df.format(k.getTime()));
 			     System.out.println(dc.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 	        
 	      }

     	
     	}
     	else if(10000/time/14/14>=1&& 10000/time/14/14<=7){
     		 k.getTime();
 	         k.add(Calendar.DATE, (10000/time)+((10000/time/14))+(((10000/time/14))/14)-1);
 		     SimpleDateFormat dfq = new SimpleDateFormat("yyyy�� MM�� dd�� ");
 	         SimpleDateFormat dcw= new SimpleDateFormat("E����");   
 		     dcw.format(k.getTime());
 	         dfq.format(k.getTime());
 	         
 	         if(dcw.format(k.getTime()).equals("�Ͽ���")) {
 	        	System.out.println(dfq.format(k.getTime()));
				System.out.println(dcw.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 		    	   
 		      }
 		      else if(dcw.format(k.getTime()).equals("�����")) {
 		    	k.getTime();
 	    		k.add(Calendar.DATE, 2);
 		        SimpleDateFormat dfa = new SimpleDateFormat("yyyy�� MM�� dd��");
 		        SimpleDateFormat dca= new SimpleDateFormat("E����");
 		        System.out.println(dfa.format(k.getTime()));
 		        System.out.println(dca.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 		    	 
 		      }
 		      else if(dcw.format(k.getTime()).equals("������")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 		        
 		      }
 		      else if(dcw.format(k.getTime()).equals("ȭ����")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 		        
 		      }
 		      else if(dcw.format(k.getTime()).equals("������")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 		        
 		      }
 		      else if(dcw.format(k.getTime()).equals("�����")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 		        
 		      }
 		      else if(dcw.format(k.getTime()).equals("�ݿ���")) {
 		    	     System.out.println(dfq.format(k.getTime()));
 				     System.out.println(dcw.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
 		        
 		      }
     	}
    }
}
}