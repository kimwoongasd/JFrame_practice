package day1004;

import java.util.Scanner;

public class BigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a ,b ,max;
		System.out.println("첫번쨰 수를 입력하시오");
		a = sc.nextInt();
		System.out.println("두번쨰 수를 입력하시오");
		b = sc.nextInt();
		
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		
		System.out.println("가장 큰 수는 : " + max);
	}

}
