package method6;

import java.util.Scanner;

class MyUtil {
	// 아이디와 비번을 매개변수
	// 관리자인지 블린형으로 판별
	public boolean isManaser (String id, String pw) {
		boolean re = true;
		if (!id.equals("aaa") || !pw.equals("1234")) {
			re = false;
		}
		
		return re;
	}
	
}

public class MethodTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyUtil mu = new MyUtil();
		String id, pw;
		
		System.out.println("관리자의 id를 입력하시오");
		id = sc.next();
		System.out.println("비밀번호를 입력하시오");
		pw = sc.next();
 ;
		if (mu.isManaser(id, pw)) {
			System.out.println("관리자입니다");
		} else {
			System.out.println("관리자가 아닙니다");
		}
	}

}
