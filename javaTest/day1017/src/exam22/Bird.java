package exam22;

public class Bird {
	private String name;
	private String color;
	private boolean fly;
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean isFly() {
		return fly;
	}

	public Bird(String name, String color, boolean fly) {
		super();
		this.name = name;
		this.color = color;
		this.fly = fly;
	}

}
