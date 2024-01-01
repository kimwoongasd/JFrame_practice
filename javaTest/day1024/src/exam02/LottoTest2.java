package exam02;

import java.util.Random;
import java.util.TreeSet;

public class LottoTest2 {

	public static void main(String[] args) {
		TreeSet lotto = new TreeSet();
		Random r = new Random();
		
		while (true) {
			if (lotto.size() == 6) break;
			
			lotto.add(r.nextInt(45) + 1);
		}
		
		System.out.println(lotto);
	}

}
