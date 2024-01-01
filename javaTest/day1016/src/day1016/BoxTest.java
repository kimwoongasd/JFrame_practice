package day1016;

class Box {
	private int width;
	private int lenght;
	private int height;
	
	public int getWidth() {
		return width;
	}
	
	public int getLenght() {
		return lenght;
	}
	
	public int getHright() {
		return height;
	}
	
	public void setWidth(int w) {
		width = w;
	}
	
	public void setLenght(int l) {
		lenght = l;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public int getVolume() {
		return width * height * lenght;
	}
	
	public String toString(int x) {
		return String.valueOf(x);
	}
	
}

public class BoxTest {

	public static void main(String[] args) {
		Box box1;
		box1 = new Box();
		
		box1.setWidth(100);
		box1.setLenght(100);
		box1.setHeight(100);
		
		System.out.println(box1.getVolume());
		
		System.out.println(box1);
		
		Box box2 = new Box();
		
		box2.setWidth(200);
		box2.setLenght(200);
		box2.setHeight(200);
		
		
	}

}
