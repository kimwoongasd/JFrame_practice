package day0927;

import java.util.Scanner;

// a, b 정수를 입력받아 누가 크고작고 같은지 판별하는 프로그램
public class MaxTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		String res = "";
		System.out.println("a를 입력하시오");
		a = sc.nextInt();
		System.out.println("b를 입력하시오");
		b = sc.nextInt();
		
		if (a > b) {
			res = "a가 크다";
		} else if (b > a) {
			res = "b가 크다";
		} else {
			res = "두 수가 같다";
		}
		
		System.out.println(res);
	}

}
