package Chat;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
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
	
	// 서버와 연결된 클라이언트에게 매새지를 보내는 메소드
	public void send(byte[] arr) throws Exception {
		os.write(arr);
	}
	
	// 연결된 모든 클라이언트에게 메세지를 보내는 메소드
	public void sendAll(byte[] arr) throws Exception {
		for (ServerThread st : TCPServerChat.list) {
			st.send(arr);
		}
	}
	
	public void run() {
		byte[] data = new byte[100];
		try {
			while (true) {
				is.read(data);
				
				// 수신된 데이터를 방송하기 위해서 sendAll 호출
				// 방송이란 연결되어진 모든 클라이언트에게 메세지 보내는 것
				sendAll(data);
				
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

public class TCPServerChat {
	// 클라이언트가 접속을 요청하면 그 클라이언트를 상대할 ServerThread 객체를
	// 생성하여 list에 담는다
	public static ArrayList<ServerThread> list;
	public static void main(String[] args) {
		try {
			list = new ArrayList<ServerThread>();
			// 서버 소켓을 생성한다
			ServerSocket server = new ServerSocket(9007);
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
				
				// 접속을 요청한 클라이언트를 상대할 ServerThread 객체를 list에 담는다
				list.add(st);
			}
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
	}

}
