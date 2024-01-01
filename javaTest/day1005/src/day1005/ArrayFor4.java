package day1005;

import java.util.Scanner;

public class ArrayFor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0;
		double avg;
		
		for (int i = 0; i <score.length; i++) {
			System.out.printf("%d번째 학생의 점수를 입력하시오\n", i + 1);
			score[i] = sc.nextInt();
			sum += score[i];
		}
		
		avg = sum / (double)score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
