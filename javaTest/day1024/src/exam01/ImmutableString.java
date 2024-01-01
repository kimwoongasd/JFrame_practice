package exam01;

public class ImmutableString {

	public static void main(String[] args) {
		// 첫번째 객체 생성
		String data = "hell";
		System.out.println(data);
		// 두번쨰 객체 생성
		// 첫번째 객체는 쓰지 않는 가비지(쓰레기)가 된다
		// 가비지 == 더이상 참조되지 않는 메모리
		// 문자열을 변경시킬수록 가바지가 계속 만들어진다
		// 변하는 문자열 처리를 위하여 StringBuffer, StringBuilder를 사용
		// String과 다르게 변경되면 객체가 변경되서 가비지가 안생긴다
		data = data + " korea";
		System.out.println(data);

	}

}
