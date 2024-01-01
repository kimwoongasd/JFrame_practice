package day0927;

import java.util.Scanner;

// 쌍용클럽에서는 나이가 30세 이상이면 입장 가능

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.println("나이를 입력하시오");
		age = sc.nextInt();
		
		if (age >= 30) {
			System.out.println("입장 가능");
		} else {
			System.out.println("입장 불가능");
		}
	}

}
