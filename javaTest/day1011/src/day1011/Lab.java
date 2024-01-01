package day1011;

import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("정수를 입력하시오");
			arr[i] = sc.nextInt();
		}
		
		for (int x : arr) {
			System.out.println(x);
		}
		
		// 역순 출력
		for (int i = arr.length - 1; i > -1; i--) {
			System.out.println(arr[i]);
		}
	}

}
