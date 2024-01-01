package day1005;

import java.util.Scanner;

//- 10명의 점수를 입력받아 모두 출력
//총점, 평군, 최대점수, 최소점수 구하여 출력
//평균점수 미만의 학생수 구하기

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] score = new int[10];
		int total = 0, max, min, cnt = 0;
		double avg;
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(i + 1 + "번쨰 학생 점수를 입력하시오");
			score[i] = sc.nextInt();
			total += score[i];
		}
		
		avg = total / (double)score.length;
		max = score[0];
		min = score[0];
		
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
			
			if (min > score[i]) {
				min = score[i];
			}
			
			if (avg > score[i]) {
				cnt += 1;
			}
			
			System.out.println((i + 1) + "번 학생의 점수 " + score[i]);
		}
		System.out.println();
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("최대점수 : " + max);
		System.out.println("최소점수 : " + min);
		System.out.println("평균 미만 학생 수 : " + cnt);
		
	}

}
