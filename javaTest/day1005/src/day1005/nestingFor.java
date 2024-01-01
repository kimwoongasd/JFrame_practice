package day1005;

public class nestingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, j = 0;
		for ( i = 1; i <= 3; i++) {
			for (j = 1; j <= 4; j++) {
				System.out.println("수박");
			}
			System.out.println("맛있다");
		}
		
		System.out.println(i);
		System.out.println(j);
	}

}
