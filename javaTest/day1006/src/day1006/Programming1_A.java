package day1006;

import java.util.Scanner;

public class Programming1_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String op;
		int a, b, res = 0;
		
		System.out.println("연산자를 입력하시어[+, -, *, /]");
		op = sc.next();
		
		if (!op.equals("+") && !op.equals("-") && !op.equals("/") && !op.equals("*")) {
			System.out.println("잘못된 연산자 입니다");
			return;
		}
		
		System.out.println("첫번쨰 수를 입력하시오");
		a = sc.nextInt();
		System.out.println("두번쨰 수를 입력하시오");
		b = sc.nextInt();
		
		switch (op) {
		case "+" :
			res = a + b;
			break;
		case "-" :
			res = a - b;
			break;
		case "*" :
			res = a * b;
			break;
		case "/" :
			if (b == 0) {
				System.out.println("입력오류 : 0으로 나눌 수 없습니다");
				return;
			}
			res = a / b;
			break;
		}
		
		System.out.println("결과 : " + res);
		
	}

}
