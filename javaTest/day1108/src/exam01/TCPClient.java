package exam01;

import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		try {
			// 서버에 연결을 한다
			Socket socket = new Socket("192.168.0.59", 9002);
			
			String msg = args[0];
			// 서버에 데이터를 보낼 스트림을 생성한다
			OutputStream os = socket.getOutputStream();
			
			// 서버에 보낼 바이트배열에 String 메세지를 바이트배열로 변환해서 저장
			byte[] data = msg.getBytes();
			
			// 서버에 데이터를 보낸다
			os.write(data);
			
			os.close();
			socket.close();
			
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
	}

}
