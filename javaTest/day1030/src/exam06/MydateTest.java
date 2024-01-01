package exam06;

public class MydateTest {

	public static void main(String[] args) {
		try {
			Mydate m = new Mydate("2023/10/30");
		} catch (Exception e) {
			System.out.println("오류 : " + e.getMessage());
		}
		
		
		try {
			Mydate m2 = new Mydate(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
