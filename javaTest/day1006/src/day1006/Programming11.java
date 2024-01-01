package day1006;

import java.util.Scanner;

public class Programming11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("정수를 입력하시오");
		n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("0보다 작아 오류");
			return;
		}
		
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0 && i != 0) {
				System.out.println(i);
			}
		}
		
	}

}
