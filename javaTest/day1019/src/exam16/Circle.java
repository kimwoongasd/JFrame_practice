package exam16;

public class Circle extends Shape {
	private double r;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public Circle(int x, int y, double r) {
		super(x, y);
		this.r = r;
	}

	@Override
	public void calcRound() {
		round = r * 2 * Math.PI;
	}

	@Override
	public void calcArea() {
		area = r * r * Math.PI;
	}

	@Override
	public String toString() {
		return super.toString() + "반지름 = " + r;
	}
	
}
