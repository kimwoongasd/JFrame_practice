package exam08;

import java.util.Date;

public class TodayTest {

	public static void main(String[] args) {
		// 날짜와 시간 정보 클래스 Date
		Date today = new Date();
		
		// 자동으로 toString 실행
		System.out.println(today);
		
		System.out.println(today.getYear() + 1900);
	}

}
