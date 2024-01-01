package exam01;

class MyUtil {
	public void pro(String data) {
		System.out.println("처리된 데이터는 "+ data + "입니다");
	}
}


public class ValueOfTest2 {

	public static void main(String[] args) {
		MyUtil mu  = new MyUtil();
		boolean a = true;
		double b = 56.7;
		
		// valueOf는 객체없이 사용하능한 static으로 만들었다
		mu.pro(String.valueOf(a));
		mu.pro(String.valueOf(b));
		
		// 다른 String 만드는 방법
		mu.pro(b + "");
	}

}
