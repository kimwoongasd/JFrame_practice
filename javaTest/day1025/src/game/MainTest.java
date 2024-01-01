package game;

public class MainTest {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		System.out.println(cd.deck);
		
		cd.shuffle();
		
		System.out.println(cd.deck);
		
		Card c = cd.deal();
		System.out.println(c);
		
		System.out.println(cd.deck);
		System.out.println(cd.deck.get(0));
	}
	
}
