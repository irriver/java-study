package lecture.date;

import java.util.Calendar;
import java.util.Date;

public class Dates {
	public static void main(String[] args) {
		Date date = new Date();	//---------------- Depricated
		System.out.println(date.toString());
/*		
		Calendar cal = new Calendar(); ----------- Private constructor can't use 'new'
		추상클래스는 미완이라 new로 객체 생성 불가.
		추상클래스 Calendar를 구현하고 있는 Gregorian Cal, Buddhis Cal가 Calendar를 상속.
		시스템의 locale을 받아와서 둘 중 하나를 자바가 자동 설정
*/
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toString());
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		
		
	}  
}
