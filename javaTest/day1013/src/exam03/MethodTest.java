package exam03;

// 1~10까지의 합을 누적하여 봔환하는 메소드 정의
// 메소드에 역할에 따라 빈손으로 돌아가다도록 만들 수 있고 어떤 결과값을 가지고 돌아갈 수 있다
// 리턴값이 없는 메소드는 메소드 이름 왼쪽에 void를 쓴다
// 리턴값이 있는 메소드는 리턴값의 자료형을 쓴다
class SistUtil {
	public int toSum() {
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			total += i;
		}
		
		return total;
	}
}

public class MethodTest {

	public static void main(String[] args) {
		SistUtil su = new SistUtil();
		int r = su.toSum(); // 반환값이 int이기 떄문에 int에 저장
		System.out.println("총합 : " + r);
	}

}
