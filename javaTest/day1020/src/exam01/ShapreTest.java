package exam01;

public class ShapreTest {

	public static void main(String[] args) {
		Shape[] arr = new Shape[4];
		arr[0] = new Rectangle(10, 10, 100, 100);
		arr[1] = new Ellipse(50, 60, 100, 100);
		arr[2] = new Shpere(200, 200, 100);
		arr[3] = new Shpere(400, 200, 1000);
		
		for (Shape s : arr) {
			if (s instanceof TwoDimShape) {
				((TwoDimShape)s).calcArea();
				System.out.println(((TwoDimShape)s).getArea());
			} 
			
			if (s instanceof ThreeDimShape) {
				((ThreeDimShape)s).calcVolume();
				System.out.println(((ThreeDimShape)s).getVolume());
			}
		}
		
	}

}
