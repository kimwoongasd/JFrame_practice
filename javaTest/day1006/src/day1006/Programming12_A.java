package day1006;

public class Programming12_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 2; i <= 100; i++) {
			int j = 2;
			for (; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			
			if (i == j) {
				System.out.println(i);
			}
		}
	}

}
