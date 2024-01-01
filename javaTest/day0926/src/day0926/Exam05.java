package day0926;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input, h, m, s;
		System.out.println("시간을 초 단위로 입력하시오 === ");
		input = sc.nextInt();
		
		
		s = input % 60;
		input = input / 60;
		m = input % 60;
		input = input / 60;
		h = input;
		
		System.out.println(h + "시 " + m +"분 " + s + "초");
				
	}

}
