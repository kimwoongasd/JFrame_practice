package exam09;

//생산자 클래스를 만들어요
//소비자와 상관없이 계속하여 새로운 제품을 
//생산케 하기 위하여 Thread클래를 상속받아 
//멀티쓰레스가 가능하도록 합니다
public class Producer extends Thread{
	// TODO Auto-generated method stub
	// 제품을 맴버변수로 선언
	private Product product;
		
	// 생성시에 제품을 매개변수로 ㅈ전달받아 초기화한다
	public Producer(Product product) {
		this.product = product;
	}
	
	//생산자 쓰레드가 해야 할 일을 run을 오버라이딩 하여 써 줍니다.
	public void run() {
		//10개의 새로운 제품을 생산하도록 합니다.
		for (int i = 0; i < 10; i++) {
			try {
				product.makeNumber();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	

}
