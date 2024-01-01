package exam13;

import java.util.Scanner;

// 월을 매개변수로 전달받아 그 달의 마지막날을 반환하는 메소드
class SistUtil {
	public int lastDay(int month) {
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		return day[month - 1];
	}
}

public class MethodTest {

	public static void main(String[] args) {
		SistUtil su = new SistUtil();
		Scanner sc = new Scanner(System.in);
		int m;
		System.out.println("월을 입력하시오");
		m = sc.nextInt();

		
		System.out.println(su.lastDay(m));
	}
}
