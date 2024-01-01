package day0926;

import java.util.Scanner;

public class Exam04 {
	
	public static final double PYUNG = 3.3;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double input, res;
		System.out.println("*** 평을 평방미터로 환산하는 프로그림 ***");
		System.out.print("평을 입력하세요 === ");
		input = sc.nextDouble();
		
		res = input * Exam04.PYUNG;
		System.out.println(input + "평은" + res + "평방미터 입니다.");
		
	}
}
