package day1011;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[4];
		int n = 1;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = n;
			n++;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}

}
