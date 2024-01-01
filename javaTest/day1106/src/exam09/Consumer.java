package exam09;


// 소비자 클래스를 만든다
// 생산자와 상관없이 계속하여 제품을 소비
public class Consumer extends Thread {

	// 생산자가 제품을 공유하기 위하여 맴버변수로 제품을 선언
	private Product product;
	
	// 생성시에 제품을 매변수로 전달받아 초기화
	public Consumer(Product product) {
		this.product = product;
	}
	
	// run을 오버라이딩하여 소비자가 해야할일
	public void run() {
		for (int i = 0; i < 10; i++) {
			//10개의 제품을 소비
			int newNumber = product.useNumber();
			
			try {
				Thread.sleep(i);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
