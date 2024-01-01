package day1006;

import java.util.Scanner;

public class Programming3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt, price = 100;
		double pay = 0;
		
		System.out.println("구입할 상품 개수를 입력하시오");
		cnt = sc.nextInt();
		
		pay = price * cnt;
		
		if (cnt >= 10) {
			//pay = price * cnt - (price * cnt / 10);
			pay *= 0.9;
		}
		
		System.out.println("총 금액 : " + pay);
	}

}
