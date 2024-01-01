package exam03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDivTest2 {

	public static void main(String[] args) {
		// 두개의 정수를 입력받아 나누기 한 결과를 출력
		Scanner sc = new Scanner(System.in);
		int n, m, res;
		
		// 하나의 try문에 여러개의 catch가 올 수 있다
		try {
			System.out.println("정수를 입력하시오");
			n = sc.nextInt();
			System.out.println("정수를 입력하시오");
			m = sc.nextInt();

			res = n / m;
			System.out.println("나누기 결과 : " + res);
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해야한다");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다");
		}
		
		
	}

}
