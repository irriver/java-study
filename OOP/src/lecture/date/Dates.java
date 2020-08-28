package lecture.date;

import java.util.Calendar;
import java.util.Date;

public class Dates {
	public static void main(String[] args) {
		Date date = new Date();	//---------------- Depricated
		System.out.println(date.toString());
/*		
		Calendar cal = new Calendar(); ----------- Private constructor can't use 'new'
		�߻�Ŭ������ �̿��̶� new�� ��ü ���� �Ұ�.
		�߻�Ŭ���� Calendar�� �����ϰ� �ִ� Gregorian Cal, Buddhis Cal�� Calendar�� ���.
		�ý����� locale�� �޾ƿͼ� �� �� �ϳ��� �ڹٰ� �ڵ� ����
*/
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toString());
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		
		
	}  
}
