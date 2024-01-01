package exam08;

import java.util.Date;
import java.util.Scanner;

// 주민번호를 입력받아 나이를 계산하여 출력

public class AgeFromJumin {
	public static void main(String[] args) {
		String jumin;
		int n, myYear = 0;
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		System.out.println("주민 번호를 입력하시오");
		jumin = sc.next();
		
		n = jumin.indexOf("-") + 1;
		char ch = jumin.charAt(n);
		
		// 출생연도 계산
		// 주민 뒷자리 앞번하가 1, 2 = 1900 3, 4 = 2000
		if (ch == '1' || ch == '2') {
			myYear = 1900;
		} else if (ch == '3' || ch == '4') {
			myYear = 2000;
		}
		myYear +=  Integer.parseInt(jumin.substring(0, 2));
		
		// 현재년도
		int year = today.getYear() + 1900;
		// 나이 구하기
		int age = year - myYear;
		
		System.out.println("올해연도 : " + year);
		System.out.println("출생연도 : " + myYear);
		System.out.println("나이는 " + age + "살 입니다");
	}
}
