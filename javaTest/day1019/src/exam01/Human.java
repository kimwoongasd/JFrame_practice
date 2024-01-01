package exam01;

public class Human {
	protected String name;
	protected int age;
	
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

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Human 생성자 동작함");
	}
	
	public String toString() {
		return "이름 " + name + "나이 " + age;
	}

	public String getProfession() {
		return "";
	}
}
