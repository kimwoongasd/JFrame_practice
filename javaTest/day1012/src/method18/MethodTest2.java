package method18;

import java.util.Scanner;

class MyUtil {
	public double getTotal(double[] data) {
		double total = 0;
		for (double x : data) {
			total += x;
		}
		
		return total;
	}
	
	public double getAvg(double[] data) {
		return getTotal(data) / (double)12;
	}
	
	public double getMax(double[] data) {
		double max = 0;
		for (double x : data) {
			if (max < x) {
				max = x;
			}
		}
		
		return max;
	}
	
	public double getMin(double[] data) {
		double min = data[0];
		for (double x : data) {
			if (min > x) {
				min = x;
			}
		}
		
		return min;
	}
}

public class MethodTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyUtil mu = new MyUtil();
		double[] card = new double[12];
		
		for (int i = 0; i < 12; i++) {
			System.out.println((i + 1) + "월 사용금액 입력하시오");
			while (true) {
				card[i] = sc.nextDouble();
				if (card[i] > 0) {
					break;
				}
				System.out.println("음수입니다 다시 입력하시오");
			}
		}
		
		System.out.println("1년 동안의 전체 사용 금액 : " + mu.getTotal(card));
		System.out.println("평군 금액 : " + mu.getAvg(card));
		System.out.println("최대지출 : " + mu.getMax(card));
		System.out.println("최소지출 : " + mu.getMin(card));
		
	}
}
