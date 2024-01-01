package day1006;

public class Programming13_A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ch = new int[101];
		int[] ch_a = new int[101];
		int n = 0, cnt = 0;
		
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				for (int k = 1; k <= 100; k++) {
					int sum = (i * i) + (j * j);
					if (sum == (k * k)) {
						boolean flag = false;
						
						for (int l = 0; l < n; l++) {
							if (sum == ch[l] && j == ch_a[l]) {
								flag = true;
								break;
							}
						}
						
						if (flag == false) {
							ch[n] = sum;
							ch_a[n] = i;
							n++;
							System.out.printf("a : %d, b : %d, c : %d\n", i, j, k);
							cnt++;
						} // end if flag
					} // end if sum
				} // end for k
			} // end for j
		} // end for i
		System.out.println(cnt + "개");
	}

}
