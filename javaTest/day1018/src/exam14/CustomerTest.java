package exam14;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c = new Customer("초코", "서울시 마포구", 
				"010-0000-0000", "A111", 2000);
		
		System.out.println("고객 이름 : " + c.getName());
		System.out.println("주소 : " + c.getAddr());
		System.out.println("전화 : " + c.getPhone());
		System.out.println("고객 번호 : " + c.getNo());
		System.out.println("마일리지 : " + c.getMileage());
	}

}
