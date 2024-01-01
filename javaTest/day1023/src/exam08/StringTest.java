package exam08;

/*
 * 보통 클래스를 사용하려면 import해야한ㅣ
 * lava.lang 패키지의 클래스들을 import하지 않고 바로 사용
 * 
 * */
public class StringTest {

	public static void main(String[] args) {
		// String은 문자열을 표현하기 위해서
		// 자바가 제공하는 클래스, 참조자료형이다
		// 기본자료형 처럼 쓰는 것을 허용
		
		String date = new String("길동");
		
		
		char[] data = {'h', 'e', 'i', 'e', 'a', 'k', 'g', 'c', 'd'};
		
		String str = new String(data);
		// char의 배열을 갖고 String으로 만든다
		System.out.println(str);
		
		// char 배열의 일부분을 가지고 String 만들 수 있다
		String str2 = new String(data, 0, 5);
		System.out.println(str2);
	}

}
