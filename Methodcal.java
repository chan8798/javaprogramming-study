package project;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.util.InputMismatchException;


public class Methodcal {
	public static void main(String args[]) {
	       
		Scanner scanner=new Scanner(System.in);
        Date now = Calendar.getInstance().getTime();
		
		System.out.println(now); 
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
	
		String formatedNow = formatter.format(now);
		
		
		System.out.println("����ð���"+formatedNow);
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(new Date());
	   
	    int number;
	   
		System.out.println("���� ������ �Է��ϼ���");
		while (true) {
			try {
				number= scanner.nextInt();
				if(number>0) {
				break;
				}
				else {
					 System.out.println("0�ǿܿ� ���������� �Է��Ͻÿ�: ");
					 continue;
				}
			}
			catch  (InputMismatchException ime) {
				scanner = new Scanner( System.in ); 
	             System.out.println("�߸� �Է��߽��ϴ�. ������ �Է��� �� �־��. �ٽ��Է��Ͻÿ�.");
	             
	             System.out.println(
	             ime.getClass().getName() + " ���ܰ� " + ime.getMessage() + " ������ �߻��߽��ϴ�. ");
					
				}
		}
		
		addDays(cal,number);
		
			
		
			
	    
	   int plusehour;
	 
	 
		System.out.println("���� �ð��� ���ڷ� �Է��Ͻÿ�");
		while(true) {
			
		 try {
			plusehour=scanner.nextInt();
			if(plusehour>0) {
			break;
			}
			else {
				 System.out.println("0���� ���������� �Է��Ͻÿ�:");
				 continue;
			 }
		 }
		 catch  (InputMismatchException ime) {
				scanner = new Scanner( System.in ); 
	             System.out.println("�߸� �Է��߽��ϴ�. ������ �Է��� �� �־��. �ٽ��Է��Ͻÿ�.");
	             
	             System.out.println(
	             ime.getClass().getName() + " ���ܰ� " + ime.getMessage() + " ������ �߻��߽��ϴ�. ");
					
				}
		}
		
		
		addHours(cal,plusehour);
		
		
	
	    int time;
	
		System.out.println("�Ϸ� 1�� �ð��� ���� �����ϴ� �ð��� �Է��Ͻÿ�.");
		while(true) {
			try {
			 
		 time=scanner.nextInt();
		 if(time>0) {
		 break;
		 }
		 else {
			 System.out.println("�Ϸ翡 �н��� ���ؾ��մϴ�. �ٽ��Է��Ͻÿ�:");
			 continue;
		 }
	}
			catch  (InputMismatchException ime) {
				scanner = new Scanner( System.in ); 
	             System.out.println("�߸� �Է��߽��ϴ�. ������ �Է��� �� �־��. �ٽ��Է��Ͻÿ�.");
	             
	             System.out.println(
	             ime.getClass().getName() + " ���ܰ� " + ime.getMessage() + " ������ �߻��߽��ϴ�. ");
					
				}
			
			}
			
		if(time<=24) {
		after1000Hours(cal,time);
		
		}

		
		else  {
		System.out.println("�Ϸ�� 24�ð� �Դϴ�. 24���� ���� ���� �Է��Ͻÿ�");
		System.out.println("24���� ���� ������ �Է��Ͻÿ�.");
		time=scanner.nextInt();
		after1000Hours(cal,time);
		}
	}
	
    public static void addDays(Calendar n,int m) {
    	n.add(Calendar.DATE, m);
    	SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
    	

		String[] week = {"��","��","ȭ","��","��","��","��"};
		Date getDate; 
        try {
    	getDate = df.parse(df.format(n.getTime())); 
    	n.setTime(getDate); 
    	int w = n.get(Calendar.DAY_OF_WEEK)-1; 
    	System.out.println(m+"���� ���� ��¥��"+df.format(n.getTime())+ "�̸�, " + week[w] +"���� �Դϴ�"); 
        } 
        catch (ParseException e) { 
        	e.printStackTrace(); 
        	} 
        catch (Exception e) { 
        	e.printStackTrace(); 
        	}
        

    }
    public static void addHours(Calendar n,int t) {
    	n.add(Calendar.HOUR, t);
    	SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd HH");
    	System.out.println("yyyyMMDD HH"+"-"+df.format(n.getTime()));
    	}
    public static void after1000Hours(Calendar k, int time) {
    	int a=(10000%time);
    	
    	
        k.add(Calendar.DATE, (10000/time)-1);
        SimpleDateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
        if(a==0) {
        
            System.out.println(df.format(k.getTime())+"�� ����ȴ�.");
        
            }
            else {
            System.out.println(df.format(k.getTime())+"�� ����Ǹ�,"+a+"�ð��� �߰��ð��� �����ϴ�.");
            }
     
    	}
    }
  

