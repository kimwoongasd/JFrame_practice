package exam01;

public class CarTest {

	public static void main(String[] args) {
//		Car myCar = new Car("아반테", "흰색");
//		myCar.speedUp(100);
//		myCar.speedDown(50);
		
		Movable myCar = new Car("아반테", "흰색"); 
		myCar.speedDown(100);
		myCar.speedUp(100);
		((Car)myCar).TurnLeft(); // 부모클래스에서 자식클래스 메소드 가져올 때 형변환
		((Car)myCar).TurnRight();;
	}

}
