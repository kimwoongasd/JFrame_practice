package day1006;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = 0, b = 1, c;
		int n;
		
		System.out.println("어디까지 출력할 것인가?");
		n = sc.nextInt();
		
		System.out.print(a + " " + b + " ");
		
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
		
		
	}

}
