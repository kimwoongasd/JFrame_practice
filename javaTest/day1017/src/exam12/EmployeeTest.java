package exam12;

import exam12.Employee;
/*
 * 메소드 중복(메소드 오버로딩)
 * - 같은 이름의 메소드를 중복하여 정의하는 것
 * - 매개변수의 개수가 다르거나 자료형이 달라야한다
 * 
 * 생성자 중복
 * - 메소드 중복이 가능하듯이 생성자도 중복 정의 가능
 * - 메소드 중복과 마찬가지로 매개변수 개수가 다르거나 자료형이 달라야 한다
 * 
 * 생성자(Constructor)
 * - 클래스 이름과 같은 이름의 메소드
 * - 객체 생성시에 자동 수행되어 속성의 값을 초기화
 * 
 * 생성자는 일반 메소드처럼 호출문에 의해서 등작하는것이 아니기 떄문에 return이 없다
 * 따라서 생성자에는 return 자료형을 쓰지 않고 void조차 쓰면 안된다
*/

class Employee {
	private String name;
	private String phone;
	private int pay;
	
	public Employee(String name, String phone, int pay) {
		this.name = name;
		this.phone = phone;
		this.pay = pay;
	}
	
	public Employee(String name, String phone) {
		this.name = name;
		this.phone = phone;
		this.pay = 0;
	}
	
	public Employee() {
		this.name = "없음";
		this.phone = "없음";
		this.pay = 0;
	}
	
	public Employee(int pay) {
		this.name = "없음";
		this.phone = "없음";
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
		Employee em2 = new Employee();
		Employee em3 = new Employee("초코" , "010-10110-252");
		Employee em4 = new Employee(50000);
		
		System.out.printf( "이름 : %s 전화 : %s 연봉 : %d원\n", em.getName(), em.getPhone(), em.getPay());
		System.out.printf( "이름 : %s 전화 : %s 연봉 : %d원\n", em2.getName(), em2.getPhone(), em2.getPay());
		System.out.printf( "이름 : %s 전화 : %s 연봉 : %d원\n", em3.getName(), em3.getPhone(), em3.getPay());
		System.out.printf( "이름 : %s 전화 : %s 연봉 : %d원\n", em4.getName(), em4.getPhone(), em4.getPay());

	}

}
