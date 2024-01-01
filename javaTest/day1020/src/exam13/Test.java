package exam13;

public class Test {
	// static를 붙이면 객체를 생성하지 않아도 사용가능하다
	private static void printPrice(Buyable item) {
		System.out.printf("%10d \n", item.getPrice());
	}

	public static void main(String[] args) {
		Buyable b = new Television("LG25인치", "LG", 25000000);
		Buyable b2 = new Refrigerator("청소기", "삼성", 60000000);
		
		printPrice(b);
		printPrice(b2);
	}

}
