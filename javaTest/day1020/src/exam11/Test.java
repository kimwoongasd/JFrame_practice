package exam11;

interface A {
	public void pro();
	public void hello();
}

//인터페이스끼리 상속할 떄 extends
interface B extends A {
	public void check();
}

class C implements B {

	@Override
	public void pro() {
		System.out.println("pro입니다");
	}

	@Override
	public void hello() {
		System.out.println("hello입니다");
	}

	@Override
	public void check() {
		System.out.println("check입니다");
	}
}

public class Test {

	public static void main(String[] args) {
		C ob = new C();
		ob.check();
		ob.hello();
		ob.pro();

	}

}
