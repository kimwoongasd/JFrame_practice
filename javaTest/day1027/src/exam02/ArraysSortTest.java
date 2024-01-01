package exam02;

import java.util.Arrays;

public class ArraysSortTest {

	public static void main(String[] args) {
		// 크기가 10인 정수열 배열을 순서 섞어 초기화
		int[] arr = {2, 10, 1, 9, 5, 4, 7, 8, 9, 3};
		
		// 배열을 정렬하여 출력
		Arrays.sort(arr);
		for (int v : arr) {
			System.out.print(v + " ");
		}
		System.out.println();
		System.out.println("-----------------------");
		
		// 문자열 정렬
		String[] str = {"ㅁ", "ㄱ", "ㄷ", "ㅎ", "ㅋ", "ㅍ", "ㄹ", "ㅅ", "ㅂ", "ㅇ"};
		Arrays.sort(str);
		
		for (String v : str) {
			System.out.print(v + " ");
		}
	}

}
