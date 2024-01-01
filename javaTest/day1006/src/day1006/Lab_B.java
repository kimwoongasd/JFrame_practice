package day1006;

import java.util.Scanner;

public class Lab_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s;
		String res = "";
		System.out.println("점수를 입력하시오");
		s = sc.nextInt();
		
		if (s >= 80) {;
			System.out.println("아주 우수하게 합격입니다");
		} else if (s >= 70) {
			System.out.println("우수하게 합격하셨습니다");
		} else if (s >= 60 ) {
			System.out.println("합셧입니다");
		} else if (s >= 50) {
			System.out.println("안타깝게 블합격입니다");
		}
		else {
			System.out.println("불합격");
		}
	}

}
