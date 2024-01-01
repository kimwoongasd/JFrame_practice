package day0927;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		int n, day;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하시오");
		n = sc.nextInt();
		
		if (n == 2) {
			day = 28;
		} else if (n == 4 || n == 6 || n == 9 || n ==11) {
			day = 30;
		} else {
			day = 31;
		}
		
		System.out.printf("%d월은 %s입니다.", n, day);
	}
}
