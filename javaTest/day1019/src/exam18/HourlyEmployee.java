package exam18;

public class HourlyEmployee extends Employee {
	private int total;
	private int pay;
	private int time;
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public HourlyEmployee(String name, String no, int pay, int time) {
		super(name, no);
		this.pay = pay;
		this.time = time;
	}

	@Override
	public void computeSalary() {
		total = pay * time;
	}
	
	
}
