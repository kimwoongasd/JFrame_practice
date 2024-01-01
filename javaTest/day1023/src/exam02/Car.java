package exam02;

public class Car extends Vehicle implements Movable {
	private String name;
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	@Override
	public void speedUp(int amount) {
		speed += amount;
		System.out.printf("속도를 %d로 올립니다\n", amount);
	}

	@Override
	public void speedDown(int amount) {
		speed -= amount;
		System.out.printf("속도를 %d로 내립니다\n", amount);

	}

	@Override
	public double getKiloperLiter() {
		return speed;
	}
	
	public void TurnLeft() {
		System.out.println("좌회전 합니다");
	}
	
	public void TurnRight() {
		System.out.println("우회전합니다");
	}

	
}
