package day1011;

// 3행 4열의 2차원 배열

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][4];
		int n = 1;
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		System.out.println(a[2].length);
		System.out.println("---------------------");
		
		// 배열 맨 첫번쨰 요소에 100 저장
		a[0][0] = 100;
		System.out.println(a[0][0]);
		
		// 배열 맨 끝에 요서 200저장
		a[a.length - 1][a[0].length - 1] = 200;
		System.out.println(a[a.length - 1][a[0].length - 1]);
		
		
	}

}
