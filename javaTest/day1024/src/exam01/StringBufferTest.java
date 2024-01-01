package exam01;

public class StringBufferTest {

	public static void main(String[] args) {
		String data = "오늘";
		data += "점신은 ";
		data += "고기를 ";
		data += "먹는다";
		
		System.out.println(data);
		
		StringBuffer sb = new StringBuffer("내일");
		sb.append("저녁은");
		sb.append("고기를");
		sb.append("먹는디");
		
		System.out.println(sb);
		
	}

}
