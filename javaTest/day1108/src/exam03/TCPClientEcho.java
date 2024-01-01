package exam03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class TCPClientEcho {

	public static void main(String[] args) {
		try {
			// 소켓을 생성하여 서버와 연결 요청
			Socket socket = new Socket("192.168.0.59", 9004);
			System.out.println("서버와 연결이 되었습니다");
			
			OutputStream os = socket.getOutputStream();
			
			// 읽어오기 위한 스트림
			InputStream is = socket.getInputStream();
			
			class ClientThread extends Thread {
				// 서버가 보낸 데이터를 저장
				byte[] arr = new byte[100];
				public void run() {
					// 서버가 보낸 데이터를 계속 받는다
					while (true) {
						try {
							is.read(arr);
							String msg = (new String(arr)).trim();
							System.out.println("서버로 부터 메아리된 데이터 : " + msg);
							
							// 데이터를 비운다
							Arrays.fill(arr, (byte)0);
							
							if (msg.equals("q!")) break;
							
						} catch (IOException e) {
						}
					}
				}
			}
			
			ClientThread ct = new ClientThread();
			ct.start();
		
			Scanner sc = new Scanner(System.in);
			String msg;
			
			while (true) {
				System.out.println("서버로 보낼 데이터 입력");
				msg = sc.next();
				os.write(msg.getBytes());
				if (msg.equals("q!")) {
					break;
				}
			}
			
			os.close();
			socket.close();
			System.out.println("서버와 연결이 끊어졌습니다");
			
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
	}

}
