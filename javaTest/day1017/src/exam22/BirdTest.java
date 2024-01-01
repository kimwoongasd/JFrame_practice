package exam22;

public class BirdTest {

	public static void main(String[] args) {
		Bird b = new Bird("독수리", "갈색", true);
		
		System.out.println("이름 " + b.getName());
		System.out.println("색깔 " + b.getColor());
		System.out.println("비행 여부 : " + b.isFly());

		
	}

}
