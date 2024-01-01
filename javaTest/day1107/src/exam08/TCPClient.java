package exam08;

import java.io.InputStream;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		try {
			// 3. 클라이언트가 접속
			// Socket객체를 생성하여 서버에 통신을 요청
			Socket socket = new Socket("192.168.0.59", 9000);
			// 5. 소캣을 통하여 스트림을 생성한다
			InputStream is = socket.getInputStream();
			
			// 6. 데이터를 주고 받는다
			// 서버가 보내오는 데이터를 받아서 화면에 출력한다
			for (int i = 0; i < 10; i++) {
				// 서버가 보내온 데이터를 담는다
				int n = is.read();
				System.out.println("서버로 부터 수신된 데이터 : "  + n);
			}
			
			// 스트림을 닫아준다
			is.close();
			
			// 8. 소켓을 닫아준다
			socket.close();
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
	}

}
