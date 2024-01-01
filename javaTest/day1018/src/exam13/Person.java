package exam13;

public class Person {
	protected String name;
	String addr;
	String phone;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat(String food) {
		System.out.printf("%s가 %s를 먹는다", name, food);
	}
	
	public Person() {
		System.out.println("person 생성자 호출");
	}
	
}
