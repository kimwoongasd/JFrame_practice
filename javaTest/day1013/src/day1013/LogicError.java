package day1013;

import java.util.Scanner;

// n! 구하는 프로그램
public class LogicError {

	public static void main(String[] args) {
		// 논리오류
		// r값을 잘못줘서 의도와 다르게 실행
		int n, r = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("n을 입력하시오");
		n = sc.nextInt();
		
		for (int i = n; i >= 1; i--) {
			r *= i;
		}
		System.out.printf("%d! = %d", n, r);
	}

}
