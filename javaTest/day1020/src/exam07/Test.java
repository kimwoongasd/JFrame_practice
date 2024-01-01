package exam07;

interface A {
	public void pro();
}

interface B {
	public  void hello();
}

// 다중상속의 효과를 기대할 목적으로 인터페이스를 사용한다
class C implements A, B {
	@Override
	public void hello() {
		System.out.println("hello입니다");
	}

	@Override
	public void pro() {
		System.out.println("pro입니다");
	}
}

// A,B가 클래스일때 클래스의 다중상속은 불가능
//class C extends A, B {
//	
//}

public class Test {

	public static void main(String[] args) {
		C ob = new C();
		ob.pro();
		ob.hello();
	}

}
