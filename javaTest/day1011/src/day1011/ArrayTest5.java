package day1011;

// 1면에 0을 2면에 1을 저장

public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] a = new int[2][3][4];
		
		for (int i = 0; i < a.length; i++) { // 면
			for (int j = 0; j < a[i].length; j++) { // 행
				for (int k = 0; k < a[i][j].length; k++) { //열 
					a[i][j][k] = i;
				}
			}
		}
		
		// for each로 출력
		
		for (int[][] col : a) {
			for (int[] row : col) {
				for (int x : row) {
					System.out.printf("%3d", x);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
