package day1004;

import java.util.Scanner;

public class LastDay02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, day;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하시오");
		n = sc.nextInt();
		
		if (n < 13 && n > 0) {
			if (n == 2) {
				day = 28;
			} else if (n == 4 || n == 6 || n == 9 || n == 11) {
				day = 30;
			} else {
				day = 31;
			}
			
			System.out.printf("%d월은 %s입니다.", n, day);
		} else {
			System.out.println("범위를 넘었습니다");
		}
	}

}
