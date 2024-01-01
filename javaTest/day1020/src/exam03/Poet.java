package exam03;

public class Poet extends Book {
	public Poet(int number, String title, String author) {
		super(number, title, author);
	}

	@Override
	public int getLateFees(int day) {
		return day * 200;
	}
	
}
