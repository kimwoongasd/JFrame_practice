package exam10;

public class ShapeTest {

	public static void main(String[] args) {
		// 사각형 객체 생성
		Rectangle r = new Rectangle(10, 10, 100, 20);
		// 면적, 둘레 계산
		r.calcRound();
		// 사각형 정보 출력
		r.calcArea();
		System.out.println("사각형 정보");

		System.out.println(r);
		
		// 원 객체 생성
		Circle c = new Circle(50, 30, 5.18);
		// 면적, 둘레 계산
		c.calcArea();
		c.calcRound();
		// 원 정보 출력
		System.out.println("원의 정보");
		
		System.out.println(c);

	}

}
