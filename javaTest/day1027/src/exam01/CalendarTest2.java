package exam01;

import java.util.Calendar;
import java.util.HashMap;

public class CalendarTest2 {

	public static void main(String[] args) {
		// 생성자가 protected이기 떄문에 직접 객체 생성 불가능
//		Calendar today = new Calendar();
		
		// Calendar 쓰는법
		// getInstance()는 static Calendar를 반환
		Calendar today = Calendar.getInstance();
//		System.out.println(today);
		
		// get(필드) : 필드 값을 입력하면 년 월 일 구할 수 있다
		// calendar 필드를 보면 상수로 되어있고 대부분 static이기 때문에
		// calendar.year month 등 으로 불러온다
		
		int year = today.get(Calendar.YEAR);
		System.out.println(year);
		
		// calendar 객체로브터 년,월,일,시간,분,초,요일을 가져오려면 모두 get 메소드를 이용한다
		// 이 때 get메소드에게 무엇을 가져올지 필드로 알려주는데 상수를 통해서 가져온다
		// 이 떄 가져오려는것부터 따로 상수가 존재한다
		HashMap<Integer, String> week = new HashMap<Integer, String>();
		// Calendar 객체인 today로 접근해도 되지만 일반적으로 클래스로 접근한다
		week.put(Calendar.SUNDAY, "일요일");
		week.put(Calendar.MONDAY, "월요일");
		week.put(Calendar.TUESDAY, "화요일");
		week.put(Calendar.WEDNESDAY, "수요일");
		week.put(Calendar.THURSDAY, "목요일");
		week.put(Calendar.FRIDAY, "금요일");
		week.put(Calendar.SATURDAY, "토요일");
		
		// 1월이 0부터 시작
		int month = today.get(Calendar.MONTH) + 1;
		int date = today.get(Calendar.DATE);
		String day = week.get(today.get(Calendar.DAY_OF_WEEK));
		int hour = today.get(Calendar.HOUR);
		int minutes = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초\n",
				year, month, date, day, hour, minutes, sec);
		
		// day는 일요일이 0이지만 Calendar는 일요일이 1부터 시작한다
//		System.out.println(today.get(Calendar.DAY_OF_WEEK));
		
	}

}
