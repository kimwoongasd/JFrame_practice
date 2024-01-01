package day1013;

import java.util.Scanner;

// 나누기 한 결과를 출력
public class RuntimeError {

	public static void main(String[] args) {
		// 실행 오류
		// 사용자가 값을 잘못입력하면 오류
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번쨰 수를 입력하시오");
		a = sc.nextInt();
		System.out.println("두번쨰 수를 입력하시오");
		b = sc.nextInt();
		
		System.out.println("나누기 결과 : " + (a / b));
	}

}
