package exam08;

import java.util.Date;
import java.util.Scanner;

public class FreeCancerScreening {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		String cancer = "위암, 간암, 일반암", jumin;
		int year, age;
		year = today.getYear() + 1900;
		
		System.out.println("주민번호를 입력하시오");
		jumin = sc.next();
		
		// 성별, 나이 구하기
		int n = jumin.indexOf("-") + 1, myYear = 0;
		char ch = jumin.charAt(n);
		
		// 나이
		if (ch == '1' || ch == '2') {
			myYear = Integer.parseInt(jumin.substring(0, 2)) + 1900;
		} else if (ch == '3' || ch == '4' ) {
			myYear = Integer.parseInt(jumin.substring(0, 2)) + 2000;
		}
		
		// 암 추가
		if (ch == '2' || ch == '4' ) {
			cancer += " 자궁암, 유방암";
		}
		
		// 나이 구하기
		age = year - myYear;
		
		System.out.println("올해연도 : " + year);
		System.out.println("출생연도 : " + myYear);
		System.out.println("나이 : " + age);
		
		if (age >= 40) {
			if (age >= 50) cancer += " 대장암";
			if (year % 2 == 0 && myYear % 2 == 0) {
				System.out.println("무료암검진 대상자입니다"); 
				System.out.println("암검진 항목 : " + cancer); 
			} else if (year % 1 == 0 && myYear % 2 == 1) {
				System.out.println("무료암검진 대상자입니다"); 
				System.out.println("암검진 항목 : " + cancer); 
			} else {
				System.out.println("대상자 아닙니다");
			}
		} else {
			System.out.println("대상자 아닙니다");
		}
	}
}
