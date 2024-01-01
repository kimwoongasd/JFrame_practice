package exam13;

class Triangle {
	private double height;
	private double width;
	private double area;
	
	public Triangle() {
		width = 0;
		height = 0;
	}
	
	Triangle(double height, double width) {
		this.height = height;
		this.width = width;
		this.area = height * width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea() {
		this.area = width * height / 2.0;
	}
}


public class TriangleTest {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		Triangle t2 = new Triangle(20, 30);
		
		System.out.println("첫번쨰 삼각형");
		System.out.printf("높이 : %.1f 밑변 : %.1f 넓이 : %.1f\n", t.getHeight(), t.getWidth(), t.getArea());
		
		System.out.println("두번쨰 삼각형");
		System.out.printf("높이 : %.1f 밑변 : %.1f 넓이 : %.1f\n", t2.getHeight(), t2.getWidth(), t2.getArea());
		
		// 첫번쨰 삼각형 밑변, 높이 변경
		t.setHeight(50);
		t.setWidth(20);
		t.setArea();
		
		System.out.println("첫번쨰 삼각형");
		System.out.printf("높이 : %.1f 밑변 : %.1f 넓이 : %.1f\n", t.getHeight(), t.getWidth(), t.getArea());
		
	}

}
