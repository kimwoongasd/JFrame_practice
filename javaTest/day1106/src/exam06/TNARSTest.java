package exam06;

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
		
		// join : 쓰레드 종료될 때까지 다음 코드로 넘어가지 않는다
		try {
			d1.join();
			d2.join();
			d3.join();
			d4.join();
			d5.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// join을 통해 쓰레드가 종료되고 출력을하면 50000이 나와야하는데 매번 다른 값이 나온다
		// 공유자원에 두개이상의 쓰레드가 한번에 접근해서 이러한 현상이 발생한다
		// 한번에 하나의 쓰레드에만 접근을 허용하기 위해서는 임계영역을 설정해야한다
		// 임계영역을 설정을 위하여 메소드 이름 앞에 sychronized 키워드를 입력
		System.out.println("전체 모금액 " + account.getBalance());
	}

}
