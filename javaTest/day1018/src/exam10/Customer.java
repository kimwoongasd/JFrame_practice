package exam10;

public class Customer extends Person {
	String no;
	int mileage;
	
	public void setInfo() {
		// 자식클래스라도 private 영역에 접근 불가능
//		name = "초코";
		// setter, getter로 접근
		setName("초코");
		addr = "서울시 마포구";
		phone = "010-1111-1111";
		no = "AA112";
		mileage = 3000;
	}
	
	public void info() {
		// 자식클래스라도 private 영역에 접근 불가능
//		System.out.println("이름 " + name);
		// setter, getter로 접근
		System.out.println("이름 " + getName());
		System.out.println("주소 : " + addr);
		System.out.println("전화 : " + phone);
		System.out.println("고객 번호 : " + no);
		System.out.println("마일리지 : " + mileage);
	}
}
