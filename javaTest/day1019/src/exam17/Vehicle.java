package exam17;

// 인터페이스와 다형성
// 1-1 가능하다
// 1-2 가능하다
// 1-4 추상클래스는 객체로 생성 불가능
// 		추상 메소드 : body가 구체화되지 않는 메소드
// 		상속받은 자식이 추상메소드를 구체화 한 후에 객체로 사용 가능
// 1-5

public abstract class Vehicle {
	int speed;
	
	public abstract double getKilosPerLiter();
	
	public void printSpeed() {
		System.out.println(speed);
	}
}
