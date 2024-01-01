package exam15;

class A {
	public A(String title) {
	}
	
	public A() {
		
	}
}

class B extends A {
	public B() {
		// 해결방법
		// 부모 A클래스의 기본생성자를 생성
		// super() 를 부모 생성자 매개변수에 맞춰 고친다
		super();
	}
}

public class Test {

	public static void main(String[] args) {

	}

}
