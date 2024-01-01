package exam01;

import exam02.Vehicle;

public class Car implements Movable {
	private String name;
	private String color;
	
	public void TurnLeft() {
		System.out.println("좌회전 합니다");
	}
	
	public void TurnRight() {
		System.out.println("우회전합니다");
	}
	
	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	@Override
	public void speedUp(int amount) {
		System.out.printf("속도를 %d로 올립니다\n", amount);
	}

	@Override
	public void speedDown(int amount) {
		System.out.printf("속도를 %d로 내립니다\n", amount);
	}

	@Override
	public void printSpeed() {
		
	}
	
}
