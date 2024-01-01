package exam10;

interface A {
	int year = 2023;
	public void pro();
}

class B implements A {

	@Override
	public void pro() {
		// 인터페이스에서만든 변수는 상수이기 때문에 값을 변경하지 못한다
//		year = 2024;
	}
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
