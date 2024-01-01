package exam11;

//  정수형 1차원 배열 두개를 매개변수로 전달받아
// 2개의 배열을 합친 새로운 배열을 반환
class SistUtil {
	public int[] concatArray(int[] a, int[] b) {
		int[] res = new int[a.length + b.length];
		
		for (int i = 0; i < a.length; i++) {
			res[i] = a[i];
		}
		
		for (int i = a.length; i < a.length + b.length; i++) {
			res[i] = b[i - a.length];
		}
		
		return res;
	}
}

public class MethodTest {

	public static void main(String[] args) {
		SistUtil su = new SistUtil();
		int[] class1 = {10, 20, 3, 40, 5};
		int[] class2 = {15, 21, 23, 42, 25, 26};
		
		int[] res = su.concatArray(class1, class2);
		
		for (int x : res) {
			System.out.print(x + " ");
		}
	}
}
