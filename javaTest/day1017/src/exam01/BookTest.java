package exam01;

class Book {
	String title;
	String author;
	

}

public class BookTest {

	public static void main(String[] args) {
		Book b = new Book();
		
		b.title = "Great Java";
		b.author = "bob";
		
		System.out.println(b.title);
		System.out.println(b.author);

	}

}
