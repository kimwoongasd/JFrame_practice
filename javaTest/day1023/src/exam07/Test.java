package exam07;

/*
 * a, b, c 객체들에서 모든 동일한 메소드를 시켰지만 객체마다 하는일이 다르다
 * 이를 객체자향 프로그램의 특징중 다형성이라고 한다
 * 
 * 다형성은 상속과 메소드 오버라딩과 연관있다
 * 
 * */

interface Shape {
	public void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("사각형을 그린다");
	}
	
}

class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("삼각형을 그린다");
		
	}
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("원을 그린다");
	}
	
}

public class Test {
	public static void main(String[] args) {
		Shape a = new Triangle();
		Shape b = new Circle();
		Shape c = new Rectangle();
		a.draw();
		b.draw();
		c.draw();
	}
}
