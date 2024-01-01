package day1010;

import java.util.Scanner;

// 5명 학생의 점수를 입력받아 모두 출력
// 총점 평군을 계산

public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[4]; // 1차원 배열
		int n = 1 ;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = n;
			n++;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
