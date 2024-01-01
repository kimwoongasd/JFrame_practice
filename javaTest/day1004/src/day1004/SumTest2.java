package day1004;

import java.util.Scanner;

// 1~10까지의 합을 누적하여 출력

public class SumTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, total = 0;
		
		System.out.println("어디까지의 합을 구할것인가?");
		n = sc.nextInt();
		
		for (int i=1; i <= n; i++) {
			total += i;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + total);
	}

}
