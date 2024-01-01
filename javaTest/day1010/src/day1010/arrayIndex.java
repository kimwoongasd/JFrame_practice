package day1010;

public class arrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인덱스 에러
		int[] employess = new int[5];
		
		employess[0] = 10;
		employess[1] = 10;
		employess[2] = 10;
		employess[3] = 10;
		employess[4] = 10;
		
		// 인덱스 범위를 넘어서 에러
//		employess[5] = 15; // 에러
	}

}
