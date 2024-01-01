package exam07;

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
			
			result = number1 / number2;
			System.out.println(result);
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력하시오");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
		}
	}

}
