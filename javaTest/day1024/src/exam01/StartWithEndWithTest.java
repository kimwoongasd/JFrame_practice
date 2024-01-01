package exam01;

import java.util.Scanner;

public class StartWithEndWithTest {

	public static void main(String[] args) {
		String data;
		Scanner sc = new Scanner(System.in);
		System.out.println("데이터를 입력하시오");
		data = sc.next();
		
		// 시작하는 문자열을 비교 == boolean 값을 반환
		if (data.startsWith("자바")) {
			System.out.println("올바른 입력값");
		} else {
			System.out.println("잘못된 입력값");
		}
		
//		String data = "자바 안녕";
//		System.out.println(data.startsWith("자"));
//		System.out.println(data.startsWith("자바"));
//		System.out.println(data.startsWith("j"));
//		
//		
//		System.out.println("--------------------------");
//		System.out.println(data.endsWith("hello"));
//		System.out.println(data.endsWith("안녕"));
//		System.out.println(data.endsWith("녕"));
//		System.out.println(data.endsWith("gello"));
//		System.out.println(data.endsWith("안"));
	}

}
