package exam01;

import java.util.Scanner;


//이메일을 입력받아 .com, net, kr 등으로 끝나는지 화인
public class ValidEmailTest {

	public static void main(String[] args) {
		String data;
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일를 입력하시오");
		data = sc.next();
		
		String[] arr = {".net", ".kr", ".net", "go.kr", "or.kr", "co.kr"};
		boolean isEmail = false;
		// 끝나는 문자열을 비교
		
		for (String v : arr) {
			if (data.endsWith(v)) {
				isEmail = true;
				break;
			}
		}
		
		if (isEmail) {
			System.out.println("올바른 입력값");
		} else {
			System.out.println("올바른 이메일이 아닙니다");
		}

	}

}
