package exam08;

class Employee {
	private String name;
	private String phone;
	private int pay;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getPay() {
		return pay;
	}
	
	public void setPay(int pay) {
		this.pay = pay;
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee em = new Employee();
		Employee em2 = new Employee();
		
		System.out.println("이름 : " + em.getName());
		System.out.println("전화번호 " + em.getPhone());
		System.out.println("연봉 : " + em.getPay() + "원");
		
		em2.setName("칠복");
		em2.setPhone("010-1551-1221");
		em2.setPay(50000);
		System.out.println("이름 : " + em2.getName());
		System.out.println("전화번호 " + em2.getPhone());
		System.out.println("연봉 : " + em2.getPay() + "원");

	}

}
