package day1011;

// 3행 4열의 2차원 배열

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][4];
		int n = 1;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = n;
				n++;
			}
		}
		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.printf("%3d", a[i][j]);
//			}
//			System.out.println();
//		}
		
		for (int[] row : a) {
			for (int x : row) {
				System.out.printf("%3d", x);
			}
			System.out.println();
		}
	}

}
