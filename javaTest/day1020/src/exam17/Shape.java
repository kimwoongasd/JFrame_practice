package exam17;

// 공통적인 속성들과 동작들을 뽑아 일반화 시키기
public abstract class Shape {
	protected int x;
	protected int y;
	
	// 도형의 넓이, 크기
	protected double area;
	protected double round;
	
	public abstract void calcRound();
	public abstract void calcArea();
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setYl(int y) {
		this.y = y;
	}
	
	public double getArea() {
		return area;
	}
	
	public double getRound() {
		return round;
	}
	
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Shape() {
		super();
	}
	
	@Override
	public String toString() {
		return "x위치 = " + x + ", y위치 = " + y + ", 넓이 = " + area + ", 둘레 = " + round + " ";
	}
	
	
}
