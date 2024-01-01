package day1011;

import java.util.Arrays;

public class Exam9_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {1, 2, 3, 4, 5};
		
		boolean falg = true;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				continue;
			} else {
				System.out.println("배열의 내용이 일치하지 않습니다");
				falg = false;
				break;
			}
		}
		
		if (falg) {
			System.out.println("배열의 내용이 일치합니다");
		}
	}

}
