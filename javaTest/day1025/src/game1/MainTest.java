package game1;

import java.util.Arrays;

public class MainTest {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck(); // CardDeck 객체 생성
		
		cd.shuffle(); // 카드 섞음
		
		// Player 2명 생성
		Player p1 = new Player();
		Player p2 = new Player();
		
		// 카드 7장씩 분배
		for (int i = 0; i < 7; i++) {
			p1.getCard(cd.deal());
			p2.getCard(cd.deal());
		}
		
		// 카드 보여준다
		p1.showCards();
		p2.showCards();
		
		// 원페어 확인
		String p1Pair = p1.isPair();
		String p2Pair = p2.isPair();
		
		System.out.println(p1Pair);
		System.out.println(p2Pair);
		
		String res = "";
		
		// 둘다 원페어가 아닐 경우
		if (p1Pair.equals("-1") && p2Pair.equals("-1")) res = "무승부";
		
		String[] number = {"2", "3", "4", "5", "6", "7", "8", "9",
				"10", "Jack", "Queen", "King", "Ace"};
		
		// number에서 원페어 나온 숫자 index로 승자 구하기
		if (Arrays.asList(number).indexOf(p1Pair) == Arrays.asList(number).indexOf(p2Pair)) {
			res = "무승부";
		} else if (Arrays.asList(number).indexOf(p1Pair) > Arrays.asList(number).indexOf(p2Pair)) {
			res = "Player1 승";
		} else {
			res = "Player2 승";
		}
		
		System.out.println("결과 : " + res);
	
	}
	
}
