package exam15;

public class ShapeTest {
	
	public static void test(Movable[] arr) {
		for (Movable m : arr) {
			m.move();
		}
	}

	public static void main(String[] args) {
		Movable[] arr = new Movable[2];
		arr[0] = new Circle(10, 20, 15);
		arr[1] = new Rectangle(13, 55, 20, 20);
		
		test(arr);
		
//		arr[0].move();
//		arr[1].move();

	}

}
