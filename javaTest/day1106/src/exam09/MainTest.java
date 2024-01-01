package exam09;

public class MainTest {

	public static void main(String[] args) {
		// 제품 객체를 생성
		Product product = new Product();
		
		// 생산자 객체를 생성
		new Producer(product).start();
		
		// 소비자 객체를 생성
		new Consumer(product).start();
		
		
	}

}
