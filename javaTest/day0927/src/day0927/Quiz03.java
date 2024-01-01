package day0927;

import java.util.Scanner;

// 월을 입력받아서 계절명을 출력
// 그 월의 마지막 날을 출력

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, day;
		String season = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하시오");
		n = sc.nextInt();
		
		if (3 <= n && n <= 5) {
			season = "봄";
		} else if (6 <= n && n <= 8) {
			season = "여름";
		} else if (9 <= n && n <= 11) {
			season = "가을";
		} else {
			season = "겨울";
		}
		
		
		System.out.printf("%d월은 %s입니다.", n, season);
		
	}

}
