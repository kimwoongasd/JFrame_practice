package day0926;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int com, c, eng, math;
		double avg;
		
		System.out.print("컴퓨터 개론 과목의 점수를 입력하시오 === ");
		com = sc.nextInt();
		System.out.print("C언어 프로그래밍 과목의 점수를 입력하시오 === ");
		c = sc.nextInt();
		System.out.print("영어 과목의 점수를 입력하시오 === ");
		eng = sc.nextInt();
		System.out.print("일반수학 개론 과목의 점수를 입력하시오 === ");
		math = sc.nextInt();
		
		avg = (com + c + eng + math) / 4.0;
		
		System.out.println("평균 점수는 " + avg + "점 입니다.");
		
	}

}
