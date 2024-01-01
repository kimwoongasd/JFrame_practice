package exam01;

import java.util.Date;
import java.util.HashMap;

public class DateTest {

	public static void main(String[] args) {
		// 현재날짜와 시각의 정보를 출력
		Date today = new Date();
		HashMap<Integer, String> week = new HashMap<Integer, String>();
		week.put(0, "일요일");
		week.put(1, "월요일");
		week.put(2, "화요일");
		week.put(3, "수요일");
		week.put(4, "목요일");
		week.put(5, "금요일");
		week.put(6, "토요일");
		
		int year = today.getYear() + 1900;
		int month = (today.getMonth() + 1);
		int date = today.getDate();
		String day = week.get(today.getDay());
		int hour = today.getHours();
		int minutes = today.getMinutes();
		int sec = today.getSeconds();
		
	}

}
