package exam08;

// 실수형 1차원 배열을 매개변수로 전달받아 총합을 구하여 반환하는 메소드
class SistUtil {
	public double sum(double[] a) {
		double total = 0;
		
		for (double x : a) {
			total += x;
		}
		
		return total;
	}
}

public class MethodTest {

	public static void main(String[] args) {
		SistUtil su = new SistUtil();
		double[] num = {1.1, 2.2, 3.3, 4.4, 5.5};
		double[] num2 = {2.1, 3.2, 4.3, 5.4, 6.5};
		
		System.out.println("총합 : " + su.sum(num));
		System.out.println("총합 : " + su.sum(num2));
	}

}
