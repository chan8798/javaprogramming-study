import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.DateTime;
import java.util.Scanner;

public class Times {
	public static void main(String[] args) {
		
		while(true) {
		DateTime dateTime=new DateTime();
		Scanner sc=new Scanner(System.in);
		int datOfWeek=dateTime.getDayOfWeek();
		
		System.out.println("��¥�� �Է��Ͻÿ�:<�ݵ�� 0000��-00��-00�� �������� �Է��Ͻñ� �ٶ��ϴ�.>");
		String input=sc.next();
		System.out.println("�Է��Ͻ� ��¥�� "+input+"�̰�,");
		DateTimeFormatter formatter=DateTimeFormat.forPattern("yyyy-MM-dd");
		
		LocalDate localdate=formatter.parseLocalDate(input);
	
		int dayOfWeek1=localdate.getDayOfWeek();
		
		String dayOfWeekStr="";
		switch(dayOfWeek1) {
		case 1:
			dayOfWeekStr="������";
			break;
		case 2:
			dayOfWeekStr="ȭ����";
			break;
		case 3:
			dayOfWeekStr="������";
			break;
		case 4:
			dayOfWeekStr="�����";
			break;
		case 5:
			dayOfWeekStr="�ݿ���";
			break;
		case 6:
			dayOfWeekStr="�����";
			break;
		case 7:
			dayOfWeekStr="�Ͽ���";
			break;
		
		}
		System.out.println(dayOfWeekStr+"�Դϴ�.");
	}
	
}
}
