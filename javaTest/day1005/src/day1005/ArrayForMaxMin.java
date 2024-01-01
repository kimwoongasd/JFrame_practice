package day1005;

import java.util.Scanner;

// 5명의 점수를 입력받아 가장 작은값

public class ArrayForMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] data = {8, 28, 10, 36, 17, 33};
		int max = data[0], min = data[0];
		
		
		for (int i = 1; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
			
			if (min > data[i]) {
				min = data[i];
			}
		}
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 작은 수 : " + min);
	}

}
