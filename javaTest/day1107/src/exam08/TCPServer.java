package exam08;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Random;

public class TCPServer {

	public static void main(String[] args) {
		try {
			// 1. ServerSocket을 생성한다
			ServerSocket server = new ServerSocket(9000);
			System.out.println("서버가 가동되었습니다");
			// 2. 무한 대기상태로 클라이언트의 접속을 기다린다
			while (true) {
				// 4. accept를 호풀하여 클라이언트의 접속을 수락
				// 이 메소드는 연결한 클라이언트와 통신을 위한 Socket를 반환한다
				Socket socket = server.accept();
				
				System.out.println("**클라이언트가 연결하였습니다.**");

				Thread.sleep(3000);
				
				// 5. 소캣을 통하여 스트림을 생성한다
				OutputStream os = socket.getOutputStream();
				
				// 6. 데이터를 주고 받는다
				// 반복문으로 10개의 난수를 보내보자
				Random r = new Random();
				for (int i = 0; i < 10; i++) {
					int n = r.nextInt(100);
					// 데이터를 클라이언트에 보낸다
					os.write(n);
					Thread.sleep(100);
				}
				
				// 7. 스트림을 닫아준다
				os.close();
				
				// 8. 소켓을 닫아준다
				socket.close();
			}
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
	}

}
