package exam02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysBinarySearchTest {

	public static void main(String[] args) {
		// 1차원 정수형 배열을 만들고 10개의 값을 임의의 값으로 초기화
		int[] arr = {10, 5, 100, 50, 20, 40, 30, 60, 80, 44};
		
		// 찾을 값을 입력받아 있는지 없는지 판별
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 값을 입력하시오");
		int target = sc.nextInt();
		
		// 값을 확인하기 위해서 정렬
		Arrays.sort(arr);
		
		// 값이 없으면 음수가 나온다
		if (Arrays.binarySearch(arr, target) >= 0) {
			System.out.println(target + "은 배열에 있다");
		} else {
			System.out.println(target + "은 배열에 없다");
		}
		
	}

}
