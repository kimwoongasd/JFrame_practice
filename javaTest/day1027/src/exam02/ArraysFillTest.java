package exam02;

import java.util.Arrays;

public class ArraysFillTest {

	public static void main(String[] args) {
		// 크기가 10개인 정수렬 배열을 만드시오
		int[] arr = new int[10];
		
		// 배열 10개를 모두 100으로 채운다
		Arrays.fill(arr, 100);
		for (int v : arr) {
			System.out.print(v + " ");
		}
		
		System.out.println();
		System.out.println("-------------------------");
		
		// 배열의 뒤쪽 5개를 0으로 채운다
		Arrays.fill(arr, 5, arr.length, 0);
		for (int v : arr) {
			System.out.print(v + " ");
		}
		
		System.out.println();
		System.out.println("-------------------------");
		
		// 문자열 배열 10개를 생성
		String[] str = new String[10];
		
		// 배열의 앞부분은 짬뽕 뒷부분은 짜장
		Arrays.fill(str, 0, str.length / 2, "짬뽕");
		Arrays.fill(str, str.length / 2, str.length, "짜장");
		
		for (String s : str) {
			System.out.print(s + " ");
		}
 	}
}
