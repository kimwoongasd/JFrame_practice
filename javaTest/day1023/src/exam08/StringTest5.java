package exam08;

public class StringTest5 {

	public static void main(String[] args) {
		String data = "hello korea";
		
		// 문자열의 길이만큼 반복 실행하여 한글자씩 출력
		for (int i = 0; i < data.length(); i++) {
			System.out.println(data.charAt(i));
		}
	}
}
