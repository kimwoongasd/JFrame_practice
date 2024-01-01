package exam03;

public class BookTest {

	public static void main(String[] args) {
		Book[] arr = new Book[4];
		arr[0] = new Novel(123, "기생", "봉준호");
		arr[1] = new Poet(11, "노인", "노인");
		arr[2] = new ScienceFiction(1100, "지구", "초코");
		arr[3] = new Novel(123, "기생", "봉준호");
		
		for (Book b : arr) {
			System.out.println(b.getLateFees(2));
		}
		
		if (arr[0].equals(arr[2])) {
			System.out.println("같은 도서");
		} else {
			System.out.println("다른 도서");
		}
	
	if (arr[0].equals(arr[3])) {
			System.out.println("같은 도서");
		} else {
			System.out.println("다른 도서");
		}
	}
}
