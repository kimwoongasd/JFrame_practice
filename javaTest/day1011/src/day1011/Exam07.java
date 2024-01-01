package day1011;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] a = new int[60][10][30];
		
		// 0으로 초기화
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					a[i][j][k] = 0;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println((i + 1) + "번 쩨 첵꽃이");
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.printf("%3d", a[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
