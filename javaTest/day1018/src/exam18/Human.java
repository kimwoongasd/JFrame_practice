package exam18;

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
		System.out.println("Human 생성자 호출");
	}
	
	public Human() {
		super();
		System.out.println("Human 생성자 호출");
	}
	
	public String toString() {
		return name + " " + age + "세"; 
	}
	
	public String getProfession() {
		return "없음";
	}
	
	public static void main(String[] agrs) {
		Human h1 = new Human("춘향", 18);
		Human h2 = new Human("몽룡", 21);
		Human h3 = new Human("사또", 50);
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
	}
	
}
