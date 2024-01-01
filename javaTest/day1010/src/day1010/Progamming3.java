package day1010;

import java.util.Scanner;

public class Progamming3 {
	public static int getTotal(int[] a) {
		int sum = 0;
		
		for (int x : a) {
			sum += x;
		}
		
		return sum;
	}
	
	public static int getAverage(int num, int[] a) {
		int avg;
		
		avg = num / a.length;
		
		return avg;
	}
	

	public static void main(String[] args) {
	
	}

}
