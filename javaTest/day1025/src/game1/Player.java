package game1;

import java.util.ArrayList;

public class Player {
	ArrayList<Card> list = new ArrayList<Card>();
	
	public void getCard(Card card) {
		list.add(card);
	}
	
	public void showCards() {
		System.out.println(list);
	}
	
	
	// 원페어 인지 판별하여 원페어이면 원페어 숫자를 반환
	// 그렇지 않으면 -1 반환
	public String isPair() {
		int[] chech = new int[15];
		String pair = "0";
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i).number;
			int num;
			
			if (str.equals("Jack")) {
				num = 11;
			} else if (str.equals("Queen")) {
				num = 12;
			} else if (str.equals("King")) {
				num = 13;
			} else if (str.equals("Ace")) {
				num = 14;
			} else {
				num = Integer.parseInt(str);
			}
			
			chech[num]++;
		}
		
		for (int i = 0; i < chech.length; i++) {
			if (chech[i] >= 2) pair = String.valueOf(i);
		}
		
		switch (pair) {
			case "0": pair = "-1"; break;
			case "11": pair = "Jack"; break;
			case "12": pair = "Queen"; break;
			case "13": pair = "King"; break;
			case "14": pair = "Ace"; break;
		}
		
		return pair;
	}
}
