package day1011;

import java.util.Arrays;

public class Exam9_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {1, 2, 3, 4, 5, 6, 7};
		int i = 0;
		
		// 배열의 길이가 서로 다를 경우
		if (a.length != b.length) {
			System.out.println("배열의 내용이 일치하지 않습니다");
			return;
		}
		
		for (i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				break;
			}
		}
		
		if (i == a.length) {
			System.out.println("배열의 내용이 일치합니다");
		} else {
			System.out.println("배열의 내용이 일치하지 않습니다");
		}
	}

}
