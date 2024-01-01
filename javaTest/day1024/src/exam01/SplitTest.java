package exam01;

public class SplitTest {

	public static void main(String[] args) {
		// split : 정해준 문자을 없애고 배열을 리턴한다
		String data = "바나나, 초코, 딸기, 메론, 사과";
		String[] arr = data.split(",");
		System.out.println(arr.length);
		System.out.println(arr[0]); 
	}

}
