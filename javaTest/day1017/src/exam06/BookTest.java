package exam06;
/*
this의 사용
- 메소드의 매개변수 이름과 속성이름과 겹치게 되면 구별을 할 필요가 있는데
이 때 클래스의 맴버 자신을 구별할 목적으로 this를 사용 
*/
class Book {
	private String title;
	private String author;
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	// 메소드의 매개변수 이름과 속성(맴버변수) 이름과 같으면
	// 메소드 안에서는 매개변수가 우선순위가 높아서 속성값이 초기화되지 않는다
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
}

public class BookTest {

	public static void main(String[] args) {
		Book b = new Book();
		
		b.setTitle("Great Java");
		b.setAuthor("bob");
		
		System.out.println(b.getTitle());
		System.out.println(b.getAuthor());

	}

}
