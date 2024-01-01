package exam02;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class TCPServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9004);
			byte[] data = new byte[100];
			System.out.println("서버가 가동되었습니다");
			
			// 클라이언트 접속 대기를 위한 반복문
			while (true) {
				Socket socket = server.accept();
				System.out.println("서버가 연결되었습니다");
				InputStream is = socket.getInputStream();
				
				// 데이터를 무한으로 받기 위한 반복
				while (true) {
					is.read(data);
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
				
			}
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
	}

}
