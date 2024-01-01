package exam11;

import exam11.Employee;

class Employee {
	private String name;
	private String phone;
	private int pay;
	
	public Employee(String name, String phone, int pay) {
		this.name = name;
		this.phone = phone;
		this.pay = pay;
	}
	
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
		Employee em = new Employee("솜솜", "010-1122-222", 60000);
		Employee em2 = new Employee("칠복", "010-7777-7777", 50000);
		
		System.out.println("이름 : " + em.getName());
		System.out.println("전화번호 " + em.getPhone());
		System.out.println("연봉 : " + em.getPay() + "원");
		
		System.out.println("이름 : " + em2.getName());
		System.out.println("전화번호 " + em2.getPhone());
		System.out.println("연봉 : " + em2.getPay() + "원");

	}

}
