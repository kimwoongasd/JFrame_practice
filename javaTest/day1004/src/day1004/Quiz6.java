package day1004;

import java.util.Scanner;

// n을 입력받아 n의 약수의 개수

public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, cnt = 0;
		
		System.out.println("n을 입력하시오");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				cnt += 1;
			}
		}
		
		System.out.println(n + "의 약수의 개수는 " + cnt + "개");
	}
}
