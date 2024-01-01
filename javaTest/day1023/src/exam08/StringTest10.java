package exam08;

public class StringTest10 {
	public static void main(String[] args) {
		String data = new String("hello java hello korea");
		
		// 문자열 start 인댁스부터 end 인덱스 전까지 잘른다
		String j = data.substring(6, 10);
		System.out.println(j);
		
		// 뒤에 생략하면 끝까지 출력
		j = data.substring(6);
		System.out.println(j);
		
//		System.out.println(data.substring(data.indexOf("j"), data.indexOf("j") + 4)  );
	}	
}
