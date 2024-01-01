package exam08;

import java.util.Scanner;

public class StringTest8 {
	public static void main(String[] args) {
		String email;
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일을 입력하시오"); 
		email = sc.next();
		
		// 문자열 위치를 찾거나 해당 문자의 유뮤확인
		// 찾는 값이 없을 떄 -1 리턴
		if (email.indexOf("@") != -1) {
			System.out.println("이메일이 맞다");
		} else {
			System.out.println("이메일이 아님");
		}
	}
}
