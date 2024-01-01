package day1004;

import java.util.Scanner;

public class BigNumber04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, res;
		System.out.println("첫번쨰 수를 입력하시오");
		a = sc.nextInt();
		
		if (a >= 0 ) {
			res = a + 100;
		} else {
			res = a * a;
		}
		
		System.out.println(res);
		System.out.println("작업종료");
		
	}

}
