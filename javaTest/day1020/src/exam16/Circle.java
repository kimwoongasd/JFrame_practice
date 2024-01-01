package exam16;

import java.util.Random;

public class Circle extends Shape implements Movable {
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

	@Override
	public void move() {
		System.out.println("원을 이동시킵니다");
		System.out.println("원래 위치 : " + x + ", " + y);
		Random r = new Random();
		x += r.nextInt(100);
		y += r.nextInt(100);
		System.out.printf("이동한 위치 %d, %d\n", x, y);	
	}
	
	
}
