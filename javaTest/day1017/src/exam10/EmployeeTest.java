package exam10;

/*
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
	
	
	public Employee() {
		name = "솜솜";
		phone = "010-1111-1122";
		pay = 5000;
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
		
		System.out.printf( "이름 : %s 전화 : %s 연봉 : %d\n", em.getName(), em.getPhone(), em.getPay());
		
		System.out.println("이름 : " + em2.getName());
		System.out.println("전화번호 " + em2.getPhone());
		System.out.println("연봉 : " + em2.getPay() + "원");

	}

}
