package method17;

import java.util.Scanner;

class MyUtil {
	// n을 매개변수로 전달받아 n!를 구하여 출력하는 메소드 호출
	public void printFact(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		
		System.out.println(n + "! = " + res);
	}
	
	// n을 매개변수로 전달받아 n의 약수를 모두 출력하는 메소드 호출
	public void printDiv(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) System.out.print(i + " ");
		}
		System.out.println();
	}
	// n을 매개변수로 전달받아 n이 소수인지 판별하여 결과 반환하는 메소드 호출
	public boolean isPrimeNumber(int n) {
		boolean res = true;
		int cnt = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) cnt++;
//		}
//		
//		if (cnt > 2) res = false;
		
		return res;
	}
}

public class MethodTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyUtil mu = new MyUtil();
		int n;
		
		System.out.println("정수를 입력하시오");
		n = sc.nextInt();
		
		mu.printFact(n);
		mu.printDiv(n);
		
		if (mu.isPrimeNumber(n)) {
			System.out.println(n + "은 소수입니다");
		} else {
			System.out.println(n + "은 소수가 아닙니다");
		}
	}
}
