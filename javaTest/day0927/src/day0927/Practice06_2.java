package day0927;

import java.util.Scanner;

public class Practice06_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("숫자를 입력하시오");
		n = sc.nextInt();
		
		if (1 > n || n > 100) {
			System.out.println("범위 밖 숫자입니다");
		} else {
			System.out.println("1~100 사이 숫자입니다");
		}
	}
}
