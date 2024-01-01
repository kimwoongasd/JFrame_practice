package day1005;

// 1~ 100 소수 구하기

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=100; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			
			if (cnt == 2) {
				System.out.printf("%5d", i);
			}
		}
	}

}
