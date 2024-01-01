package day1005;

// 1~1000까지 완전수 출력

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 1000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			
			if (sum == i) {
				System.out.println(i);
			}
		}
	}

}
