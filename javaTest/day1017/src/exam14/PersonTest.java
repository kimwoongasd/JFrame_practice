package exam14;

/*
 * 기본생성자(Default Constructor)
 * - 매개변수를 갖지 않는 생성자를 말한다
 * - 사용자가 생성자를 한 개도 만들지 않는다면 기본 생성자가 제공된다 
 * - 한 개라도 생성자를 만든다면 기본생성자를 제공하지 않는다
*/

class Person {
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}

public class PersonTest {

	public static void main(String[] args) {
		// 사용자가 생성자를 한 개도 만들지 않는다면 기본 생성자가 제공하기 때문에
		// 아래와 같이 객체를 생성할 수 있다
		Person p = new Person();
		
		// 기본생성자 초기값
		// String : null, int : 0, boolean : false
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}

}
