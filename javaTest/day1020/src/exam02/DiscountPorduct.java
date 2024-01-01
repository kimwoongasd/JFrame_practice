package exam02;

public class DiscountPorduct extends Product {
	private double discount;

	public DiscountPorduct(String name, int price, int discount) {
		super(name, price);
		this.discount = discount;
		// 객체 생성시 필요한 메소드를 생성자 안에서 호출가능하다
		// 이렇게하면 따로 호출하지 않아도 된다
		getPrice();
	}
	
	@Override
	public int getPrice() {
		price = price - (int)(price * discount / 100);
		return price;
	}

	@Override
	public String toString() {
		return "이름 = " + name + ", 할인된 가격 = " + price;
	}
}
