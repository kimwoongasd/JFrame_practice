package day1006;

import java.util.Scanner;

public class Programming6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double height, weight, standardWeight;
		String res;
		System.out.println("키를 입력하시오");
		height = sc.nextDouble();
		System.out.println("몸무게를 입력하시오");
		weight = sc.nextDouble();
		
		standardWeight = (height - 100) * 0.9;
		
		System.out.printf("키가 %.2f 의 표준 체중은 %.2f입니다\n", height, standardWeight);
		
		if (standardWeight > weight) {
			res = "저체중";
		} else if (standardWeight < weight) {
			res = "과체중";
		} else {
			res = "표준체중";
		}
		
		System.out.println(res + "입니다");
	}

}
