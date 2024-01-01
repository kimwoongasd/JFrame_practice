package exam05;

public class TNARSTest {

	public static void main(String[] args) {
		// 모금액을 위한 Account객체를 생성함
		Account account = new Account();
		
		// 성금자의 이름과 모금액을 위한 account 객체를 매개변수로 하여
		// 5명의 성금자객체를 생성
		Donor d1 = new Donor(account, "유재석");
		Donor d2 = new Donor(account, "강호동");
		Donor d3 = new Donor(account, "신동엽");
		Donor d4 = new Donor(account, "탁재훈");
		Donor d5 = new Donor(account, "이경규");
		
		// 5명의 성금자가 동시에 입금하기 위하여 쓰레드 가동
		d1.start();
		d2.start();
		d3.start();
		d4.start();
		d5.start();
		
		// 쓰레드가 끝나기전에 출력된다
		System.out.println("전체 모금액 " + account.getBalance());
	}

}
