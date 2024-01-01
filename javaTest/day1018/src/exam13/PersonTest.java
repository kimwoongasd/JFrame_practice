package exam13;

public class PersonTest {

	public static void main(String[] args) {
		Customer c = new Customer("A111", 100);
		c.setInfo();
		
		c.info();
		System.out.println("---------------------");
		
		c.eat("짜장면");
	}

}
