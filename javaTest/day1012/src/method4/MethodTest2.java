package method4;

import java.util.Scanner;

class MyUtil {
	// 아이디와 비번을 매개변수
	// 관리자인지 블린형으로 판별
	public boolean isManaser (String id, String pw) {
		if (id.equals("aaa") && pw.equals("1234")) {
			return true;
		} else {
			return false;
		}
	}
	
}

public class MethodTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyUtil mu = new MyUtil();
		String id, pw;
		boolean flag;
		
		System.out.println("관리자의 id를 입력하시오");
		id = sc.next();
		System.out.println("비밀번호를 입력하시오");
		pw = sc.next();
		
		flag = mu.isManaser(id, pw);
		if (flag) {
			System.out.println("관리자입니다");
		} else {
			System.out.println("관리자가 아닙니다");
		}
	}

}
