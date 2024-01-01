package day1006;

import java.util.Scanner;

public class Programming1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String op;
		int a, b, res = 0;
		
		System.out.println("연산자를 입력하시어[+, -, *, /]");
		op = sc.next();
		
		System.out.println("첫번쨰 수를 입력하시오");
		a = sc.nextInt();
		System.out.println("두번쨰 수를 입력하시오");
		b = sc.nextInt();
		
		if (op.equals("/")) {
			while (true) {
				if (a > 0) {
					break;
				}
			}
		}

		
		if (op.equals("+")) {
			res = a + b;
		} else if (op.equals("-")) {
			res = a - b;
		} else if (op.equals("*")) {
			res = a * b;
		} else if (op.equals("/")) {
			if (a != 0) {
				res = a /b;
			}	
		}
		
		System.out.println(res);
		
	}

}
