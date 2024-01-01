package exam01;

public class Ellipse extends TwoDimShape {
	private double width;
	private double height;

	public Ellipse(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void calcArea() {
		area = width * height * Math.PI;
	}
}
