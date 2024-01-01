package exam12;

import java.util.HashMap;
import java.util.Scanner;

interface Shape {
	public void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("사각형을 그립니다");	
	}
}

class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("삼각형을 그립니다");	
	}
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("원을 그립니다");	
	}
}

public class MapTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		HashMap<String, Shape> map = new HashMap<String, Shape>();
		
		map.put("rectangle", new Rectangle());
		map.put("triangle", new Triangle());
		map.put("Circle", new Circle());
		
		Scanner sc = new Scanner(System.in);
		
		String type;
		System.out.println("어떤 도형을 그릴까요?");
		System.out.println("1. rectangle 2. triangle 3. circle");
		type = sc.next();
		
		
	}

}
