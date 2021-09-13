import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class MethodCal {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
        Date now = Calendar.getInstance().getTime();
		
		System.out.println(now); 
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
	
		String formatedNow = formatter.format(now);
		
		
		System.out.println("����ð���"+formatedNow);
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(new Date());
	    
		System.out.println("���� ������ �Է��ϼ���");
		int number= scanner.nextInt();
		addDays(cal,number);
		
		System.out.println("���� �ð��� ���ڷ� �Է��Ͻÿ�");
		int plusehour=scanner.nextInt();
		addHours(cal,plusehour);
		
		System.out.println("�Ϸ� 1�� �ð��� ���� �����ϴ� �ð��� �Է��Ͻÿ�.<�� �Ͽ��Ͽ��� ���ϴ�.>");
		int Studytime=scanner.nextInt();
		after1000Hours(cal,Studytime);
		
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
        k.add(Calendar.DATE, (10000/(time*6)-1));
        SimpleDateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
        System.out.println(df.format(k.getTime())+"�� ����Ǹ� �߰���"+10000%(time*6)+"�ð��� �� �ʿ��մϴ�.");
    }

}