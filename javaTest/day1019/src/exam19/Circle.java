package exam19;

public class Circle extends TwoDimShape {
	private double r;

	@Override
	public void getArea() {
		area = r * r * Math.PI;
	}
}
