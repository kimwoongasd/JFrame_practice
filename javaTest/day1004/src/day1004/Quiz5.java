package day1004;

import java.util.Scanner;

// n을 입력받아 n의 약수를 모두 출력

public class Quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, cnt = 0;
		boolean res = true;
		
		System.out.println("n을 입력하시오");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				cnt += 1;
				if (cnt >= 3) {
					res = false;
					break;
				}
			}
		}

		if (res) {
			System.out.println(n + "은 소수 입니다");
		} else {	
			System.out.println(n + "은 소수가 아닙니다");
		}		
	}
}
