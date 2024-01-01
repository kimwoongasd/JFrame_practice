package exam02;

public abstract class Vehicle {
	protected int speed;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public abstract double getKiloperLiter();
	public void printSpeed() {
		System.out.println("현재속도 : " + speed);
	}
}
