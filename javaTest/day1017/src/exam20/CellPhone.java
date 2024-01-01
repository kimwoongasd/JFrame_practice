package exam20;

public class CellPhone {
	private String model;
	private String maker;
	private String color;
	private boolean power;
	private boolean camera;
	
	
	
	public String getModel() {
		return model;
	}

	public String getMaker() {
		return maker;
	}

	public String getColor() {
		return color;
	}

	public boolean isPower() {
		return power;
	}
	
	// boolean의 경우 is로 getter로 만든다
	public boolean isCamera() {
		return camera;
	}

	public CellPhone(String model, String maker, String color, boolean power, boolean camera) {
		super();
		this.model = model;
		this.maker = maker;
		this.color = color;
		this.power = power;
		this.camera = camera;
	}

	public void powerOn() {
		power = true;
	}
	
	public void powerOff() {
		power = false;
	}
	
}
