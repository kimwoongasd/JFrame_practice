package day1011;

import java.util.Scanner;

public class Progamming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] CreditCard = new double[12];
		double pay = 0, avg = 0, total = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < CreditCard.length; i++) {
			for(;;) {
				System.out.println((i + 1) + "월 사용 금액을 적으시오");
				pay = sc.nextDouble();
				
				if (pay >= 0) {
					break;
				}
			}
			CreditCard[i] = pay;
			total += CreditCard[i];
		}
		
		avg = total / CreditCard.length;
		
		double min = CreditCard[0], max = CreditCard[0];
		int min_m = 1, max_m = 1;
		for (int i = 1; i < CreditCard.length; i++) {
			if (CreditCard[i] > max) {
				max = CreditCard[i];
				max_m = i + 1;
			}
			
			if (CreditCard[i] < min) {
				min = CreditCard[i];
				min_m = i + 1;
			}
		}
		
		for (int i = 0; i < CreditCard.length; i++) {
			System.out.printf("%d월 사용 금액 : %f\n ",(i + 1), CreditCard[i]);
		}
		
		System.out.println("전체 사용 금액 " + total);
		System.out.println("월별 평균 사용 금액 " + avg);
		System.out.println("최대 사용금액 : " + max);
		System.out.println("최소 사용금액 : " + min);
		System.out.println("가장 지출이 많았던 월 " + max_m + "월");
		System.out.println("가장 지출이 적었던 월 " + min_m + "월");
	}

}
