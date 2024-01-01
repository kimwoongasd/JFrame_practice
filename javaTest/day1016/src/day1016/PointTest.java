package day1016;

class Point{
	private int x; // Point라는 새로운 클래스의 속성으로 x를 정의
	private int y; // Point라는 새로운 클래스의 속성으로 y를 정의
	
	public int getX() {
		return x;
	}
	
	//  Point 클래스의 y의 값을 읽어오기 위한 기능 정의
	public int getY() {
		return y;
	}
	
	public void setX(int xCoord) {
		x = xCoord;
	}
	
	// Point클래스의 y의 값을 변경하기 위한 기능을 정의
	// 매겨변수를 전달받아 매개변수로 변경
	public void setY(int yCoord) {
		y = yCoord;
	}
}

public class PointTest {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(100);
		p1.setY(200);
		
		System.out.printf("x좌표 : %d y좌표 : %d\n", p1.getX(), p1.getY());
		
		Point p2 = new Point();
		p2.setX(100);
		p2.setY(300);
		System.out.printf("x좌표 : %d y좌표 : %d\n", p2.getX(), p2.getY());
	
	}

}
