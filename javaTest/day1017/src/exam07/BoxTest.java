package exam07;

class Box {
	private double width;
	private double height;
	private double lenght;
	private double volume;
	
	public void setBox(double width, double height, double lenght) {
		this.width = width;
		this.lenght = lenght;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void serWidth(int width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double getLenght() {
		return lenght;
	}
	
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	
	public void calcVolume() {
		volume = width * height * lenght;
	}
	
	public double getVolume() {
		return volume;
	}
}

public class BoxTest {

	public static void main(String[] args) {
		Box b1 = new Box();
		b1.serWidth(10);
		b1.setHeight(5);
		b1.setLenght(25);
		
		b1.calcVolume();
		
		System.out.println("가로 : " + b1.getWidth());
		System.out.println("세로 : " + b1.getLenght());
		System.out.println("높이 : " + b1.getHeight());
		System.out.println("부피 : " + b1.getVolume());
		
		
	}

}
