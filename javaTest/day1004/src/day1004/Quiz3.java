package day1004;

import java.util.Scanner;

// n을 입력받아 1~n까지의 6의 배수를 모두 출력

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("n을 입력하시오");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i % 6 == 0) {
				System.out.println(i);
			}
		}
		
	}

}
