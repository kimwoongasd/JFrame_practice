package exam19;

public class MathRandomTest {

	public static void main(String[] args) {
		double a = Math.random(); // 0 ~ 1 사이의 실수
		System.out.println(a);
		
		double b = a * 6;
		System.out.println(b);
		
		int c = (int)b;
		System.out.println(c);
		
		int d = c + 1;
		System.out.println(d);
	}

}
