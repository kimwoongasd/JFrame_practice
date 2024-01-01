package exam17;

import java.util.Random;

public class ShapeTest {
	
	public static void test(Movable[] arr) {
		Random r = new Random();
		int idx = r.nextInt(arr.length);
		arr[idx].move();
	}
	
	public static void drawTest(Drawable[] arr) {
		while (true) {
			Random r = new Random();
			int idx = r.nextInt(arr.length);
			arr[idx].draw();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Movable[] arr = new Movable[6];
		arr[0] = new Circle(10, 20, 15);
		arr[1] = new Circle(100, 20, 15);
		arr[2] = new Circle(10, 200, 15);
		arr[3] = new Rectangle(130, 55, 20, 20);
		arr[4] = new Rectangle(13, 550, 20, 20);
		arr[5] = new Rectangle(103, 505, 20, 20);
		
		test(arr);
//		arr[0].move();
//		arr[1].move();
		
		Drawable[] arr2 = new Drawable[5];
		arr2[0] = new Circle(10, 20, 15);
		arr2[1] = new Circle(100, 20, 15);
		arr2[2] = new Circle(10, 200, 15);
		arr2[3] = new Rectangle(130, 55, 20, 20);
		arr2[4] = new Rectangle(13, 550, 20, 20);
		drawTest(arr2);

	}

}
