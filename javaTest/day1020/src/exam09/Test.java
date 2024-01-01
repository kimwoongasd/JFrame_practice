package exam09;

interface A {
	public void pro();
}

interface B {
	public void hello();
}

class C {
	public void check() {
		System.out.println("체크입니다");
	}
}

// 새로 만들어지는 클래스가 이미 있는 클래스 하나 상속받고
// 여러개의 인터페이스를 상속 받을 수 있다
class D extends C implements A, B {

	@Override
	public void hello() {
		System.out.println("hello 입니다");
	}

	@Override
	public void pro() {
		System.out.println("pro입니다");
	}
}

public class Test {

	public static void main(String[] args) {
		D ob = new D();
		ob.pro();
		ob.hello();
		ob.check();

	}

}
