package exam03;

public abstract class Book {
	protected int number;
	protected String title;
	protected String author;

	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Book(int number, String title, String author) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
	}

	public abstract int getLateFees(int day);

	public boolean equals(Book b) {
		if (this.number == b.number) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
