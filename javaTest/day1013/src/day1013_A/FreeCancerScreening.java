package day1013_A;

import java.util.Date;
import java.util.Scanner;

class MyUtil {
	public String chechArm(int userYear, String gender) {
		Date today = new Date();
		String res = "";
		int now = today.getYear() + 1900;
		int age = now - userYear;
		
		if (age >= 40 && now % 2 == userYear % 2) {
			res = "위암 간암 ";
			if (age >= 50) {
				res += "대장암 ";
			}
			
			if (gender.equals("여")) {
				res += "유방암 자궁암";
			}
		}
		
		return res;
	}
}

public class FreeCancerScreening {

	public static void main(String[] args) {
		MyUtil mu = new MyUtil();
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		int now = today.getYear() + 1900;
		String name, gender, res;
		int year;
		
		System.out.println("이름을 입력하시오");
		name = sc.next();
		System.out.println("성별(남/여)을 입력하시오");
		gender = sc.next();
		System.out.println("출생연도를 입력하시오");
		year = sc.nextInt();
		
		// chechArm 객체 생성
		res = mu.chechArm(year, gender);
		
		if (res.equals("")) {
			System.out.printf("%s님은 %d년도에 무료암검진 대상자가 아닙니다\n", name, now);
		} else {
			System.out.printf("%s님은 %d년도에 무료암검진 대상자이며\n"
					+ "검진항목은 %s입니다.\n", name, now, res);
		}
		
	}	

}
