package exam01;

public class Bird {
	private String name;
	private String color;
	private boolean wing;
	
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


	public void fly() {
		if (wing == true) {
			System.out.printf("%s색 %s이(가) 훨~훨~\n", color, name);
		} else {
			System.out.printf("%s색 %s이(가) 날 수 없다\n", color, name);
		}
	}
}
