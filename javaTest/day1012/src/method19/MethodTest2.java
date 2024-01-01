package method19;

import java.util.Scanner;

class MyUtil {
	public boolean isPassed(String[] ans, String[] user) {
		boolean res = true;
		int cnt = 0;
		for (int i = 0; i < ans.length; i++) {
			if (!ans[i].equals(user[i])) {
				cnt++;
			}
		}
		
		if (cnt > 3) res = false;
		
		return res;
	}
	
	public int correrctAnswers(String[] ans, String[] user) {
		int res = 0;
		for (int i = 0; i < ans.length; i++) {
			if (ans[i].equals(user[i])) {
				res++;
			}
		}
		
		return res;
	}
	
	public int incorrectAnswers(String[] ans, String[] user) {
		return 10 - correrctAnswers(ans, user);
	}
	
}

public class MethodTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyUtil mu = new MyUtil();
		String[] ans = {"a", "b", "c", "d", "a", "b", "c", "d", "a", "b"};
		String[] problem = {
				"1번: 한국의 수도는?\n (a)서울	(b)부산	(c)대구	(d)김포",
				"2번: 중국의 수도는?\n (a)서울	(b)베이징	(c)대구	(d)김포",
				"3번: 일본의 수도는?\n (a)서울	(b)부산	(c)도쿄	(d)김포",
				"4번: 쿠웨이트의 수도는?\n (a)서울	(b)부산	(c)대구	(d)쿠웨이트",
				"5번: 캄보디아의 수도는?\n (a)프놈펜	(b)부산	(c)대구	(d)김포",
				"6번: 베트남의 수도는?\n (a)서울	(b)하노이	(c)대구	(d)김포",
				"7번: 필리핀의 수도는?\n (a)서울	(b)부산	(c)마닐라	(d)김포",
				"8번: 타이의 수도는?\n (a)서울	(b)부산	(c)대구	(d)방콕",
				"9번: 몰디브의 수도는?\n (a)몰레	(b)부산	(c)대구	(d)김포",
				"10번: 이란의 수도는?\n (a)서울	(b)테헤란	(c)대구	(d)김포"
		};
		String[] user = new String[10];
		
		for (int i = 0; i < problem.length; i++) {
			while (true) {
				System.out.println(problem[i]);
				user[i] = sc.next();
				if (user[i].equals("a") || user[i].equals("b") ||
						user[i].equals("c") || user[i].equals("d")) {
					break;
				}
			}
		}
		
		if (mu.isPassed(ans, user)) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		System.out.println("정답 횟수 : " + mu.correrctAnswers(ans, user));
		System.out.println("오답 횟수 : " + mu.incorrectAnswers(ans, user));
		
	}
}
