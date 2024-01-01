package day1006;

// do while문은 while문과 다르게 조건이 만족하지 않아도
// 적어도 한번은 동작한다

public class WhileAndDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		do {
			System.out.println("hello");
			i++;
		} while (i < 4);

		System.out.println("작업 종료");
		
		
//		int i = 10;
//		while (i < 4) {
//			System.out.println("hello");
//			i++;
//		}
//		System.out.println("작업 종료");
	}

}
