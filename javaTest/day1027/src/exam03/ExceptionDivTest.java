package exam03;

import java.util.Scanner;

public class ExceptionDivTest {

	public static void main(String[] args) {
		// 두개의 정수를 입력받아 나누기 한 결과를 출력
		Scanner sc = new Scanner(System.in);
		int n, m, res;
		System.out.println("정수를 입력하시오");
		n = sc.nextInt();
		System.out.println("정수를 입력하시오");
		m = sc.nextInt();
		
		res = n / m;
		System.out.println("나누기 결과 : " + res);
	}

}
