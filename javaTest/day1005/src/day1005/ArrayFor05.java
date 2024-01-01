package day1005;

import java.util.Scanner;

// 5명의 점수를 입력받아 가장 작은값

public class ArrayFor05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		
		
		for (int i = 0; i < data.length; i++) {
			System.out.println("점수를 입력하시오");
			data[i] = sc.nextInt();
		}
		
		int max = data[0];
		
		for (int i = 1; i < data.length; i++) {
			if (max > data[i]) {
				max = data[i];
			}
		}
		System.out.println("가장 작은 수 : " + max);
	}

}
