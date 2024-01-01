package day1004;

import java.util.Scanner;

/*
for문을 이용하여 프로그램 작성

구구단 중에 몇단을 출력할지 입력하고 구구단 출력
*/

public class GugudanTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("구구단 중에 몇단을 출력할까요?");
		n = sc.nextInt();
		
		for (int i=1; i < 10; i++) {
			System.out.println(n + "*" + i + " = " + (n * i));
		}
	}

}
