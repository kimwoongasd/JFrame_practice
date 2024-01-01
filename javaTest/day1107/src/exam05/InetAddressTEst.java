package exam05;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTEst {

	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getByName("www.naver.com");
			System.out.println(addr);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
