package exam16;

public class Megazine extends Book {
	private String date;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Megazine(String title, int page, String author, String date) {
		super(title, page, author);
		this.date = date;
	}

	public Megazine() {
		super();
	}
}
