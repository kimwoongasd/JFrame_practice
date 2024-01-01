package day1004;

import java.util.Scanner;

public class LastDay06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, day = 31;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하시오");
		n = sc.nextInt();
		
		if (n > 12 || n < 1) {
			System.out.println("범위를 넘었습니다");
			return;
		} 
		
		if (n == 2) {
			day = 28;
		} else if (n == 4 || n == 6 || n == 9 || n == 11) {
			day = 30;
		}
		
		System.out.printf("%d월은 %s입니다.", n, day);
		
	}

}
