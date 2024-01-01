package exam01;

public class StringPlusTest {

	public static void main(String[] args) {
		System.out.println(100 + 200);
		System.out.println("100" + "200");
		System.out.println(100 + "200"); // 결과 문자열
		
		System.out.println("100" + 200); // 결과 문자열
		
		System.out.println(100 + "" + 200); // 결과 문자열
		
		// String으로 변환하기 위하여 ValueOf메소드를 제공하지만
		// 위의 방법처럼 어떤 데이터라도 + "" 으로하여 String으로 변환 가능
	}

}
