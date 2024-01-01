package exam15;

class Animal{
	
}

class Dog extends Animal {
	
}

class Cat extends Animal {
	
}

class Person {
	
}

public class AnimalTest {

	public static void main(String[] args) {
		// 상속관계에 있을떄에 부모의 참조변수는 자식 클래스의 객체를 생성 가능
		Animal a = new Dog();
		Animal b = new Cat();
		
		// instanceof : 참조 자료형 변수가 어떤 클래스에 해당하는지 판별
		// instanceof는 상속관계일 떄 사용가능 
		
		// a가 Dog클래스 인지 판별
		boolean f = a instanceof Dog;
		System.out.println(f);
		
		// a가 Cat클래스 인지 판별
		boolean f2 = a instanceof Cat;
		System.out.println(f2);
		
		Person p = new Person();
		// 상속관계가 아니라 오류
//		boolean f3 = p instanceof Cat;
	}
}
