package day1011;

import java.util.Arrays;

public class Exam9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {1, 2, 3, 4, 5};
		
		// 둘 모두 같은 메모리를 가르키는 지
		if (a == b) {
			System.out.println("배열의 내용이 일치합니다");
		} else {
			System.out.println("배열의 내용이 일치하지 않습니다");
		}
		

	}

}
