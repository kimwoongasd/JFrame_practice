package exam16;

/*
 * 추상클래스와 추상메소드
 * - 미래에 만들어질 자식 클래스들이 가져야할 공통적인 속성과 동작을 뽑아서
 *   일반화(부모 클래스)를 만들 떄 어떠한 메소드가 반드시 자식클래스들에세는 필요한데
 *   일반화 하는 심점에는 메소드 body를 구체화할 수 없고 자식들이
 *   오버라이딩 하게끔 하기위해여 메소드의 body를 쓰지 않고
 *   메소드의 선언문만 적는다
 *   이 떄 메소드의 body가 없을을 표시하는데 메소드이 이름 왼쪽에 abstract를 붙인다
 * - 이것을 추상 메소드라고 한다
 * - 이와 같이 어떤 클래스가 추상메소드를 하나라도 가지고 있다면 그 클래스명 앞에
 * abstract를 붙여 추상클래스로 만들어야 한다
 * - 어떤한 클래스가 추상클래스로 부터 상속받았다면 추상클래스내에 있는
 * 모든 추상매소드들을 오버라이딩 해야한다
 */


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
