package exam13;

public class Customer extends Person {
	String no;
	int mileage;
	
	// 생성자를 생성하면 기본생성자 제공하지 않는다
	public Customer(String no, int m) {
		// 이 안에 아무것도 적지 않으면 부모의 기본생성자를 요구
		System.out.println("customer 생성자 호출");
	}
	
	public void setInfo() {
		name = "초코";
		addr = "서울시 마포구";
		phone = "010-1111-1111";
		no = "AA112";
		mileage = 3000;
	}
	
	public void info() {
		System.out.println("이름 " + name);
		System.out.println("주소 : " + addr);
		System.out.println("전화 : " + phone);
		System.out.println("고객 번호 : " + no);
		System.out.println("마일리지 : " + mileage);
	}
}
