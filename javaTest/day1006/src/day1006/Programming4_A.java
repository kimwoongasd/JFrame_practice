package day1006;

import java.util.Scanner;

public class Programming4_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String eng, res = "자음";
		char ch;
		
		System.out.println("영문자 하나를 입력하시오");
		eng = sc.next().toUpperCase();
		ch = eng.charAt(0);
		
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'u') {
			res = "모음";
		}
		
		
//		switch (ch) {
//			case 'A':
//			case 'E':
//			case 'I':
//			case 'O':
//			case 'U':
//				res = "모음";
//				break;
//			default :
//				res = "자음";
//				break;
//		}
		
		System.out.println(ch + "는 " + res + "입니다");
	}

}
