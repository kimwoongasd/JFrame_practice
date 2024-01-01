package day1011;

import java.util.Scanner;

public class Progamming3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, total = 0;
		double avg = 0;
		System.out.println("1차원 배열 n을 입력하시오");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번에 들어갈 정수를 입력하시오", i + 1);
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		
		avg = (double)total / (double)arr.length;
		int max = arr[0], min = arr[0];
		
		for (int x : arr) {
			if (x > max) {
				max = x;
			}
			
			if (x < min) {
				min = x;
			}
		}
		
		System.out.println("배열 원소의 합계 : " + total);
		System.out.println("배열 원소의 평균 : " + avg);
		System.out.println("배열 원소의 최대값 : " + max);
		System.out.println("배열 원소의 최소값 : " + min);
		
	}

}
