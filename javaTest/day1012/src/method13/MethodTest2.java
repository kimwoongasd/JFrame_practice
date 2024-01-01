package method13;

import java.util.Scanner;

class MyUtil {
	// 0~9사이의 정수를 매개변수로 전달받아 한글표기식으로 반환
	public String toKor(int a) {
		String[] kor = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		
		return kor[a];
	}
}

public class MethodTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyUtil mu = new MyUtil();
		int n;
		System.out.println("0~9사이 숫자를 입력하시오");
		n = sc.nextInt();
		
		System.out.println(mu.toKor(n));
	}

}
