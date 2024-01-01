package day1010;

import java.util.Scanner;

// 5명 학생의 점수를 입력받아 모두 출력
// 총점 평군을 계산

public class arrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] value = {1.0, 2.0, 3.0, 4.0};
		
		for (double x : value) {
			System.out.println(x);
		}
		
		// 배열의 원소를 모두 0으로 초기화
		for (int i = 0; i < value.length; i++) {
			value[i] = 0;
		}
		
		System.out.println("** 수정 **");
		for (double x : value) {
			System.out.println(x);
		}
		
	}

}
