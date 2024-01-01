package exam08;

public class Melon extends Food {
	private String info;

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Melon(double kal, int price, double weight, String info) {
		super(kal, price, weight);
		this.info = info;
	}

	@Override
	public String toString() {
		return "Melon [cal=" + cal + ", price=" + price + ", weight=" + weight + " info=" + info + "]";
	}
	
	
	public boolean eqauls(Melon m) {
		if(cal == m.cal && price == m.price && weight == m.weight) {
			return true;
		} else {
			return false;
		}
	}
	
}
