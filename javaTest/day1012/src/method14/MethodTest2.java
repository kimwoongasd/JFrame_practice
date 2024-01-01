package method14;

import java.util.Scanner;

class MyUtil {
	// 0~99사이의 정수를 매개변수로 전달받아 한글표기식으로 반환
	public String toKor(int a) {
		String[] kor = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		String[] kor2 = {"", "십", "이십", "삼십", "사심", "오심", "육십", "칠십", "팔십", "구십"};
		int x, y;
		x = a % 10;
		y = a / 10;
		
		if (a == 0) {
			return kor[a];
		}
		
		if (a % 10 == 0) {
			return kor2[y];
		} else {
			return kor2[y] + kor[x];
		}
	}
}

public class MethodTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyUtil mu = new MyUtil();
		int n;
		System.out.println("0~99사이 숫자를 입력하시오");
		n = sc.nextInt();
		
		System.out.println(mu.toKor(n));
	}

}
