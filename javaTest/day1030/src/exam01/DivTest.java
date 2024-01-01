package exam01;

import java.util.Scanner;

// 두개 정수 입력받아 나누기 결과 출력
// 2번쨰 값에 0이 들어가면 예외가 발생하는데
// 이 예외는 RuntimeExcetion의 후손이기 때문에 따로 예외처리 하지 않아도 된다
public class DivTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, div;
		
		System.out.println("정수를 입력하시오");
		a = sc.nextInt();
		System.out.println("정수를 입력하시오");
		b = sc.nextInt();
		
		div = a / b;
		
	}

}
