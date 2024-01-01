package exam03;

public class ScienceFiction extends Book {
	public ScienceFiction(int number, String title, String author) {
		super(number, title, author);
	}

	@Override
	public int getLateFees(int day) {
		return day * 600;
	}
}
