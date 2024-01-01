package exam06;

/*
 * 클래스에서 이미 있는 클래스를 확장(상속)하여 새로운 클래스를 만들 수 있다
 * 부모의 메소드를 재정의 할 수 있다
 * 
 */

final class A {
	final public void pro() {
		System.out.println("A의 pro입니다");
	}
	
	public void hello() {
		System.out.println("하이");
	}
}

// final class는 상속이 안된다
//class B extends A {
	// final은 오버라이딩이 불가능하다
//	public void pro() {
//		System.out.println("B의 pro입니다");
//	}
//}

public class Test {
	public static void main(String[] args) {
//		B ob = new B();
//		ob.pro();
//		ob.hello();
		
		
	}

}
