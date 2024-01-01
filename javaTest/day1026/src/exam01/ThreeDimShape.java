package exam01;

public abstract class ThreeDimShape extends Shape {
	protected double volume;

	public abstract void calcVolume();
	
	public double getVolume() {
		return volume;
	}

	public ThreeDimShape(int x, int y) {
		super(x, y);
	}
}
