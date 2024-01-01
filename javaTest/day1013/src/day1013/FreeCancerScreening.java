package day1013;

import java.util.Date;
import java.util.Scanner;

/*
이름, 성별, 출생연도를 입력받아 무료암검진 대상자 인자 판별

조건
나이가 40세이상, 올해가 짝수연도이면 출생연도는 짝수
올해가 홀수연도이면 출생연도는 홀수가 대상자
또 40세 이상 남자는 무료암검진 항목이 위암, 간암
40세 이상 여자는 무료암검진 항목이 위암, 간암, 유방암, 자궁암

50세 이상 남자 위암, 간암, 대장암
50세 이상 여자 위암, 간암, 대장암, 유방암, 자궁암

실행 예
''님은 2023년도에 무료암검진 대상자이며
검진항목은 위암, 간암..입니다
*/

public class FreeCancerScreening {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		String name, gender, res = "위암, 간암 ";
		int year, t, age;
		t = today.getYear() + 1900;
		System.out.println("이름을 입력하시오");
		name = sc.next();
		System.out.println("성별(남/여)을 입력하시오");
		gender = sc.next();
		System.out.println("출생연도를 입력하시오");
		year = sc.nextInt();
		age = t - year;
		
		if (age >= 40 && (year % 2 == t % 2)) {
			if (age >= 50) {
				res += "대장암";
			}	
				
			if (gender.equals("여")) {
				res += " 유방암 자궁암";
			}
			
			System.out.printf("%s님은 %d년도에 무료암검진 대상자이며\n"
					+ "검진항목은 %s입니다.\n", name, t, res);
		} else {
			System.out.printf("%s님은 %d년도에 무료암검진 대상자가 아닙니다\n", name, t);
		}
	}	

}
