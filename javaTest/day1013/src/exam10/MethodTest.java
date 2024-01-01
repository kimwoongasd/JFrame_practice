package exam10;

// 두개의 정수형 1차원 배열 매개변수로 전달받아
// 각 요소의 합을 구한 1차원 배열을 반환하는 메소드
class SistUtil {
	public int[] sum(int[] a, int[] b) {
		int[] res = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			res[i] = a[i] + b[i];
		}
		
		return res;
	}
}

public class MethodTest {

	public static void main(String[] args) {
		SistUtil su = new SistUtil();
		int[] apple = {10, 20, 3, 40, 5};
		int[] graoes = {15, 21, 23, 42, 25};
		
//		for (int x : su.sum(apple, graoes)) {
//			System.out.println(x);
//		}
		
		// 메소드가 반환하는 자료형이 정수형 배열이기 때문에 정수형 배열에 저장
		int[] total = su.sum(apple, graoes);
		
		for (int x : total) {
			System.out.println(x);
		}
		
		
	}
}
