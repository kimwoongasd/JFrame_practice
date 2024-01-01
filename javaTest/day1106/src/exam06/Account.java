package exam06;

// 모금액을 위한 클래스
public class Account {
	private int balance; // 잔액 변수
	
	// 입금을 위한 메소드
	public void deposit(int amount) {
		balance += amount;
	}
	
	// 현재 잔액을 반환하는 메소드
	public int getBalance() {
		return balance;
	}
}
