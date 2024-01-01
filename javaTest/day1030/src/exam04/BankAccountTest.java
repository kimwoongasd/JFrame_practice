package exam04;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		
		b.deposit(50000);
		try {
			b.withdraw(100000);
		} catch (Exception e) {
			// 예외가 발생한 곳을 추적해 가면서 메세지를 출력
			e.printStackTrace();
		}
		
	}

}
