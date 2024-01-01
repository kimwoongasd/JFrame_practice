package exam04;

// 1~n까지의 합을 누적하여 봔환하는 메소드 정의
class SistUtil {
	public int toSum(int n) {
		int total = 0;
		for (int i = 1; i <= n; i++) {
			total += i;
		}
		
		return total;
	}
}

public class MethodTest {

	public static void main(String[] args) {
		SistUtil su = new SistUtil();
		int r = su.toSum(5); // 반환값이 int이기 떄문에 int에 저장
		System.out.println("총합 : " + r);
	}

}
