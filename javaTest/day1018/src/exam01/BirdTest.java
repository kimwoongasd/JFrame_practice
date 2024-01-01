package exam01;

public class BirdTest {

	public static void main(String[] args) {
		Bird b = new Bird("독수리", "갈",  false);
		b.fly();
		
		Bird b2 = new Bird("비둘기", "흰", true);
		b2.fly();
	}

}
