package exam03;


public class ExceptionDivTest5 {
	// throws 키워드
	// 메소드 안에서 예외가 발생이 될떄 예외처리를 메소드 호출하는 쪽으로 잔파하기 위해 사용

	public static void calcDIv(int a, int b) throws ArithmeticException {
		int div = a / b;
		System.out.println("나누기 결과 " + div);
	}

	public static void main(String[] args) {
		// 메소드 예외처리는 메소드 호출한 쪽에서 한다
		try {
			calcDIv(5, 0);
		} catch (ArithmeticException e ) {
			System.out.println("에외발생 : " + e.getMessage());
		}
		
		
		
		
	}

}
