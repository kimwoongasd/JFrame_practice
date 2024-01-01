package exam02;

import java.util.ArrayList;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void info() {
		System.out.println("이름 " + name + " 나이 " + age);
	}

	@Override
	public String toString() {
		return "이름 " + name + " 나이 " + age;
	}

}

public class ArratListTest2 {

	public static void main(String[] args) {
		// 자료형이 어떤것이라도 담을 수 있다
		// class, int, double, String 등등
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(56.7);
		list.add("백");
		list.add(true);
		
		Person p = new Person("유재석", 46);
		// toString 오버라이딩 전 출력
		// [100, 56.7, 백, true, exam02.Person@1e643faf]
		// 메모리 주소값이 출력된다
		list.add(p);
		list.add(new Person("정준하", 50));
		
		System.out.println(list);
		
	}

}
