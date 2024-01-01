package exam19;

public class Dice {
	private int face;
	
	public void roll() {
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("주사위가 굴러갑니다~");
			
			
			try {
				Thread.sleep(100); // 0.1초 잠시 멈춘다
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		face = (int)(Math.random() * 6) + 1;
	}
	
	public int getFace() {
		return face;
	}
}
