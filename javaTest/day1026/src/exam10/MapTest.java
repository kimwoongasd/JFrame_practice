package exam10;

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
		String[] key = {"Rectangle", "Triangle", "Circle"};
		String[] value = {"exam10.Rectangle",
				"exam10.Triangle",  "exam10.Circle"};

		HashMap<String, Shape> info = new HashMap<String, Shape>();
		
		for (int i = 0; i < 3; i++) {
//			String k = key[i];
//			String className = value[i];
//			Shape s = (Shape)Class.forName(className).newInstance();
//				
//			info.put(k, s);
			info.put(key[i], (Shape)Class.forName(value[i]).newInstance());
		}
		
		System.out.println(info);
		Scanner sc = new Scanner(System.in);
		
		String cmd;
		System.out.println("어떤 도형을 그릴까요");
		System.out.println("1. Rectangle 2. Triangle 3. Circle");
		int n = sc.nextInt();
		cmd = key[n - 1];
		
		Shape shape = info.get(cmd);
		shape.draw();
	}

}
