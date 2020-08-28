package lecture.dateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormat {
	public static void main(String[] args) {
		
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.getTime());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String dateStr = sdf.format(Calendar.getInstance().getTime());
		String TimeStr = sdf.format(Calendar.getInstance().getTime());
		System.out.println(dateStr + " " + TimeStr);
		
		/*
		LocalDateTime ldt = LocalDateTime.now().plusDays(1);
		DateTimeFormatter formmat = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
		System.out.println(ldt);
		// Output "2018-05-12T17:21:53.658"

		String formatter = formmat.format(ldt);
		System.out.println(formatter);
		*/
	}
}
