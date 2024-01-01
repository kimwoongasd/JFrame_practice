package day1012;

import java.util.Scanner;

class ArrayUtil {
	// 배열의 원소의 합계을 구하여 반환 (메소드)
	public int getSum(int[] a) {
		int total = 0;
		for (int x : a) {
			total += x;
		}
		return total;
	}
	
	// 배열의 원소의 평균을 구하여 반환 (메소드)
	public int getAvg(int[] a) {
		int total = 0, avg;
		for (int x : a) {
			total += x;
		}
		
		avg = total / a.length;
		
		return avg;
	}
	// 배열의 원소의 최대값을 구하여 반환 (메소드)
	public int getMax(int[] a) {
		int max = a[0];
		
		for (int x : a) {
			if (x > max) {
				max = x;
			}
		}
		
		return max;
	}
	
	// 배열의 원소의 최소값을 구하여 반환 (메소드)
	public int getMin(int[] a) {
		int min = a[0];
		
		for (int x : a) {
			if (x < min) {
				min = x;
			}
		}
		return min;
	}
}

public class Programming3_A {

	public static void main(String[] args) {
		ArrayUtil au = new ArrayUtil();
		int[] data;
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("n을 입력하시오");
		n = sc.nextInt();
		data = new int[n];
		
		// 반복문을 이용하여 n개 만큼 배열에 데이터 입력
		for (int i = 0; i < data.length; i++) {
			System.out.println("데이터 입력");
			data[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("합계 : " + au.getSum(data));
		System.out.println("평균 : " + au.getAvg(data));
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
		
 	}

}
