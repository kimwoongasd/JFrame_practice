package exam14;

public class Customer extends Person {
	private String no;
	private int mileage;
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public Customer(String name, String addr, String phone, String no, int mileage) {
		super(name, addr, phone); // 이 코드가 없으면 부모의 기본생성자를 요구하는 것
		// super();
		this.no = no;
		this.mileage = mileage;
	}

	public Customer() {
		super();
	}
	
}
