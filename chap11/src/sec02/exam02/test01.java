package sec02.exam02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test01 {

	public static void main(String[] args) {
		// 현재 날짜/시간 구하기
		Date date = new Date();
		String strDate = date.toString();
		System.out.println(strDate);
		
		// 날짜 포맷 
		SimpleDateFormat kor = new SimpleDateFormat("yyyy년 MM월 dd일 EEEE HH시 mm분");
		String format = kor.format(date);
		System.out.println(format);
		
		// Calendar 사용해서 표현
		Calendar date2 = Calendar.getInstance();
		int year = date2.get(Calendar.YEAR);
		int month = date2.get(Calendar.MONTH)+1;
		int day = date2.get(Calendar.DAY_OF_MONTH);
		String month1 = null;
		String day1 = null;
		if ( month < 10 ) month1 = "0" + month;
		if ( day < 10 ) day1 = "0" + day;
		
		System.out.print(year + "년 " + month1 + "월 " + day1 + "일 ");
		
		int days = date2.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch (days) {
		case Calendar.MONDAY : strWeek = "월요일"; break;
		case Calendar.TUESDAY: strWeek = "화요일"; break;
		case Calendar.WEDNESDAY : strWeek = "수요일"; break;
		case Calendar.THURSDAY : strWeek = "목요일"; break;
		case Calendar.FRIDAY : strWeek = "금요일"; break;
		case Calendar.SATURDAY : strWeek = "토요일"; break;
		case Calendar.SUNDAY: strWeek = "일요일"; break;
		}
		System.out.print(strWeek + " ");
		
		int hour = date2.get(Calendar.HOUR) % 12;
		if ( hour == 0 ) hour = 12;
		System.out.print(hour + "시 ");
		int minute = date2.get(Calendar.MINUTE);
		System.out.println(minute + "분");
		
		
	}

}
