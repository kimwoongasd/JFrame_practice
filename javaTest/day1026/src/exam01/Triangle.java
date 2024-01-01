package exam01;

public class Triangle extends TwoDimShape {
	private double widht;
	private double height;
	
	public Triangle(int x, int y, double widht, double height) {
		super(x, y);
		this.widht = widht;
		this.height = height;
	}
	
	@Override
	public void calcArea() {
		area = widht * height / 2;	
	}
}
