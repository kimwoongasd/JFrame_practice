package day0927;

import java.util.Scanner;


// 사용자 한테 두개의 정수를 입력받아 사칙연산의 결과를 출력
public class FourBasicOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x, y, add, sub, multi, div;
		
		System.out.println("첫번째 수를 입력하시오");
		x = sc.nextInt();
		System.out.println("두번째 수를 입력하시오");
		y = sc.nextInt();
		
		add = x + y;
		sub = x - y;
		multi = x * y;
		div = x / y;
		
		System.out.println("더하기 결과 : " + add);
		System.out.println("빼기 결과 : " + sub);
		System.out.println("곱하기 결과 : " + multi);
		System.out.println("나누기 결과 : " + div);
	}

}
