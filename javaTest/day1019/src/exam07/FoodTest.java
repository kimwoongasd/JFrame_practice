package exam07;

public class FoodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Melon m1 = new Melon(38, 20000, 100, "마포");
		System.out.println(m1);
		
		Melon m2 = new Melon(38, 20000, 100, "마포");
		System.out.println(m2);
		
		Melon m3 = new Melon(58, 20400, 200, "강남");
		System.out.println(m3);
		
		System.out.println("m1과 m2는");
		if (m1.eqauls(m2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		System.out.println("m1과 m3는");
		if (m1.eqauls(m3)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}

}
