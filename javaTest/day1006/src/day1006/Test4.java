package day1006;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for (int i = 10; i <= 30; i++) {
			for (int j = 0; j <= 5; j++) {
				sum += i * j;
			}
		}
		
//		int i = 10, sum = 0;
//		
//		while (i <= 30) {
//			int j = 0;
//			while (j <= 5) {
//				sum += i * j;
//				j++;
//			}
//			
//			i++;
//		}
		
		System.out.println(sum);
	}

}
