package exam04;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class TCPServerEcho {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9004);
			System.out.println("서버가 가동되었습니다");
			byte[] data = new byte[100];
			while(true) {
				Socket socket = server.accept();
				System.out.println("클라이언트가 연결하였습니다");
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				while(true) {
					is.read(data);
					
					//클라이언트로부터 수신된 데이터를 그대로 메아리한다
					os.write(data);
					String msg = (new String(data)).trim();
					System.out.print("수신된 데이터 : ");
					if(msg.equals("q!")) {
						break;
					}
					Arrays.fill(data, (byte)0);
				}
				
				is.close();
				socket.close();
				System.out.println("연결이 끊어졌습니다");
			}
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		
	}

}