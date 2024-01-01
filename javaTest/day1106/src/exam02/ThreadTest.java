package exam02;

// runnable 인터페이스로도 가능
class Person extends Thread {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	// 동시에 여러가지 일을 한다
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "가 밥을 먹는다");
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
		Person p2 = new Person("강호동");
		
		// 가능하면 공평하게 실행 == 쓰레드를 가동
		p1.start();
		p2.start();
	}
}
