package day1004;

import java.util.Scanner;

// 이름과 생년월일을 입력하여 별자리 알아보기

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, star = "";
		int month, day;
		
		System.out.println("*** 별자리 판별 프로그림 ***");
		System.out.println("이름을 입력하시오");
		name = sc.next();
		System.out.println("태어난 월을 입력하시오");
		month = sc.nextInt();
		System.out.println("태어난 일을 입력하시오");
		day = sc.nextInt();

		
		switch(month) {
			case 1:
				if (day > 19) {
					star = "물병";
				} else {
					star = "염소";
				}
				break;
			case 2:
				if (day > 18) {
					star = "물고기";
				} else {
					star = "물병";
				}
				break;
			case 3:
				if (day > 20) {
					star = "양";
				} else {
					star = "물고기";
				}
				break;
			case 4:
				if (day > 19) {
					star = "황소";
				} else {
					star = "양";
				}
				break;
			case 5:
				if (day > 20) {
					star = "쌍둥이";
				} else {
					star = "황소";
				}
				break;
			case 6:
				if (day > 21) {
					star = "게";
				} else {
					star = "쌍둥이";
				}
				break;
			case 7:
				if (day > 22) {
					star = "사자";
				} else {
					star = "게";
				}
				break;
			case 8:
				if (day > 22) {
					star = "처녀";
				} else {
					star = "사자";
				}
				break;
			case 9:
				if (day > 23) {
					star = "천칭";
				} else {
					star = "처녀";
				}
				break;
			case 10:
				if (day > 22) {
					star = "전갈";
				} else {
					star = "천칭";
				}
				break;
			case 11:
				if (day > 22) {
					star = "사수";
				} else {
					star = "전갈";
				}
				break;
			case 12:
				if (day > 24) {
					star = "염소";
				} else {
					star = "사수";
				}
				break;
		}
		
		System.out.printf("%s님의 별자리는 %s자리 입니다", name, star);
		
	}

}
