package exam01;

public class LowerUpperTest {

	public static void main(String[] args) {
		String data1 = "Replaces the first substring of this "
				+ "string that matches the given regular"
				+ " expression with the given replacement.";
		
		// 모든 문자열을 소문자로
		String data2 = data1.toLowerCase();
		// 모든 문자열을 황금으ㅡ로
		String data3 = data1.toUpperCase();
		
		System.out.println(data2);
		System.out.println(data3);
	}
}
