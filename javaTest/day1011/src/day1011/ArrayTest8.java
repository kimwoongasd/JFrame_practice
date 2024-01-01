package day1011;

import java.util.Scanner;

public class ArrayTest8 {

	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[a.length - 1 - i] + " ");
		}
		
		System.out.println();
		for (int i = a.length - 1; i > -1; i--) {
			System.out.print(a[i] + " ");
		}
	}

}
