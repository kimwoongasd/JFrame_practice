package method8;

import java.util.Scanner;

class MyUtil {
	// 두개의 정수를 매개변수를 전달받는다
	// 두 수중에 큰수를 찾아 반환하고 호출
	public int getMax(int a, int b) {
		if (b > a) {
			a = b;
		}
		return a;
	}
	
}

public class MethodTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		MyUtil mu = new MyUtil();
		
		System.out.println("정수를 입력하시오");
		x = sc.nextInt();
		System.out.println("정수를 입력하시오");
		y = sc.nextInt();
		
		System.out.println("큰 수는 " + mu.getMax(x, y));
	}

}
