package exam06;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

class ServerThread extends Thread {
	InputStream is;
	OutputStream os;
	Socket socket;
	
	public ServerThread(Socket socket) {
		this.socket = socket;
		
		try {
			is = socket.getInputStream(); // 데이터를 받기 위한 스트림
			os = socket.getOutputStream(); // 출력을 위한 스트림
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
	}
	
	public void run() {
		byte[] data = new byte[100];
		try {
			while (true) {
				is.read(data);
				
				// 메아리
				// 클라리언트로 부터 수신된 데이터를 그대로 보낸다
				// 연결되어있는 클라이언트에게 그대로 내보낸다
				os.write(data);
				
				String msg = (new String(data)).trim();
				System.out.println("수신된 데이터 : " + msg);
				
				if (msg.equals("q!")) {
					break;
				}
				
				Arrays.fill(data, (byte)0);
			}
			
			is.close();
			socket.close();
			System.out.println("클라이언트와 연결이 끊어졌씁니다");
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
	}
}

public class TCPServerEchoMultiCast {

	public static void main(String[] args) {
		try {
			// 서버 소켓을 생성한다
			ServerSocket server = new ServerSocket(9005);
			// 데이터를 저장할 공간
			byte[] data = new byte[100];
			System.out.println("서버가 가동되었습니다");
			
			// 클라이언트 접속 대기를 위한 반복문
			while (true) {
				// 클라이언트와 접속을 수락
				Socket socket = server.accept();
				System.out.println("클라이언트가 연결되었습니다");
				
				ServerThread st = new ServerThread(socket);
				st.start();
			}
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
	}

}
