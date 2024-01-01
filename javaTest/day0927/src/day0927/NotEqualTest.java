package day0927;

import java.util.Scanner;

// 관리자의 나이와 직원의 나이를 비교하여 같은지 확인하여라
public class NotEqualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.println("관리자의 나이를 입력하시오");
		a = sc.nextInt();
		System.out.println("직원의 나이를 입력하시오");
		b = sc.nextInt();
		
		if (a != b) {
			System.out.println("관리자와 직원의 나이가 다릅니다");
		} else {
			System.out.println("관리자와 직원의 나이가 같습니다");
		}
	}

}
