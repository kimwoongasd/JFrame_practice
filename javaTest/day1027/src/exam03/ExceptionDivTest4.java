package exam03;

// 예외가 발생된 것은 문제가 발생된 것이기 떄문에
// 해당 catch절을 동작하여 그 후 명령을 진핼하지 않는다

import java.util.Scanner;

public class ExceptionDivTest4 {

	public static void main(String[] args) {
		int a, b, div;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("첫번쨰 수를 입력하시오"); 
			a = sc.nextInt();
			System.out.println("두번쨰 수를 입력하시오"); 
			b = sc.nextInt();
			
			div = a / b;
			System.out.println("나누기 결과 : " + div);
			
			
		} catch (Exception e) { // e는 예외 발생시 생성된 객체
			System.out.println("예외 발생 : " + e.getMessage());
		} finally {
			System.out.println("작업종료");
		}
		
	}

}
