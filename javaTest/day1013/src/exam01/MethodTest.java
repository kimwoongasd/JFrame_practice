package exam01;

class SistUtil {
	// 1~10까지 합을 누적하여 출력하는 메소드
	public void toSum() { // 메소드 이름은 toSum으로 정의, 매개변수 없다
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			total += i;
		}
		
		System.out.println("총합 : " + total);
	}
}

public class MethodTest {

	public static void main(String[] args) {
		SistUtil su = new SistUtil();
		
		su.toSum(); // 메소드 호출

	}

}
