package exam02;

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

class Human {
	public void sayHello() {
		System.out.println("hi");
	}
}

class Bird {
	public void fly() {
		System.out.println("훨 ~ 훨");
	}
}

public class ArratListTest3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Human());
		list.add(new Human());
		list.add(new Circle());
		list.add(new Rectangle());
		list.add(new Bird());
		list.add(new Bird());
		list.add(new Rectangle());
		list.add(new Circle());
		list.add(new Triangle());
		
		// 다양한 자료형을 넣다보니 리스트에 담긴 요소를 꺼내아서
		// 클래스 기능을 사용하려면 형변환해서 써야하는데
		// 일일이 물어봐야하는 번거로움이 있다
		for (int i = 0; i < list.size(); i++) {
			 Object data = list.get(i);
			 if (data instanceof Shape) ((Shape)data).draw();
			 if (data instanceof Human) ((Human)data).sayHello();
			 if (data instanceof Bird) ((Bird)data).fly();
			 
		}
	}
}
