package exam17;

public class CarTest {

	public static void main(String[] args) {
		// 추상클래스는 객체로 생성 불가능
		// Vehicle v = new Vehicle();
		
		Car c = new Car();
		c.speed = 20;
		
		System.out.println(c.getKilosPerLiter());
		c.printSpeed();
	}

}
