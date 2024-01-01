package exam01;

import java.io.IOException;

public class ThrowTest {

	public static void main(String[] args) {
		// 예외는 클래스이다
		// 예외가 발생하면 자바가 객체를 자동으로 생성해준다
		// 자바가 알고있는 예외는 throw로 만들지 않는다
		try {
			throw new IOException();
		} catch (Exception e) {

		}
	}

}
