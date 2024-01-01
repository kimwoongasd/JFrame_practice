package day1006;

import java.util.Scanner;

public class Programming5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		String res;
		
		System.out.println("1~10번 사이 번호를 입력하시오");
		n = sc.nextInt();
		
		if (n < 1 || n > 10) {
			System.out.println("다시 입력하시오");
			return;
		}
		
		if (n == 2) {
			res = "1등";
		} else if(n == 5) {
			res = "2등";
		} else if (n == 7) {
			res = "3등";
		} else {
			res = "꽝";
		}
		
		System.out.println(res + "입니다");
	}

}
