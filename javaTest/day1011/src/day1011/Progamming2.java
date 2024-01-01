package day1011;

import java.util.Scanner;

public class Progamming2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
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
		
		// 사용자의 답을 입력하기 위한 배열
		String[] user = new String[10];
		
		// 반복문을 이용하여 10개 문제를 출력하고 답을 입력
		for (int i = 0; i < ans.length; i++) {
			while (true) {
				System.out.println(problem[i]);
				user[i] = sc.next();
				if (user[i].equals("a") || user[i].equals("b") 
						||user[i].equals("c") ||user[i].equals("d")) {
					break;
				}
			}
		}
		
		String flag = "합격";
		int cnt = 0;
		for (int i = 0; i < ans.length; i++) {
			if (ans[i].equals(user[i])) {
				cnt += 1;
			}
		}
		
		if (cnt < 7) flag = "불합격";
		
		System.out.println("합격 결과 : " + flag);
		System.out.println("정답 횟수 : " + cnt);
		System.out.println("오답 횟수 : " + (10- cnt));
		
	}

}
