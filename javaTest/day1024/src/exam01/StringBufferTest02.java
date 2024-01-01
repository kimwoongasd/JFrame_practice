package exam01;

public class StringBufferTest02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("친구를 사랑했네");
		System.out.println(sb);
		
		// insert : 원하는 인덱스에 추가
		sb.insert(0, "친구의");
		System.out.println(sb);
	}

}
