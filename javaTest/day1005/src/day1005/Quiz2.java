package day1005;


//구구단 2~9단 while, do while문으로 작성

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 2;
		do {
			System.out.println("*** " + i + "단 ***");
			int j = 1;
			do {
				 System.out.printf("%d * %d = %d\n", i, j, i * j);
				 j++;
			} while (j <= 9);
			i++;
		} while (i <= 9);
		
//		int i = 2;
//		while (i <= 9) {
//			int j = 1;
//			System.out.println("*** " + i + "단 ***");
//			while (j <= 9) {
//				System.out.printf("%d * %d = %d\n", i, j, i * j);
//				j++;
//			}
//			i++;
//		}
		
		
	}

}
