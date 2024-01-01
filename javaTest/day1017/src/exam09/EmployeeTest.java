package exam09;

/*
 * 생성자(Constructor)
 * - 클래스 이름과 같은 이름의 메소드
 * - 객체 생성시에 자동 수행되어 속성의 값을 초기화
 * 
 * 생성자는 일반 메소드처럼 호출문에 의해서 등작하는것이 아니기 떄문에 return이 없다
 * 따라서 생성자에는 return 자료형을 쓰지 않고 voud조차 쓰면 안된다
*/

class Employee {
	private String name;
	private String phone;
	private int pay;
	
	public void setEmployee(String name, String phone, int pay) {
		this.name = name;
		this.phone = phone;
		this.pay = pay;
	}
	
	public void serEmployee(String name, String phone, int pay) {
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
		Employee em = new Employee();
		Employee em2 = new Employee();
		
		em.setName("칠복");
		em.setPhone("010-1551-1221");
		em.setPay(50000);
		
		System.out.printf( "이름 : %s 전화 : %s 연봉 : %d\n", em.getName(), em.getPhone(), em.getPay());
		
		em2.setName("칠복");
		em2.setPhone("010-1551-1221");
		em2.setPay(50000);
		System.out.println("이름 : " + em2.getName());
		System.out.println("전화번호 " + em2.getPhone());
		System.out.println("연봉 : " + em2.getPay() + "원");

	}

}
