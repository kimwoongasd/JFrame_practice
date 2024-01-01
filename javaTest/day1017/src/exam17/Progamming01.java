package exam17;

/*
 * this
 * - 생성자나 메소드의 매개변수 이름이 클래스의 속성이름과 같은 경우가 있는데
 * 이를 구별하기 위해서 사용
 * 
 * this()
 * - 생성자가 중복 정의 되어 있을 떄 생성자 body안에서
 * 다른 생성자를 요구할 떄 사용하는 키워드
 * - this() 사용시 반드시 생성자의 첫번쨰 문자에 와야한다
 * - 자신을 제외라고 다른 생성자 불러올떄 사용
 * 
*/

class Dog {
	private String name; // 전용맴버
	public String breed; // 공용맴버
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Dog(String name, String breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public Dog(String name, int age) {
		this(name, "진돗개", age);
	}
	
	public Dog() {
		this("초코", 5); // Dog(String name, int age)를 부른다
		// this("초코", "시브로자브종", 5);
		System.out.println("기본생성자 동작함");
	}
	
	
}

public class Progamming01 {

	public static void main(String[] args) {
		Dog d = new Dog();
		
		System.out.println(d.getName());
		System.out.println(d.getBreed());
		System.out.println(d.getAge());
		System.out.println("------------------");
		
		Dog d2 = new Dog("솜", "스피츠", 9);
		System.out.println(d2.getName());
		System.out.println(d2.getBreed());
		System.out.println(d2.getAge());
		
		System.out.println("------------------");
		Dog d3 = new Dog("칠복", 5);
		System.out.println(d3.getName());
		System.out.println(d3.getBreed());
		System.out.println(d3.getAge());

	}

}
