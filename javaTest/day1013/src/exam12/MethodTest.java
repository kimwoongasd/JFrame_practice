package exam12;

import java.util.Scanner;

// 생월, 생일을 매개변수로 별자리를 판별하여 반환하는 메소드
class SistUtil {
	public String star(int month, int day) {
		String star = "";
		
		if (month == 1) {
			if (day >= 20) {
				star = "물병자리";
			} else {
				star = "염소자리";
			}
		} else if (month == 2) {
			if (day >= 19) {
				star = "물고기자리";
			} else {
				star = "물병자리";
			}
		} else if (month == 3) {
			if (day >= 21) {
				star = "양자리";
			} else {
				star = "물고기자리";
			}
		} else if (month == 4) {
			if (day >= 20) {
				star = "황소자리";
			} else {
				star = "양자리";
			}
		} else if (month == 5) {
			if (day >= 21) {
				star = "쌍둥이자리";
			} else {
				star = "황소자리";
			}
		} else if (month == 6) {
			if (day >= 22) {
				star = "게자리";
			} else {
				star = "쌍둥이자리";
			}
		} else if (month == 7) {
			if (day >= 23) {
				star = "사자자리";
			} else {
				star = "게자리";
			}
		} else if (month == 8) {
			if (day >= 23) {
				star = "처녀자리";
			} else {
				star = "사자자리";
			}
		} else if (month == 9) {
			if (day >= 24) {
				star = "천칭자리";
			} else {
				star = "처녀자리";
			}
		} else if (month == 10) {
			if (day >= 23) {
				star = "전갈자리";
			} else {
				star = "천칭자리";
			}
		} else if (month == 11) {
			if (day >= 23) {
				star = "사수자리";
			} else {
				star = "전갈자리";
			}
		} else if (month == 12) {
			if (day >= 25) {
				star = "염소자리";
			} else {
				star = "사수자리";
			}
		}
		
		return star;
	}
}

public class MethodTest {

	public static void main(String[] args) {
		SistUtil su = new SistUtil();
		Scanner sc = new Scanner(System.in);
		int m, n;
		System.out.println("생월을 입력하시오");
		m = sc.nextInt();
		System.out.println("생일을 입력하시오");
		n = sc.nextInt();
		
		System.out.println(su.star(m, n));
	}
}
