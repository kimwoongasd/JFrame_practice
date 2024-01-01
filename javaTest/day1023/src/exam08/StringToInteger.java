package exam08;

public class StringToInteger {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "200";
		
		System.out.println(data1 + data2);
		
		// 문자열을 정수로 변환
		System.out.println(Integer.parseInt(data1) + 
				Integer.parseInt(data2));
		
		// 문자열을 정수로, 문자열을 실수로 변환
//		System.out.println(Integer.parseInt(data1) + 
//				Double.parseDouble(data2));
		
//		int n = Integer.valueOf(data1);
	}

}
