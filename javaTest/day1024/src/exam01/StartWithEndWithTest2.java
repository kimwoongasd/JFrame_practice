package exam01;

import java.util.Scanner;


//이메일을 입력받아 .com으로 끝나는지 화인
public class StartWithEndWithTest2 {

	public static void main(String[] args) {
		String data;
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일를 입력하시오");
		data = sc.next();
		
		// 끝나는 문자열을 비교
		if (data.endsWith(".com")) {
			System.out.println("올바른 입력값");
		} else {
			System.out.println("올바른 이메일이 아닙니다");
		}data.startsWith("자바");

	}

}
