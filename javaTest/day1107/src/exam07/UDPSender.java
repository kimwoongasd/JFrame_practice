package exam07;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


// java UDPSender 192.168.0.59 9001 안녕
public class UDPSender {

	public static void main(String[] args) {
		try {
			// 프로그램 실행시 전달되는 첫밴째 다이터를 ip 변수에 저장
			String ip = args[0];
			// 프로그램 실행시 전달되는 두번째 데이터를 정수로 변환하여 args에 약함
			int port = Integer.parseInt(args[1]);
			// 문자 변수열 저장
			String msg = args[2];
			
			// 1. DatagramSocket를 생성한다
			DatagramSocket socket = new DatagramSocket();
			
			// 2. 데이터를 보내기 위해 DatagramPacket 생성
			// 보내고자 하는 메세지를 담고 있는 문자열 msg를 byte의 배열로 만든다
			byte[] data = msg.getBytes();
			
			// 데이터를 보내기 위한 목적지주소 ip주소를 갖고 InetAddress ㄱ객체를 생성
			InetAddress addr = InetAddress.getByName(ip);
			
			// 목적지 주소 addr 보내고자 하는 데이터가 담긴 바이트 배열 data를
			//  DatagramPacket 객체 생성
			// sender는 데이터를 보내기 떄문데 
			// DatagramPacket(byte[] buf, int length, InetAddress address, int port) 생성자 사용
			DatagramPacket packet = new DatagramPacket(data, data.length, addr, port);
			
			// 3. send 메소드를 호출하여 데이터를 보낸다
			socket.send(packet);
			
			// 4. 소켓을 닫는다
			socket.close();
			
		} catch (Exception e) {
			System.out.println("예외 발생 " + e.getMessage());
		}
	}

}
