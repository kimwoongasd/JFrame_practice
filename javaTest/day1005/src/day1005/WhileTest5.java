package day1005;

import java.util.Scanner;

public class WhileTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row, col;
		
		System.out.println("줄 수를 입력하시오");
		row = sc.nextInt();
		System.out.println("칸 수를 입력하시오");
		col = sc.nextInt();
		
		int i = 1;
		while (i <= row) {
			int j = 1;
			while (j <= col) {
				System.out.print("A");
				j++;
			}
			
			i++;
			System.out.println();
		}
	}

}
