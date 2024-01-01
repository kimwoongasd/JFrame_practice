package exam09;

public class PersonTest {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setInfo();
		
		c.info();
		System.out.println("---------------------");
		
		c.eat("짜장면");
	}

}
