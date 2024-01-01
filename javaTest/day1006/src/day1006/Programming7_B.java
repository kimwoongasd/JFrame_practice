package day1006;

import java.util.Scanner;

public class Programming7_B {

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
		
		if (b < a) {
			a = b;
		}
		
		if (c < a) {
			a = c;
		}
		
		
		System.out.println("가장 작은 수 : " + a);
	}

}
