package exam02;

import java.util.Random;

public class LottoTest {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random r = new Random();
		
		for (int i = 0; i < 6; i++) {
			lotto[i] = r.nextInt(45) + 1;
		}
		
		System.out.println("이번 주 로또 추천 번호");
		
		for (int k : lotto) {
			System.out.print(k + " ");
		}
	}

}
