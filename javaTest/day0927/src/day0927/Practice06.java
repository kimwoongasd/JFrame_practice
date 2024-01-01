package day0927;

import java.util.Scanner;

/*
임의의 수 을 입력받아 그 수가 1~100사이의 수인지 판별하는 프로그램 작성  
*/

public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("숫자를 입력하시오");
		n = sc.nextInt();
		
		if (1 <= n && n <= 100) {
			System.out.println("1~100 사이 숫자가 맞습니다");
		} else {
			System.out.println("1~100 사이 숫자만 입력하시오");
		}
	}

}
