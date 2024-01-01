package day0927;

import java.util.Scanner;

// 임의의 정수를 입력받아 그 수가 짝수인지 홀수인지 판별하는 프로그램

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("숫자를 입력하시오");
		num = sc.nextInt();
		
		if (num % 2 == 1) {
			System.out.println(num + "은 홀수 입니다.");
		} else {
			System.out.println(num + "은 짝수 입니다.");
		}

	}

}
