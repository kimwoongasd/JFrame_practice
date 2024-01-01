package day1006;

import java.util.Random;
import java.util.Scanner;

public class Programming8_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int n = r.nextInt(3);
		String[] str = {"가위", "바위", "보"}; 
		String com = str[n], user;

		System.out.println("*** 가위 바위 보 게임 ***");
		System.out.println("선택하시오");
		user = sc.next();
		
		if (!user.equals("보") && !user.equals("가위") && !user.equals("바위")) {
			System.out.println("잘못입력했습니다");
			return;
		}
		
		System.out.println("컴퓨터 : " + com);
		System.out.println("사용자 : " + user);
		
		if (com.equals(user)) {
			System.out.println("비겼습니다.");
		} else if ((user.equals("가위") && com.equals("보"))
				|| (user.equals("바위") && com.equals("가위"))
				|| (user.equals("보") && com.equals("바위"))) {
			System.out.println("이겼습니다.");
		} else {
			System.out.println("패배했습니다");
		}
	}

}
