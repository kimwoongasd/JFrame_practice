package day1006;

import java.util.Scanner;

public class Programming15_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = 0, a = 0, b = 1, y = 0;
		
		while (n <= 20) {
			if (n == 0) {
				y = a;
			}
			
			if (n == 1) {
				y = b;
			}
			
			if (n >= 2) {
				y = a + b;
			}			
		
			System.out.printf("%d = %d \n", n, y);
		
			if (n >= 2) {
				a= b;
				b = y;
			}
			
			n++;
		}
		
	}

}
