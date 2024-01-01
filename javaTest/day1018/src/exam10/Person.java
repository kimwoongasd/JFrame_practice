package exam10;

public class Person {
	private String name;
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
	
}
