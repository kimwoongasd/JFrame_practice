package day1010;

import java.util.Arrays;
import java.util.Scanner;

// 5명 학생의 점수를 입력받아 모두 출력
// 총점 평군을 계산

public class ArrayTest9 {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {6, 7, 8, 9, 10};
		
		if (Arrays.equals(a, b)) {
			System.out.println("배열의 내용이 일치합니다");
		} else {
			System.out.println("배열의 내용이 일치하지 않습니다");
		}
	}

}
