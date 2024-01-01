package exam17;

// 메소드 오버라이딩
// 부모의 메소드를 자식클래스에 맞도록 재정의 하는것

public class SalariedEmployee extends Employee {
	private int salary;
	private int level;
	private int base;
	private int pay;
	

	public int getLevel() {
		return level;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public SalariedEmployee(String name, String no, int level) {
		super(name, no);
		this.level = level;
	}

	@Override 
	public void computeSalary() {
		switch (level) {
		case 1: base = 3000000; pay = 300000; break; 
		case 2: base = 3500000; pay = 350000; break;
		case 3: base = 4000000; pay = 400000; break;
		}
		
		salary = base + pay;
	}
}
