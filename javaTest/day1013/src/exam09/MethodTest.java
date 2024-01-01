package exam09;

// 두개의 실수형 1차원 배열을 매개변수로 전달받아 같은지 구하여 반환하는 메소드
class SistUtil {
	public boolean same(double[] a, double[] b) {
		if (a.length != b.length) return false;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		
		return true;
	}
}

public class MethodTest {

	public static void main(String[] args) {
		SistUtil su = new SistUtil();
		double[] num = {1.1, 2.2, 3.3, 4.4, 5.5};
		double[] num2 = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		System.out.println(su.same(num, num2));
		
		double[] num3 = {1.1, 2.2, 6.3, 5.4, 5.5};
		double[] num4 = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		System.out.println(su.same(num3, num4));
	}

}
