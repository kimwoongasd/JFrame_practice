package exam08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroTest {

	public static void main(String[] args) {
		int number1, number2, result;
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("첫 번쨰 정수 : ");
			number1 = sc.nextInt();
			System.out.println("두 번쨰 정수 : ");
			number2 = sc.nextInt();
			
			result = quotient(number1, number2);
			System.out.println(result);
		} catch (DivideByZeroException e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
		
		
	}
		
	public static int quotient (int numerator, int denominator) throws DivideByZeroException {
		if (denominator == 0) {
			throw new DivideByZeroException("0으로 나눌 수 없습니다");
		}

		return numerator / denominator;
	}
}

