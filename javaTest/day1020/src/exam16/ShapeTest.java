package exam16;

import java.util.Random;

public class ShapeTest {
	
	public static void test(Movable[] arr) {
		Random r = new Random();
		int idx = r.nextInt(arr.length);
		arr[idx].move();
	}

	public static void main(String[] args) {
		Movable[] arr = new Movable[2];
		arr[0] = new Circle(10, 20, 15);
		arr[0] = new Circle(100, 20, 15);
		arr[0] = new Circle(10, 200, 15);
		arr[1] = new Rectangle(130, 55, 20, 20);
		arr[1] = new Rectangle(13, 550, 20, 20);
		arr[1] = new Rectangle(103, 505, 20, 20);
		
		test(arr);
		
//		arr[0].move();
//		arr[1].move();

	}

}
