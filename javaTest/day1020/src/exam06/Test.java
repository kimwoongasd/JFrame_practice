package exam06;

interface A {
	int data = 2023;
	
	public void pro();
}

class B implements A {
	@Override
	public void pro() {
		System.out.println("pro입니다");
	}
}


public class Test {
	public static void main(String[] args) {
		B b = new B(); // == A b = new B();
		b.pro();
	}
}
