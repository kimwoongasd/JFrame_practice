package day0927;

import java.util.Scanner;

// 두개의 정수를 입벽받아 그 중에 큰수를 찾아 출력

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.println("첫번째 숫자를 입력하시오");
		a = sc.nextInt();
		System.out.println("두번째 숫자를 입력하시오");
		b = sc.nextInt();
		
		if (a > b) {
			System.out.println(a + "가 더 크다 " + b + "보다");
		} else {
			System.out.println(b + "가 더 크다" + a + "보다");
		}
		
	}

}
