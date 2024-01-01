package day1004;

import java.util.Scanner;

// n을 입력받아 1~n까지의 짝수의합, 짝수 개수, 홀수의 합 홀수의 개수 각각 구하여 출력

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, evenTotal = 0, oddTotal = 0, evenCnt = 0, oddCnt = 0;
		
		System.out.println("n의 값을 입력하시오");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				evenCnt += 1;
				evenTotal += i;
			} else {
				oddCnt += 1;
				oddTotal += i;
			}
		}
		
		System.out.printf("짝수의 합 : %d  짝수의 개수 : %d\n", evenTotal, evenCnt);
		System.out.printf("홀수의 합 : %d  홀수의 개수 : %d", oddTotal, oddCnt);
		
	}

}
