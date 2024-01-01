package day1006;

import java.util.Scanner;

public class Programming7_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("첫번째 숫자를 입력하시오");
		a = sc.nextInt();
		System.out.println("두번째 숫자를 입력하시오");
		b = sc.nextInt();
		System.out.println("세번째 숫자를 입력하시오");
		c = sc.nextInt();
		
		int min = a;
		
		if (b < min) {
			min = b;
		}
		
		if (c < min) {
			min = c;
		}
		
		
		System.out.println("가장 작은 수 : " + min);
	}

}
