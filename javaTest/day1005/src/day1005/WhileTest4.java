package day1005;

// while문으로 구구단 2~9단까지 출력

public class WhileTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 2;
		
		while (i <= 9) {
			int j = 1;
			while(j <= 9) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
				j++;
			}
			i++;
		}
		
	}

}
