package method11;

import java.util.Scanner;

class MyUtil {
	// 세개의 정수를 매개변수를 전달받는다
	// 세 수중에 큰수를 찾아 반환하고 호출
	public int bigNumber(int a, int b) {
		if (b > a) {
			a = b;
		}
		return a;
	}
	
	public int bigNumber(int a, int b, int c) {
		return bigNumber(c, bigNumber(a, b));
	}
	
	// 정수형 변수 4개장 가장 큰수
	public int bigNumber(int a, int b, int c, int d) {
		return bigNumber(a, b, bigNumber(c, d));
	}
	
}

public class MethodTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z, k;
		MyUtil mu = new MyUtil();
		
		System.out.println("정수를 입력하시오");
		x = sc.nextInt();
		System.out.println("정수를 입력하시오");
		y = sc.nextInt();
		System.out.println("정수를 입력하시오");
		z = sc.nextInt();
		System.out.println("정수를 입력하시오");
		k = sc.nextInt();
		
		System.out.println("큰 수는 " + mu.bigNumber(x, y, z, k));
	}

}
