package exam07;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

// 
public class UDPReceiver {

	public static void main(String[] args) {
		try {
			// 수신된 데이터를 받기 위한 DatagramPacket객체 생성시에
			// 필요한 바이트 배열을 생성
			// 실제 데이터는 여기에 담긴다
			byte[] data = new byte[200];
			
			// 1.DatagramSocket를 생성한다
			DatagramSocket socket = new DatagramSocket(9001);
			
			System.out.println("UDP 데이터그램소켓 생성");
			// 계속하여 데이터를 수신받기 위하여 반복문
			while (true) {
				// 2. 데이터를 받기 위한 DatagramPacket 생성
				// 데이터를 받을 것이기 떄문에 DatagramPacket(byte[] buf, int length) 사용
				DatagramPacket packet = new DatagramPacket(data, data.length);
				
				// 3. receive메소드를 호출하여 데이터를 받는다
				socket.receive(packet);
				
				// 4. 수시된 데이터를 화면에 출력
				String str = new String(data);
				System.out.println("수신된 데이터 : " + str.trim());
				
				// 다음 데이터를 받기위해 배열을 비운다
				Arrays.fill(data, (byte)0);
			}
			
		} catch (Exception e) {
			System.out.println("예외 발생 " + e.getMessage());
		}
	}

}
