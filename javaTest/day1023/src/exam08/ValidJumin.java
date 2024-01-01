package exam08;

import java.util.Scanner;

// 주민 맞는지 체크
public class ValidJumin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin;
		System.out.println("주민번호를 입력하시오");
		jumin = sc.next();
		
		int n = 2, total = 0;
		int len = jumin.length();
		for (int i = 0; i < len - 1; i++) {
			// 숫자 아닌거 제외
			if (jumin.charAt(i) == '-') continue;
						
			// 9를 넘어가면 2부터 다시 곱하기
			if (n > 9) {
				n = 2;
			}
			
			// 총합 구하기
			total += Integer.parseInt(jumin.substring(i, i + 1)) * n;
			n++;
			
		}
		
		// 맨 마지막 숫자 구하기
		int last = 11 - total % 11;
		if (last == 11) last = 1;
		if (last == 10) last = 0;
		
		
		if (Integer.parseInt(jumin.substring(len - 1, len)) == last) {
			System.out.println("주민번호가 맞습니다");
		} else {
			System.out.println("주민번호가 틀립니다");
		}
	}

}
