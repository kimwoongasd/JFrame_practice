package day1011;

import java.util.Scanner;

public class Progamming4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] sales = new int[5][4];
		int[] total = new int[4];
		for (int i = 0; i < sales.length; i++) {
			System.out.printf("%d 부서 매출액을 입력하시오\n", i + 1);
			for (int j = 0; j < sales[i].length; j++) {
				while (true) {
					System.out.printf("%d 분기 매출액을 입력하시오\n", j + 1);
					sales[i][j] = sc.nextInt();
					
					if (sales[i][j] >= 0) {
						break;
					}
				}
			}
		}
		
		// 분기별 매출액 합
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				total[i] += sales[j][i];
			}
		}
		
		for (int i = 0; i < 4; i++) {
			System.out.println((i + 1) + "분기 매출액");
			for (int j = 0; j < 5; j++) {
				System.out.println((j + 1) + "부서 매출액 : " + sales[i][j]);
			}
		}
		
		for (int i = 0; i < total.length; i++) {
			System.out.println((i + 1) + "분기 회사 전체 매출액 : " + total[i]);
		}
		
		
		for (int i = 0; i < total.length; i++) {
			double avg = total[i] / 5;
			System.out.println((i + 1) + "분기 회사 평균 매출액 : " + avg);
		}
		
		
		int max_dpm = 0, dpm = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				if (max_dpm < sales[j][i]) {
					max_dpm = sales[j][i];
					dpm = j + 1;
				}
			}
			System.out.printf("%d 분기 최고 매출 부서 : %d\n", i + 1, dpm);
		}
	}

}
