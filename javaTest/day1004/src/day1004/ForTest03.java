package day1004;

import java.util.Scanner;

/*
for 문을 이용하여 어떤 과일과 숫자를 좋아하는지 작동하는 프로그램 
*/

public class ForTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fruit;
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("어떤 과일을 좋아하나요?");
		fruit = sc.next();
		System.out.println("어떤 숫자를 좋아하나요?");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println(fruit);
		}
	}

}
