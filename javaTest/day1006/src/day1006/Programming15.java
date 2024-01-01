package day1006;

import java.util.Scanner;

public class Programming15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("n을 입력하시오");
		n = sc.nextInt();
		
		int [] arr = new int[n + 2];
		
		arr[0] = 0;
		arr[1] = 1;
		
		for (int i = 2; i < n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
