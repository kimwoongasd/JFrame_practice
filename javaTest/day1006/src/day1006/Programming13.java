package day1006;

import java.util.Scanner;

public class Programming13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				for (int k = 1; k <= 100; k++) {
					if ((i * i) + (j * j) == (k * k)) {
						System.out.printf("a : %d, b : %d, c : %d\n", i, j, k);
						cnt++;
						break;
					}
				}
			}
		}
		System.out.println(cnt + "개");
	}

}
