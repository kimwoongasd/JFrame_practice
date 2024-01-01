package day1016;

// 정수형 1차원 배열을 매개변수로 전달받아 모든 요소에 1씩 증가한 후 출력하는 메소드 정의
class SistUtil {
	public void add (int[] a) {
		for (int i  = 0; i < a.length; i++) {
			a[i]++;
		}
		
		for (int i  = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}

public class CallByReferenceTest {

	public static void main(String[] args) {
		SistUtil su = new SistUtil();
		int[] num = {1, 2, 3, 4, 5};
		
		System.out.println("적용 전 ");
		for (int i  = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
			
		System.out.println("적용 후 ");
		su.add(num);

	}

}
