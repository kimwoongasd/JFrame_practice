package day1004;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// 중첩 if문
		// 정수 3개를 입력받아 가장 큰 수를 출력
		int a, b, c, res;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하시오");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a > b) {
			if (a > c) {
				res = a;
			} else {
				res = c;
			}
		} else {
			if (b > c) {
				res = b;
			} else {
				res = c;
			}
		}
		
		System.out.printf("가장 큰 수는 %d 입니다", res);
	}

}
