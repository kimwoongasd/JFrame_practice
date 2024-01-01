package exam02;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(10) + 1;
		System.out.println(n);

	}

}
