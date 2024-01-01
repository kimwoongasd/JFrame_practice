package exam02;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product("칫솔", 30000);
		System.out.println(p1); 
		
		Product p2 = new DiscountPorduct("바나나우유", 2000, 10);
		System.out.println(p2);
	}
}