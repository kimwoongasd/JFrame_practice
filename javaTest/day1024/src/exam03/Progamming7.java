package exam03;

import java.util.ArrayList;
import java.util.Random;

public class Progamming7 {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		Random r = new Random();
		
		while (true) {
			if (list.size() == 10) break;
			
			list.add(r.nextDouble(10));
		}
		
		double min = list.get(0), max = list.get(0), total = 0;
		
		for (Double d : list) {
			if (d > max) max = d;
			if (d < min) min = d;
			total += d;
		}
		
		System.out.printf("총합 : %.2f",(total - max - min));
	}

}
