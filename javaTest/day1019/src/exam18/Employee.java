package exam18;

//공통적인 속성과 동작을 뽑아서 부모클래스 만드는 것을 "일반화"한다 하고 한다

public abstract class Employee {
	protected String name;
	protected String no;
	
	// 시간제와 월급제 계산 방법이 다르기 떄문에 일반화 하는 시점에서 메소드
	// body를 구체화 할 수 없다
	public abstract void computeSalary();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNo() {
		return no;
	}
	
	public void setNo(String no) {
		this.no = no;
	}

	public Employee(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}

	public Employee() {
		super();
	}
}
