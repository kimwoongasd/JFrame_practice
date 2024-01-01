package exam07;

// 성금자를 위한 클래스
// 다른 성금자와 관계없이 계속하여 입금을 하기 위하여 쓰레드를 구현
public class Donor extends Thread { 
	String name; // 성금자 이름을 위한 맴버변수
	
	// 다른 성금자와 모금액을 공유하기 위해서
	// 모금액 클래스인 Account를 맴버변수로 선언
	Account account;
	
	// 생성자
	// 생성시에 모금액을 객체를 매개변수로 전달받아 초기화
	public Donor(Account account, String name) {
		this.account = account;
		this.name = name;
	}
	
	// 성금자가 해야할 일을 run를 오버라이딩
	public void run() {
		for (int i = 0; i < 10; i++) {
			account.deposit(1000);
			System.out.println(name + "의 " + (i + 1) + "번째 입금");
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}
