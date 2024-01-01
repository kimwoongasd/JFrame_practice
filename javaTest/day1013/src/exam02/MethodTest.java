package exam02;

// 메소드는 빈속으로 돌아가는 메소드
class SistUtil {
	// 1~n까지 합을 누적하여 출력하는 메소드
	public void toSum(int n) { // 어디까지 더할 것인지 매개변수 n을 받는다
		int total = 0;
		for (int i = 1; i <= n; i++) {
			total += i;
		}
		
		System.out.println("총합 : " + total);
		// 마지막 return을 쓰지않아도 생략되어 있어서 매소드를 호출한 쪽으로 돌아간다
	}
}

public class MethodTest {

	public static void main(String[] args) {
		// SistUtil의 객체를 생성
		SistUtil su = new SistUtil();
		// 매개변수에 들어갈 자료형 입력
		su.toSum(5); // 메소드 호출
		su.toSum(100);

	}

}
