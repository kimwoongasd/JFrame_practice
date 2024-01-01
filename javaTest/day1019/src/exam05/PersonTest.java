package exam05;

/*
 * - toString은 자바의 제일 조상클래스인 Object의 메소드이다
 * - 객체의 속성(들)을 문자열로 표현할때 toString을 오버라이딩하여 사용
 * - 객체를 출력문에 출력하게되면 자동으로 toString이 동작하여 원해
 *   Object의 toString은 객체 주소값을 반환되도록 되어있다
 */

class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}


public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("유신", 21);
		Person p2 = new Person("유신", 21);
		
		// ==으로 비교할 떄 참조형은 메모리상의 주소값을 비교, 기본형은 값을 비교
		if (p1 == p2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		
	}
}