package exam01;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		// Exception 에러
//		String data = "백";
		
		// 예외처리
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("데이터를 입력하시오");
			String data = sc.next();
			int n = Integer.parseInt(data);
			System.out.println(n);
		} catch(Exception e) { // 에러가 발생하면 catch안 코드가 실행 되고e 변수에 담긴다
			System.out.println("올바른 입력이 아닙니다");
			System.out.println(e);
		}
	
	}

}
