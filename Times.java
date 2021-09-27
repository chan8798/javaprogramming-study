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
		
		System.out.println("날짜를 입력하시오:<반드시 0000년-00월-00일 형식으로 입력하시길 바랍니다.>");
		String input=sc.next();
		System.out.println("입력하신 날짜는 "+input+"이고,");
		DateTimeFormatter formatter=DateTimeFormat.forPattern("yyyy-MM-dd");
		
		LocalDate localdate=formatter.parseLocalDate(input);
	
		int dayOfWeek1=localdate.getDayOfWeek();
		
		String dayOfWeekStr="";
		switch(dayOfWeek1) {
		case 1:
			dayOfWeekStr="월요일";
			break;
		case 2:
			dayOfWeekStr="화요일";
			break;
		case 3:
			dayOfWeekStr="수요일";
			break;
		case 4:
			dayOfWeekStr="목요일";
			break;
		case 5:
			dayOfWeekStr="금요일";
			break;
		case 6:
			dayOfWeekStr="토요일";
			break;
		case 7:
			dayOfWeekStr="일요일";
			break;
		
		}
		System.out.println(dayOfWeekStr+"입니다.");
	}
	
}
}
