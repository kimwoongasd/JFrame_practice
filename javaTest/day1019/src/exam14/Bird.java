package exam14;

public class Bird {
	protected String name;
	protected String color;
	protected boolean wing;
	
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
	
	public boolean isWing() {
		return wing;
	}
	
	public void setWing(boolean wing) {
		this.wing = wing;
	}
	
	public Bird(String name, String color, boolean wing) {
		super();
		this.name = name;
		this.color = color;
		this.wing = wing;
	}
	
	public Bird() {
		super();
	}
	
	public void fly() {
		if (wing) {
			System.out.println(color + "색 " + name + "이(가) 훨 ! 훨~");
		}
	}
}
