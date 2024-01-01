package exam05;


class SistUtil {
	// 3과 4 를 더하여 출력하는 메소드
	public void sum() {
		System.out.println(3 + 4);
	}
	// 3, 4를 더하기하여 결과를 반환하는 메소드
	public int sumTwo() {
		return 3 + 4;
	}
	// 두개의 정수를 매개변수로 전달받아 더하기 출력하는 메소드
	public void sumThree(int a, int b) {
		System.out.printf("%d + %d = %d\n", a, b, a + b); 
	}
	// 두개의 정수를 매개변수로 전달받아 더하기 결과를 반환하는 메소드
	public int toSum(int a, int b) {
		int total = 0;
		total = a + b;
		return total;
	}
}

public class MethodTest {

	public static void main(String[] args) {
		SistUtil su = new SistUtil();
		
		su.sum();
		System.out.println(su.sumTwo());
		su.sumThree(2, 3);
		System.out.println("총합 : " + su.toSum(4, 5));
	}

}
