package exam07;

// n를 매개변수로 전달받아 한글표기식으로 반환하는 메소드
// n은 0~9사이 정수
class SistUtil {
	public String toKor(int n) {
		String[] kor = {"영", "일", "이", "삼", "사", "오", "육",
				"칠", "팔", "구"};
		
		return kor[n];
	}
	
}

public class MethodTest {

	public static void main(String[] args) {
		SistUtil su = new SistUtil();
		System.out.println(su.toKor(5));
		System.out.println(su.toKor(9));
		System.out.println(su.toKor(0));
	}

}
