package day1005;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("줄수를 입력하시오");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i ++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("A");
			}
			System.out.println();
		}
	}

}
