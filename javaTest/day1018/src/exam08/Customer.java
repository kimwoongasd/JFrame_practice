package exam08;

public class Customer extends Person {
	String no;
	int mileage;
	
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
