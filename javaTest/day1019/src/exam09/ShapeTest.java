package exam09;

public class ShapeTest {

	public static void main(String[] args) {
		// 사각형 객체 생성
		Rectangle r = new Rectangle(10, 10, 100, 20);
		// 면적, 둘레 계산
		r.calcRound();
		// 사각형 정보 출력
		r.calcArea();
		System.out.println("사각형 정보");
		System.out.println("x위치 : " + r.getX());
		System.out.println("y위치 : " + r.getY());
		System.out.println("가로 : " + r.getWidth());
		System.out.println("세로 : " + r.getHeight());
		System.out.println("넓이 : " + r.getArea());
		System.out.println("둘레 : " + r.getRound());
		
		// 원 객체 생성
		Circle c = new Circle(50, 30, 5.18);
		// 면적, 둘레 계산
		c.calcArea();
		c.calcRound();
		// 원 정보 출력
		System.out.println("원의 정보");
		System.out.println("x위치 : " + c.getX());
		System.out.println("y위치 : " + c.getY());
		System.out.println("반지름 : " + c.getR());
		System.out.println("넓이 : " + c.getArea());
		System.out.println("둘레 : " + c.getRound());

	}

}
