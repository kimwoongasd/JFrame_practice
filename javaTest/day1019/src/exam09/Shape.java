package exam09;


// 공통적인 속성들과 동작들을 뽑아 일반화 시키기
public class Shape {
	protected int x;
	protected int y;
	
	// 도형의 크기
	protected double area;
	protected double round;
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
		// TODO Auto-generated constructor stub
	}
	
	// 도형의 둘레 계산
	public void calcRound() {
		// 도형마다 계산 방법이 다르므로 비워둔다
	}
	
	// 도형의 넓이 계산
	public void calcArea() {
			// 도형마다 계산 방법이 다르므로 비워둔다
	}
	@Override
	public String toString() {
		return "x위치 = " + x + ", y위치 = " + y + ", 넓이 = " + area + ", 둘레 = " + round + " ";
	}
	
	
}
