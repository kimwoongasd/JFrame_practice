package exam09;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void calcArea() {
		area = width * height;
	}
	
	@Override
	public void calcRound() {
		round = (width + height) * 2 ;
	}
	@Override
	public String toString() {
		return super.toString() + " 가로 = " + width + ", 세로 = " + height;
	}
	
	
}
