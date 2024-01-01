package exam02;

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

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}

	public String getProfession() {
		return "";
	}
}
