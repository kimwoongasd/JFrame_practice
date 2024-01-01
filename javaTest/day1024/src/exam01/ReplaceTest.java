package exam01;

public class ReplaceTest {

	public static void main(String[] args) {
		String data = "java";
		// j문자를 A문자로 바꾼다
		String data2 = data.replace('j', 'A');
		// String은 불변의 특징이 있다
		// replace : 바꿔진 새로운 문자열을 반환
		
		System.out.println(data);
		System.out.println(data2);
		
		String data3 = data.replace("ja", "자");
		System.out.println(data3);
	}

}
