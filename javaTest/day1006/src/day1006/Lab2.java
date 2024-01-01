package day1006;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s, res = "";
		
		System.out.println("문자를 입력하시오");
		s = sc.next();
		
		switch (s) {
			case "a":
			case "A":
			case "e":
			case "E":
			case "i":
			case "I":
			case "o":
			case "O":
			case "u":
			case "U":
				res = "모음";
				break;
			default:
				res = "자음";
				break;
		}
		
		System.out.printf("입력된 문자는 %s는 %s입니다", s, res);
	}

}
