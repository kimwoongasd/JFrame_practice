package day1004;

import java.util.Scanner;

// n을 입력받아 n이 소수인지 판별 

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("n을 입력하시오");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
	}

}
