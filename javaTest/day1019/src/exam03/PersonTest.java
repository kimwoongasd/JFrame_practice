package exam03;

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
		Person p1 = new Person("초코", 20);
		int year = 2023;
		System.out.println(year); // 기본자료형은 값이 출력
		System.out.println(p1); // 참조자료형은 값이 있는 메모리 주소값
		// toString를 오버라이딩하면 p1.toString 하지 않아도
		// toString이 동작된어 값이 출력된다
	} 
}