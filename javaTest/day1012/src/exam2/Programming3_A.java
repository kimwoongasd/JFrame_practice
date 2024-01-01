package exam2;

import java.util.Scanner;

class ArrayUtil {
	// 배열의 원소의 합계을 구하여 반환 (메소드)
	// void는 return값이 없을 떄 사용
	public void printSum(int[] a) {
		int total = 0;
		for (int x : a) {
			total += x;
		}
		System.out.println("총합 " + total);
	}
	
	// 배열의 원소의 평균을 구하여 반환 (메소드)
	public void printAvg(int[] a) {
		int avg, total = 0;
		for (int x : a) {
			total += x;
		}
		
		avg = total / a.length;
		
		System.out.println("평균 " + avg);
	}
	// 배열의 원소의 최대값을 구하여 반환 (메소드)
	public void printMax(int[] a) {
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		System.out.println("최대값 " + max);
	}
	
	// 배열의 원소의 최소값을 구하여 반환 (메소드)
	public void printMin(int[] a) {
		int min = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("최소값 " + min);
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
		
		// return값이 없으므로 변수에 지정 불가
		au.printSum(data);
		au.printAvg(data);
		au.printMax(data);
		au.printMin(data);
		
//		System.out.println();
		// return값(반환값)이 없는 메소드는 출력문에 못쓴다
//		System.out.println("합계 : " + au.printSum(data));
//		System.out.println("평균 : " + au.printAvg(data));
//		System.out.println("최대값 : " + au.printMax(data));
//		System.out.println("최소값 : " + au.printMin(data));
		
 	}

}
