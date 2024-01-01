package Lab02;

public class Car implements Movable {

	@Override
	public void speedUp(int amount) {
		System.out.println(amount + "만큼 속도를 높입니다");
	}

	@Override
	public void speedDown(int amount) {
		System.out.println(amount + "만큼 속도를 줄입니다");
	}

	@Override
	public void printSpeed() {
		System.out.println("현재 속도는?");
	}
	
	
	public void TurnLeft() {
		System.out.println("좌회전");
	}
	
	public void TurnRight() {
		System.out.println("우회전");
	}
}
