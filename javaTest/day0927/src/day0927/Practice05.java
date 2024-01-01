package day0927;

import java.util.Scanner;

// 나이와 키를 입력받아 나이가 30세이상 키는 170이하 이면 
// 입장가능 그렇지 않으면 입장불가능을 출력한다

public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age; 
		double height;
		String res = "입장 불가능";
		
		System.out.println("나이를 입력하시오");
		age = sc.nextInt();
		System.out.println("키를 입력하시오");
		height = sc.nextDouble();
		
		if (age >= 30 && height <= 170) {
			res = "입장가능";
		}
		System.out.println(res + "합니다");
		
	}

}
