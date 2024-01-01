package exam14;

public class Airplane extends Bird {
	private boolean engine;

	public Airplane(String name, String color, boolean wing, boolean engine) {
		super(name, color, wing);
		this.engine = engine;
		
	
	}

	@Override
	public void fly() {
		if (wing && engine) {
			System.out.println(color + " 색" + name + "이(가) 슝~슝~");
		} else {
			System.out.println(color + " 색" + name + "이(가) 날수없다");
		}
	}
}
