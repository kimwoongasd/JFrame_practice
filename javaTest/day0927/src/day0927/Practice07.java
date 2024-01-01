package day0927;

import java.util.Scanner;

// 삼항연산자
/*
두개의 정수를 입력받아 그 중에 큰 수를 찾는 프로그램 
*/
public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x, y, res;
		
		System.out.println("첫번째 숫자를 입력하시오");
		x = sc.nextInt();
		System.out.println("두번째 숫자를 입력하시오");
		y = sc.nextInt();
		
		res = (x > y) ? x : y;
		System.out.println("큰 수는 : " + res);

	}

}
