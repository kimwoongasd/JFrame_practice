package day1005;

import java.util.Scanner;

// 0~9사이 수를 입력받아 한글표기
public class WhileTest7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"영", "일", "이", "삼", "사", "오", "육", "칠", "필", "구"};
		int n;
		
		while(true) {
			System.out.println("0~9사이 수를 입력");
			n = sc.nextInt();
			
			if (n >= 0 && n <= 9) {
				break;
			}
		}
		
		
		System.out.println(arr[n]);
	}

}
