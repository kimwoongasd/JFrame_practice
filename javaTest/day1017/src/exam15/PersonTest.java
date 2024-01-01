package exam15;

/*
 * 기본생성자(Default Constructor)
 * - 매개변수를 갖지 않는 생성자를 말한다
 * - 사용자가 생성자를 한 개도 만들지 않는다면 기본 생성자가 제공된다 
 * - 한 개라도 생성자를 만든다면 기본생성자를 제공하지 않는다
*/

class Person {
	private String name;
	private int age;
	private String addr;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public Person() {
		super();
	}
}

public class PersonTest {

	public static void main(String[] args) {

	}

}
