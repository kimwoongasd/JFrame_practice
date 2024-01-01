package day1005;

import java.util.Scanner;

// n을 입력받아 n까지의 합을 구하여라

public class DoWhileTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		
		System.out.println("n을 입력하시오");
		n = sc.nextInt();
		
		do {
			sum += n;
			n--;
		} while (n > 0);
		
		System.out.println("총 합 : " + sum);
	}

}
