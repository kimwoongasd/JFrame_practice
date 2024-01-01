package day1006;

public class Programming13_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ch = new int[100];
		int n = 0, cnt = 0;
		
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				for (int k = 1; k <= 100; k++) {
					int sum = (i * i) + (j * j);
					if (sum == (k * k)) {
						boolean flag = false;
						
						for (int l = 0; l < n; l++) {
							if (sum == ch[l]) {
								flag = true;
								break;
							}
						}
						
						if (flag == false) {
							ch[n] = sum;
							n++;
							System.out.printf("a : %d, b : %d, c : %d\n", i, j, k);
							cnt++;
						}
					}
				}
			}
		}
		System.out.println(cnt + "개");
	}

}
