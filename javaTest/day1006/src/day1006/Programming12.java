package day1006;

import java.util.Scanner;

public class Programming12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 2; i <= 100; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt += 1;
				}
			}
			
			if (cnt == 2) {
				System.out.println(i);
			}
		}
	}

}
