package exam01;

public class Rectangle extends TwoDimShape {
	protected double width;
	protected double height;
	
	@Override
	public void calcArea() {
		area = width * height;		
	}

	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
}
