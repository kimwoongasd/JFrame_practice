package day0927;

import java.util.Scanner;

/*
정부에서는 40세 이상인 사람들에게 무료로 암검진을 실시합니다.
이름과 출생연도를 입력받아 무료암검진 대상자 인지
판별하는 프로그램을 작성합니다.
*/

public class FreeCancerScreening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		int year, age;
		
		System.out.println("이름을 입력하시오");
		name = sc.next();
		System.out.println("출생연도를 입력하시오");
		year = sc.nextInt();
		
		age = 2023 - year;
		
		if (age >= 40) {
			System.out.printf("%s님 무료암검진 대상자 입니다.", name);
		} else {
			System.out.printf("%s님 무료암검진 대상자가 아닙니다.", name);
		}
		
	}

}
