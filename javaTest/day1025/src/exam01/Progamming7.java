package exam01;

import java.util.ArrayList;
import java.util.Random;

public class Progamming7 {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		Random r = new Random();
		
		int n = 1;
		while (true) {
			if (list.size() == 10) break;
			double d = r.nextDouble() * 10;
			System.out.printf(n + "번 심사위원의 점수 : %.1f\n" , d);
			list.add(d);
			n++;
		}
		
		// 정렬하기
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					double tem;
					tem = list.get(i);
					// set : 데이터 바꾸기
					list.set(i, list.get(j));
					list.set(j, tem);
				}
			} 
		}
		
		double sum = 0;
		
		for (int i = 1; i < list.size() - 1 ; i++) {
			sum += list.get(i);
		}
		
		System.out.printf("최대 점수와 최소 점수를 제외한 총점 : %.1f", sum);
		
//		double min = list.get(0), max = list.get(0), total = 0;
//		
//		for (Double d : list) {
//			if (d > max) max = d;
//			if (d < min) min = d;
//			total += d;
//		}
//		
//		System.out.printf("총합 : %.2f",(total - max - min));
	}

}
