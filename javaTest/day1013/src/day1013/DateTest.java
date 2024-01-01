package day1013;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// 날짜와 시간에 대한 정보를 알아오기 위하여 Date객체를 생성
		Date today = new Date();
		
		// getYear메소드를 통해서 연도를 얻는다
		// getYear는 연도 - 1900을 반환
		int year = today.getYear() + 1900;
		System.out.println(year);
		System.out.println(today);
	}

}
