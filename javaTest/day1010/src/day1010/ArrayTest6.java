package day1010;

import java.util.Scanner;

// 5명 학생의 점수를 입력받아 모두 출력
// 총점 평군을 계산

public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][4];
		int n = 1;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = n;
				n++;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
