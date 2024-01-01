package exam02;

import java.util.Arrays;

public class ArraysEqualsTest {

	public static void main(String[] args) {
		// 정수형 1차원 배열 1~5로 초기화한다
		int[] arr = {1, 2, 3, 4, 5};
		// 비교를 위해 같은 요소를 같는 배열을 만든다
		int[] arr2 = {1, 2, 3, 4, 5, 6};
		
		// 두 배열의 요소가 서로 동일한비 판별
		if (Arrays.equals(arr, arr2)) {
			System.out.println("두 배열은 같다");
		} else {
			System.out.println("두 배열은 다르다");
		}
		
	}

}
