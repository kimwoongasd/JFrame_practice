package exam03;

import java.util.ArrayList;

interface Shape {
	public void draw();
	
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("원을 그린다");
	}
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

public class ArratListTest3 {
	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<Shape>();
		
		list.add(new Circle());
		list.add(new Rectangle());
		list.add(new Triangle());
		list.add(new Rectangle());
		list.add(new Circle());
		
		for (Shape s : list) {
			s.draw();
		}
		
		System.out.println("-----------------------------");
		for (int i = 0; i < list.size(); i++) {
			list.get(i).draw();
		}
	}
}
