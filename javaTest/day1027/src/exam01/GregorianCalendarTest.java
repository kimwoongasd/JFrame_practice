package exam01;

import java.util.GregorianCalendar;
import java.util.HashMap;

public class GregorianCalendarTest {

	public static void main(String[] args) {
		// 현재날짜의 년, 월, 일, 요일, 시, 분, 초
		// 윤년인가 판별하여 출력
		GregorianCalendar today = new GregorianCalendar();
		HashMap<Integer, String> week = new HashMap<Integer, String>();
		week.put(GregorianCalendar.SUNDAY, "일");
		week.put(GregorianCalendar.MONDAY, "월");
		week.put(GregorianCalendar.TUESDAY, "화");
		week.put(GregorianCalendar.WEDNESDAY, "수");
		week.put(GregorianCalendar.THURSDAY, "목");
		week.put(GregorianCalendar.FRIDAY, "금");
		week.put(GregorianCalendar.SATURDAY, "토");
		
		
		int year = today.get(GregorianCalendar.YEAR);
		int month = today.get(GregorianCalendar.MONTH) + 1;
		int date = today.get(GregorianCalendar.DATE);
		String day = week.get(today.get(GregorianCalendar.DAY_OF_WEEK));
		int hour = today.get(GregorianCalendar.HOUR);
		int min = today.get(GregorianCalendar.MINUTE);
		int sec = today.get(GregorianCalendar.SECOND);
		boolean leap = today.isLeapYear(year);
		
		System.out.printf("%d년 %d월 %d일 %s요일 %d시 %d분 %d초\n",
				year, month, date, day, hour, min, sec);
		
		if (leap) System.out.println(year + "년은 윤년입니다");
		else System.out.println(year + "년은 윤년이 아닙니다");
		
	}

}
