package exam;

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
		int avg;
		// 같은 클래스에 있는 다른 메소드 호출
		avg = getSum(a) / a.length;
		
		return avg;
	}
	// 배열의 원소의 최대값을 구하여 반환 (메소드)
	public int getMax(int[] a) {
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		return max;
	}
	
	// 배열의 원소의 최소값을 구하여 반환 (메소드)
	public int getMin(int[] a) {
		int min = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
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
		
		int total = au.getSum(data);
		int avg = au.getAvg(data);
		int max = au.getMax(data);
		int min = au.getMin(data);
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
//		System.out.println();
//		System.out.println("합계 : " + au.getSum(data));
//		System.out.println("평균 : " + au.getAvg(data));
//		System.out.println("최대값 : " + au.getMax(data));
//		System.out.println("최소값 : " + au.getMin(data));
		
 	}

}
