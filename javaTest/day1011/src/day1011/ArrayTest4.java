package day1011;

// 5행5열의 2차원 배열 만들고 1씩증가하는 값 저장
// 마지막 열에는 값은 각 행의 합이 누적

public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[5][5];
		int n = 1;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				
				a[i][j] = n;
				a[i][a[i].length - 1] += a[i][j];
				n++;
			}
		}
		
		for (int[] col : a) {
			for (int row : col) {
				System.out.printf("%3d", row);
			}
			System.out.println();
		} 
		

	}

}
