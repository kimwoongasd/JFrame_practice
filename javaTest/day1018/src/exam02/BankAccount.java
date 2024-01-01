package exam02;

public class BankAccount {
	private int balance;	 // 잔액

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}

	public void draw(int amount) { // 인출
		if (balance - amount < 0) {
			System.out.println("잔액 부족");
		} else {
			balance -= amount;
		}
	}
	
	public void deposit(int amount) { // 저금
		balance += amount;
	}
	
	
	
	public void printBalance() {
		System.out.println("현재 잔액은 " + balance + "원 입니다.");
	}
	
	public void addInterest() {
		balance += (int)(balance * 7.5 / 100);
	}
	
}
