package exam06;

import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

public class URLTest {

	public static void main(String[] args) {
		try {
			// 사이트의 URL을 갖고 URL 객체를 생성
			URL url = new URL("https://www.hanbit.co.kr/store/books/new_book_list.html");
			
			// 그 문서으ㅣ내용을 내컴퓨터로 읽어 들이기 위하여 스트림 사용
			InputStream is = url.openStream();
			
			// 네트워크를 통해 한번에 읽어들일 데이터를 담기위한 byte배열을 만든다
			// 한번에 100바이트씩 읽어들인다
			byte[] data = new byte[100];
			
			//스트림의 끝이 아닐때 까지 읽어들여라
			while (is.read(data) != -1) {
				// 네트워크를 통해 읽어들인 데이터가 담긴 바이트 배열을 갖고
				// String 객체를 만든다
				String str = new String(data);
				System.out.println(str);
				
				// 다음 데이터를 읽어들이기 위하여 초기화
				Arrays.fill(data, (byte)0);
			}
			
			// 다 읽어 들인 후 반목문 탈출하면 사용했던 스트림 닫기
			is.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
