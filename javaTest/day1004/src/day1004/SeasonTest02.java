package day1004;

import java.util.Scanner;

public class SeasonTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, day;
		String season = "겨울";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하시오");
		n = sc.nextInt();
		
		if (1 <= n && n <= 12) {
			if (3 <= n && n <= 5) {
				season = "봄";
			} else if (6 <= n && n <= 8) {
				season = "여름";
			} else if (9 <= n && n <= 11) {
				season = "가을";
			}
			
			System.out.printf("%d월은 %s입니다.", n, season);
		} else {
			System.out.println("범위를 넘었습니다");
		}
		
		
	}

}
