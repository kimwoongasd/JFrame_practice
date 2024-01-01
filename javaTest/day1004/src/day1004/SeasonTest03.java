package day1004;

import java.util.Scanner;

public class SeasonTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month;
		String season = "";
		
		System.out.println("월을 입력하시오");
		month = sc.nextInt();
		
		if (month < 0 || month > 12) {
			System.out.println("범위를 벗어남");
			return;
		}
		
		switch (month) {
			case 12:
			case 1:
			case 2: season = "겨울";break;
			case 3:
			case 4:
			case 5: season = "봄";break;
			case 6:
			case 7:
			case 8: season = "여름";break;
			case 9:
			case 10:
			case 11: season = "가을";break;
		}
		System.out.printf("%d월은 %s입니다", month, season);
	}

}
