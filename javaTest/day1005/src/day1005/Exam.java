package day1005;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, sum = 1;
		System.out.println("n을 입력하시오");
		n = sc.nextInt();
		
		for (int i = n; i > 0; i--) {
			sum = sum * i;
			System.out.print(i);
			if (i > 1) {
				System.out.print("*");
			}
		}
		
		System.out.println("=" + sum);
	}

}
