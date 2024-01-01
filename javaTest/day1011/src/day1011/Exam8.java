package day1011;

public class Exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5};
		int[] b = new int[5];
		b = a;
		
		a[0] = 100;
		
		for (int x : a) {
			System.out.printf("%3d", x);
		}
		System.out.println();
		for (int x : b) {
			System.out.printf("%3d", x);
		}

	}

}
