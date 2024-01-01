package exam06;
/*
 * - 두개의 객체가 동일한 속성값들로 구성되어 있는지 판별하면
 * 	 자바의 제일 조상클래스인 Object의 equals 메소드를 오버라딩하여
 *   모든 속성값이 같으면 true 다르면 false
 * 
 * */

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
	
	public boolean equals(Person p) {
		if (!name.equals(p.name) || age != p.age) return false;
		return true;
		}
	}


public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("유신", 21);
		Person p2 = new Person("유신", 21);
		
		// 오버라이딩하지 않은 object의 equals는 주소값을 비교
		if (p1.equals(p2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		
	}
}