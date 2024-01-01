package day1010;

import java.util.Scanner;

// 5명 학생의 점수를 입력받아 모두 출력
// 총점 평군을 계산

public class ArrayTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] a = new int[60][10][30];
		int n = 1;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					a[i][j][k] = n;
					n++;
				}
			}
		}
		
		// 0으로 초기화
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					a[i][j][k] = 0;
				}
			}
		}
	}

}
