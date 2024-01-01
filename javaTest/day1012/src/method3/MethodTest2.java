package method3;


class MyUtil {
	// 임의의 정수 n을 매개변수로 받아
	// 1~n까지의 합을 누적하여 출력하는 메소드
	
	public int getSum(int a) {
		int total = 0;
		for (int i = 1; i <= a; i++) {
			total += i;
		}
		
		return total;
	}
	
}

public class MethodTest2 {

	public static void main(String[] args) {
		MyUtil mu = new MyUtil();
		int n =10;
		System.out.println(mu.getSum(n));
	}

}
