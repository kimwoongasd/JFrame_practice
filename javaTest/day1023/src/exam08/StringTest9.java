package exam08;

public class StringTest9 {
	public static void main(String[] args) {
		String data = "hi k hi j hi p";
		int i = data.indexOf("hi");
		System.out.println(i);
		
		// 뒤에서 부터 찾는다
		int j  = data.lastIndexOf("hi");
		System.out.println(j);

	}	
}
