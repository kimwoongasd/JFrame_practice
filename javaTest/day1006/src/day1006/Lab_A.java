package day1006;

import java.util.Scanner;

public class Lab_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s;
		System.out.println("점수를 입력하시오");
		s = sc.nextInt();
		
		if (s >= 60) {
			System.out.println("합격");
			System.out.println("축하합니다");
		} else {
			System.out.println("불합격");
		}
	}

}
