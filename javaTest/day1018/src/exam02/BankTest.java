package exam02;

public class BankTest {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		
		a1.deposit(100);
		a2.deposit(50);
		
		a1.draw(60);
		
		
		
		
		a2.draw(30);
		
		System.out.println(a1.getBalance());
		System.out.println(a2.getBalance());
		
		a1.printBalance();
		a2.printBalance();
		
		a1.addInterest();
		a2.addInterest();
		a1.printBalance();
		a2.printBalance();
		
		a1.draw(50);
	}

}
