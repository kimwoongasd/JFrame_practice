package exam04;

public class BankAccount {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
		System.out.println("잔액 : " + balance);
	}
	
	public void withdraw(int money) throws NegativeBalanceException {
		if (money > balance) {
			throw new NegativeBalanceException("잔액이 부족합니다");
		}
		
		balance -= money;
		System.out.println("잔액 : " + balance);

	}
}
