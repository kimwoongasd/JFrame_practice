package exam09;

import java.util.Scanner;

public class AvgTest {
	public static int getAverage(int[] data) {
		int avg, total = 0;

		for (int i = 0; i < data.length; i++) {
			total += data[i];
		}
		
		avg = total / data.length;
		return avg;
		
	}
	
	public static void main(String[] args) {
		try {
			int[] arr = new int[10];
			Scanner sc = new Scanner(System.in);
			
			for (int i = 0; i < arr.length; i++) {
				System.out.println((i + 1) + "번째 정수를 입력핫오");
				arr[i] = sc.nextInt();
			}
			
			System.out.println(getAverage(arr));
		} catch (ArithmeticException e) {
			System.out.println("에외발생 : " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("에외발생 : " + e.getMessage());
		} catch (NegativeArraySizeException e) {
			System.out.println("에외발생 : " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("에외발생 : " + e.getMessage());
		}
	}
}
