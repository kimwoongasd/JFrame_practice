package exam01;

public class Shpere extends ThreeDimShape {
	private double r;

	public Shpere(int x, int y, double r) {
		super(x, y);
		this.r = r;
	}

	@Override
	public void calcVolume() {
//		volume = 4 / 3 * Math.PI * (r * r * r); 	
		volume = 4 / 3 * Math.PI * Math.pow(r, 3);	
	}
}
