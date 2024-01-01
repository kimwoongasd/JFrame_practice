package exam03;

class Person implements Runnable {
	String name;
	
	public Person(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "가 밥을 먹는다");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}

public class ThreadTest {

	public static void main(String[] args) {
		Person p1 = new Person("유재석");
		Person p2 = new Person("강호동");
		
		// Runnable를 구현한 객체가 바로 start를 호출할 수 없다
		// Thread객체로 포장해서 start를 호출할 수 있다
//		p1.start();
//		p2.start();
		
//		Thread t1 = new Thread(p1);
//		Thread t2 = new Thread(p2);
//		t1.start();
//		t2.start();
		
		(new Thread(p1)).start();
		(new Thread(p2)).start();
	}

}
