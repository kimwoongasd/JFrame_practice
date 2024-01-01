package exam06;

import java.util.Scanner;

// 월을 매개변수로 전달받아 계절명을 출력하는 메소드
class SistUtil {
	public void season(int n) {
		String[] str = {"겨울", "겨울", "봄", "봄", "봄",
				"여름", "여름", "여름", "가을", "가을", "가을", "겨울"};
		
		System.out.println(n + "월은 " + str[n - 1] + "입니다");
//		switch (n) {
//			case 12:
//			case 1:
//			case 2: res = "겨울"; break;
//			case 3:
//			case 4:
//			case 5: res = "봄"; break;
//			case 6:
//			case 7:
//			case 8: res = "여름"; break;
//			case 9:
//			case 10:
//			case 11: res = "가을"; break;
//		}
//		
//		System.out.println(n + "월은 " + res + "입니다");
	}
}

public class MethodTest {

	public static void main(String[] args) {
		SistUtil su = new SistUtil();
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("월을 입력하시오");
		n = sc.nextInt();
		
		su.season(n);
	
	}

}
