package exam01;

public class Cylinder extends ThreeDimShape {
	private double r;
	private double height;
	
	public Cylinder(int x, int y, double r, double height) {
		super(x, y);
		this.r = r;
		this.height = height;
	}
	
	@Override
	public void calcVolume() {
		volume = Math.PI * (r * r) * height;
	}
}
