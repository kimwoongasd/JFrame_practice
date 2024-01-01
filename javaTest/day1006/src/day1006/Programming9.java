package day1006;

import java.util.Scanner;

public class Programming9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n, res;
		
		System.out.println("n을 입력하시오");
		n = sc.nextInt();
		
		if (n > 0) {
			res = (7 * n) + 2;
		} else {
			res = (n * n * n) - (n * 9) + 2;
		}
		
		System.out.println(res);
	}

}
