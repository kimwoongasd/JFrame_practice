package exam08;

public class StringTest3 {

	public static void main(String[] args) {
		String data = new String("길동");
		byte[] arr = data.getBytes();
		// String을 byte의 배열로 변환
		// 파일 입출력하거나 네트워크 토인으로 데이터를 전달할 떄에는
		// byte형으로 변환 후 전달
		
		String data2 = new String(arr);
		System.out.println(data2);
		
	}
}
