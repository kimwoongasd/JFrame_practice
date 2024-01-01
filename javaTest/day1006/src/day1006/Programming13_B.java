package day1006;

import java.util.Scanner;

public class Programming13_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ch = new int[101];
		int cnt = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				for (int k = 1; k <= 100; k++) {
					if ((i * i) + (j * j) == (k * k) && ch[j] == 0) {
						System.out.printf("a : %d, b : %d, c : %d\n", i, j, k);
						ch[i] = 1;
						cnt++;
						break;
					}
				}
			}
		}
		System.out.println(cnt + "개");
	}

}
