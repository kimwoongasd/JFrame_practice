package day1005;

import java.util.Scanner;

// n을 입력받아 n!을 구하여 while, do while문으로 작성

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, f = 1;
		System.out.println("n을 입력하시오");
		n = sc.nextInt();
		
		int i = n;
		do {
			f *= i;
			System.out.print(i);
			if (i != 1) {
				System.out.print("*");
			}
			i--;
		} while (i > 0);
		
		System.out.println(" = " + f);
		
		
//		Scanner sc = new Scanner(System.in);
//		int n, f = 1;
//		System.out.println("n을 입력하시오");
//		n = sc.nextInt();
//		
//		while (n > 0) {
//			f *= n;
//			n--;
//		}
//		
//		System.out.println("n! = " + f);
		
	}

}
