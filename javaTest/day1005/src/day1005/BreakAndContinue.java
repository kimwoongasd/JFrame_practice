package day1005;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for (i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("작업 종료");
		System.out.println("i : " + i);
		
		
		
//		int i;
//		for (i = 1; i <= 10; i++) {
//			if (i % 3 == 0) {
//				break;
//			}
//			System.out.println(i);
//		}
//		System.out.println("작업 종료");
//		System.out.println("i : " + i);
		
		
//		int i;
//		for (i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//		System.out.println("작업 종료");
//		System.out.println("i : " + i);
	}

}
