package day1005;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row, col;
		
		System.out.println("줄수를 입력하시오");
		row = sc.nextInt();
		System.out.println("칸수를 입력하시오");
		col = sc.nextInt();
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				System.out.print("A");
			}
			System.out.println();
		}
		
	}

}
