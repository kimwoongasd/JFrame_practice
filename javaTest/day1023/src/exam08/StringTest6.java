package exam08;

public class StringTest6 {

	public static void main(String[] args) {
		String data = "hello korea hello java";
		int n = 0;
		// 문자열의 길이만큼 반복 실행하여 한글자씩 출력
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == 'a') {
				n++;
			}
		}
		
		System.out.println("소문자 a의 개수 : " + n);
	}
}
