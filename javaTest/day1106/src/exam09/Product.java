package exam09;

import java.util.Random;

// 제품을 위한 클래스
// 새로운 정수를 제품이라고 가정
public class Product {
	// 새 제품을 위한 정수형 변수
	// 생산자는 이 정수를 계속 새롭게 만든다
	// 소비자는 이 정수를 계속 가져다 쓴다
	int number;
	
	// 새 제품이 생산되었는지 판별하기 위한 변수
	// 생산자는 새 제품을 생산하면 true
	// 소비자는 제품을 소비하면 false로 변경
	boolean isNew;
	
	// 생산자가 새 제품을 생산하기 위한 메소드
	// 생산자가 새 제품을 만들고 있는동안 소비자는 접근을 못해야하므로
	// 임계영역을 성을 위하여 synchronized카워드를 추가
	public synchronized void makeNumber() {
		
		try {
			//제품이 소비될때 까지 대기
			while(isNew == true) {
				wait();
			}
			
			// 새 제품 생성
			Random r = new Random();
			number = r.nextInt(100) + 1;
			
			System.out.println("생산자가 제품 생산 " +  number);
			
			isNew = true;

			// 대기중인 다른 쓰레드를 꺠우 ㄴ다
			notify();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//소비자가 사용하는 메소드
	public synchronized int useNumber() {
		int n = 0;
		try {
			// 새로운 제품이 생산될떄까지 기다린다
			while(isNew == false) {
				wait();
			}
			
			// 제품 소비
			n = number;
			System.out.println("소비자가 소비 " +  n);
			
			isNew = false;
			
			// 대기중인 다른 쓰레드를 꺠우 ㄴ다
			notify();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return n;
	}
	
}
