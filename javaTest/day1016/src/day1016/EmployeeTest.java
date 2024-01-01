package day1016;

class Employee {
	private String name;
	private String phone;
	private int pay;
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public int getPay() {
		return pay;
	}
	
	public void setPay(int p) {
		pay = p;
	}
	
	public void setPhone(String p) {
		phone = p;
	}
	
	public void setName(String n) {
		name = n;
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee ep = new Employee();
		
		ep.setName("김");
		ep.setPay(2500000);
		ep.setPhone("01011111111");
	}

}
