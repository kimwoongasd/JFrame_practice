package day1006;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double prod = 1.0, r;
		
		int i ,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("실수 r : ");
		r = sc.nextDouble();
		System.out.println("거듭제곱 횟수 : ");
		n = sc.nextInt();
		
		for (i = 1 ; i <= n ; i++) {
			prod *= r;
		}
		
		System.out.println(prod);
	}

}
