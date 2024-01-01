package exam03;

public class Novel extends Book {
	@Override
	public int getLateFees(int day) {
		return day * 300;
	}

	public Novel(int number, String title, String author) {
		super(number, title, author);
	}
}
