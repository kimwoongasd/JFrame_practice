package exam02;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car("아반뗴", "흰색");
		car.speedUp(100);
		car.speedDown(50);
		car.printSpeed();
		car.TurnRight();
		car.TurnLeft();
	}

}
