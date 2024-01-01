package day1004;

import java.util.Scanner;

// for문을 이용하여 프로그램 작성하시오
// n을 입력하면 n!의 값을 구하시오

public class FactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, res = 1;
		
		System.out.println("n을 입력하시오");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		
		System.out.println(res);

	}

}
