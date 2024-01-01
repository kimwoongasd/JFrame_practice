package exam01;

public interface Movable {
	int speed = 100; // 상수는 값이 있어야한다, final 생략가능
	
	public void speedUp(int amount); // abstracr 생략가능
	public void speedDown(int amount);
	
	public void printSpeed(); // 추상메소드는 body를 구체화할 수 없다
	
}
