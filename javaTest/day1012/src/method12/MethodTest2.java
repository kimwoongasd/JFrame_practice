package method12;

import java.util.Scanner;

class MyUtil {
	// 0~9사이의 정수를 매개변수로 전달받아 한글표기식으로 반환
	public String toKor(int a) {
		String res = "";
		switch (a) {
			case 0: res = "영"; break;
			case 1: res = "일"; break;
			case 2: res = "이"; break;
			case 3: res = "삼"; break;
			case 4: res = "사"; break;
			case 5: res = "오"; break;
			case 6: res = "육"; break;
			case 7: res = "칠"; break;
			case 8: res = "팔"; break;
			case 9: res = "구"; break;
		}
		
//		if (a == 0) {
//			res = "영";
//		} else if (a == 1) {
//			res = "일";
//		} else if (a == 2) {
//			res = "이";
//		} else if (a == 3) {
//			res = "삼";
//		} else if (a == 4) {
//			res = "사";
//		} else if (a == 5) {
//			res = "오";
//		} else if (a == 6) {
//			res = "육";
//		} else if (a == 7) {
//			res = "칠";
//		} else if (a == 8) {
//			res = "팔";
//		} else {
//			res = "구";
//		}
		return res;
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
