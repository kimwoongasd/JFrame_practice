package exam14;

/*
 * 부모로부터 물려받은 기능을 재정의 하는것 === 메소드 오버라이딩
 * 메소드 오버라이딩은 메소드 이름뿐만 아니라 매개변수의 개수와 자료형까지 일치되게 재정의 해야한다 
*/

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b = new Bird("참새", "노랑", true);
		b.fly();
		
		Airplane a = new Airplane("고잉444", "하늘", true, true);
		a.fly();
		
		Airplane a2 = new Airplane("고잉454", "하늘", true, false);
		a2.fly();
	}

}
