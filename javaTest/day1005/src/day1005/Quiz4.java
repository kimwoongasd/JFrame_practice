package day1005;

import java.util.Scanner;

// n을 입력받아 소수인지 판별 while, do while문으로 작성

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, i = 1, cnt = 0;
		boolean res = true;
		
		System.out.println("n을 입력하시오");
		n = sc.nextInt();
		
		do {
			if (n % i == 0) {
				cnt++;
			}
			
			if (cnt > 2) {
				res = false;
				break;
			}
			
			i++;
		} while (i <= n);
		
		if (res) {
			System.out.println(n + "은 소수입니다");
		} else {
			System.out.println(n + "은 소수가 아닙니다");
		}
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int n, i = 1, cnt = 0;
//		boolean res = true;
//		
//		System.out.println("n을 입력하시오");
//		n = sc.nextInt();
//		
//		while (i <= n) {
//			if (n % i == 0) {
//				cnt++;
//			}
//			
//			if (cnt > 2) {
//				res = false;
//				break;
//			}
//			i++;
//		}
//		
//		if (res) {
//			System.out.println(n + "은 소수입니다");
//		} else {
//			System.out.println(n + "은 소수가 아닙니다");
//		}
		
	}

}
