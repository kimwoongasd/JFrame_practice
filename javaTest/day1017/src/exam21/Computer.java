package exam21;

public class Computer {
	private String color;
	private String maker;
	private boolean power;
	private boolean sound;
	
	public String getColor() {
		return color;
	}
	
	public String getMaker() {
		return maker;
	}
	
	public boolean isPower() {
		return power;
	}
	
	public boolean isSound() {
		return sound;
	}
	
	public Computer(String color, String maker, boolean power, boolean sound) {
		super();
		this.color = color;
		this.maker = maker;
		this.power = power;
		this.sound = sound;
	}
	
	public Computer() {
		this("검정", "화성", false, false);
	}
	
	public void onPower() {
		this.power = true;
	}
	
	public void offPower() {
		this.power = false;
	}
	
	public void onSound() {
		this.sound = true;
	}
	
	public void offSound() {
		this.sound = false;
	}
	
}
