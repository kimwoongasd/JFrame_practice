package exam04;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class TCPClientEcho {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("192.168.10.30", 9004);
			System.out.println("서버와 연결이 되었습니다");
			OutputStream os = socket.getOutputStream();
			InputStream is = socket.getInputStream();
			
//			class ClientThread extends Thread{
//				byte[] arr = new byte[100];
//				
//				public void run() {
//					while(true) {
//						try {
//							is.read(arr);
//							String msg = new String(arr);
//							msg = msg.trim();
//							System.out.print("서버로부터 메아리된 데이터 : " + msg);
//							if(msg.equals("q!")) {
//								break;
//							}
//							Arrays.fill(arr, (byte)0);
//							
//						} catch (Exception e) {
//							
//						}
//						
//					}
//				}
//			}
//			ClientThread ct = new ClientThread();
//			ct.start();
			
			Scanner sc = new Scanner(System.in);
			String msg;
			while(true) {
				System.out.print("서버로 보낼 데이터 입력 : ");
				msg = sc.next();
				os.write(msg.getBytes());
				if(msg.equals("q!")) {
					break;
				}
				
			}
			
			os.close();
			socket.close();
			
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}

	}

}
