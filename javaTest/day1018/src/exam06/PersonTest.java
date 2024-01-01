package exam06;

public class PersonTest {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.name = "솜솜";
		c.addr = "서울시 마포구";
		c.phone = "010-1234-1234";
		c.no = "A110";
		c.mileage = 1000;
		
		System.out.println("고객명 : " + c.name);
		System.out.println("주소 : " + c.addr);
		System.out.println("전화 : " + c.phone);
		System.out.println("고객 번호 : " + c.no);
		System.out.println("마일리지 : " + c.mileage);

	}

}
