package exam01;

class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void eat() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "이(가) 밥을 먹어요");
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {

			}
		}
	}
}


public class ThreadTest {

	public static void main(String[] args) {
		Person p1 = new Person("유재석");
		Person p2 = new Person("상호동");
		
		p1.eat();
		p2.eat();
	}

}
