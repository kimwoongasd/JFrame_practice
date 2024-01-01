package day1016;

// 정수 n을 매개변수로 전달받아 1증가시킨 후 출력하는 메소드 정의
class MyUtil {
	public void add (int n) {
		n++;
		System.out.println(n);
	}
}

public class CallByValueTest {

	public static void main(String[] args) {
		MyUtil mu = new MyUtil();
		int a = 100;
		mu.add(a);
		System.out.println(a);
	}

}
