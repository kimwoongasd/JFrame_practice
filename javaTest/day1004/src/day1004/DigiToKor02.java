package day1004;

import java.util.Scanner;

public class DigiToKor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		String res = "";
		
		System.out.println("0~9 사이 숫자를 입력하시오");
		n = sc.nextInt();
		
		if (0 <= n && n <= 9) {
			if (n == 0) {
				res = "영";
			} else if (n == 1) {
				res = "일";
			} else if (n == 2) {
				res = "이";
			} else if (n == 3) {
				res = "삼";
			} else if (n == 4) {
				res = "사";
			} else if (n == 5) {
				res = "오";
			} else if (n == 6) {
				res = "육";
			} else if (n == 7) {
				res = "칠";
			} else if (n == 8) {
				res = "팔";
			} else if (n == 9) {
				res = "구";
			}
		} else {
			res = "범위를 넘었습니다.";
		}
		
		
		System.out.println(res);
	}

}
