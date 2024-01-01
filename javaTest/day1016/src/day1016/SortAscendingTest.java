package day1016;

public class SortAscendingTest {

	public static void main(String[] args) {
		int[] a = {99, 25, 2, 7, 30};
		
		for (int i = 0; i < a.length - 1; i++) {
			int tem = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					a[i] = a[j];
					a[j] = tem;
					tem = a[i];
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
