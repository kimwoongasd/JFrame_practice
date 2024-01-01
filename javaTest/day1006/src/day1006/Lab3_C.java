package day1006;

import java.util.Scanner;

public class Lab3_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans;
		int i ,n;
		do {
			double prod = 1.0, r;
			Scanner sc = new Scanner(System.in);
			System.out.println("실수 r : ");
			r = sc.nextDouble();
			System.out.println("거듭제곱 횟수 : ");
			n = sc.nextInt();
			
			for (i = 1 ; i <= n ; i++) {
				prod *= r;
			} 
			
			do {
				System.out.println(prod);
				System.out.println("또 하시겠어요?");
				ans = sc.next();

			} while (!ans.equals("N") && !ans.equals("Y"));
			
		} while (!ans.equals("N"));
		System.out.println("사용을 종료합니다");
	}

}
