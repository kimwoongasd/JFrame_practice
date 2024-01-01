package exam08;

import java.util.Scanner;


// 이메일을 출력받아 id를 출력
public class StringTest11 {
	public static void main(String[] args) {
		String email;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이메일을 입력하시오");
		email = sc.next();
		
		String id;
		id = email.substring(0, email.indexOf("@"));
		
		System.out.println("id : " + id);
	}	
}
