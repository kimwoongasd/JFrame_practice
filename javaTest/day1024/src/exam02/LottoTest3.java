package exam02;

import java.util.Random;
import java.util.TreeSet;

public class LottoTest3 {

	public static void main(String[] args) {
		TreeSet lotto = new TreeSet();
		Random r = new Random();
		
		// 중복된 데이터가 나올 수 있기때문에 6개가 
		// 담긴다는 확정이 없다
		for (int i = 0; i < 6; i++) {
			lotto.add(r.nextInt(45) + 1);
		}
		
		System.out.println(lotto);
	}

}
