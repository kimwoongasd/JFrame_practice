package exam01;

public class TrimTest {

	public static void main(String[] args) {
		String data = "     java    ";

		System.out.println("|" + data + "|");
		System.out.println(data.length());
		System.out.println("|" + data.trim() + "|");
		System.out.println(data.trim().length());
	}

}
