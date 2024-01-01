package exam15;

import java.util.Random;

public class Rectangle extends Shape implements Movable 
{
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
	
	@Override
	public void move() {
		System.out.println("사각형을 이동시킵니다");
		System.out.println("원래 위치 : " + x + ", " + y);
		Random r = new Random();
		x += r.nextInt(100);
		y += r.nextInt(100);
		System.out.printf("이동한 위치 %d, %d\n", x, y);	
	}
}
