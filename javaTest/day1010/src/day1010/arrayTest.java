package day1010;

import java.util.Scanner;

// 5명 학생의 점수를 입력받아 모두 출력
// 총점 평군을 계산

public class arrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);
		int tot = 0, avg;
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("점수를 입력하시오");
			score[i] = sc.nextInt();
			tot += score[i];
		}
		
		avg = tot / score.length;
		
		System.out.println("*** 성적 처리 결과 ***");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d번 학생의 점수 : %d\n", i + 1, score[i]);
		}
		System.out.println("총점 " + tot);
		System.out.println("평균 " + avg);
		
	}

}
