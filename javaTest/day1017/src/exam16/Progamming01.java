package exam16;

/*
 * 속성은 private에 두고 동작은 public에 둔다
 * 하지만 때에 따라 속성이지만 public 동작이지만 private에 올 수 있다
 * 
 * */

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
		this.name = name;
		this.age = 0;
	}
	
	public Dog() {
		super();
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
