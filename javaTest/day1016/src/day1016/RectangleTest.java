package day1016;

class Rectangle {
	private double width;
	private double length;
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	public void setLength(double l) {
		length = l;
	}
	
	
	public double calcArea() {
		return width * length;
	}
}


public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rt = new Rectangle();
		
		rt.setLength(10.25);
		rt.setWidth(5.58);
		
		System.out.printf("가로 : %.1f\n", rt.getLength());
		System.out.printf("세로 : %.1f\n", rt.getWidth());
		System.out.printf("넓이 : %.1f\n", rt.calcArea());
	}

}
