package day1005;

public class InfiniteRepetition3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		
		// 무한반복
		for (;;) {
			System.out.println("수박");
			i++;
			if (i > 3) {
				break;
			}
		}
		System.out.println("작업종료");
	}

}
