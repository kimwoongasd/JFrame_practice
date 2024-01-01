package day1005;


public class WhileTest6 {

	public static void main(String[] args) {
		int i = 1;
		// 무한반복
		while (true) {
			System.out.println("수박");
			
			// 무한반복 탈출
			i++;
			if (i > 3) {
				break;
			}
		}
		
		System.out.println("종료");
		
	}

}
