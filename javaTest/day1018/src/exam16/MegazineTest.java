package exam16;

public class MegazineTest {

	public static void main(String[] args) {
		Megazine m = new Megazine("역행자", 970, "자청", "2023-05-29");
		
		System.out.println("제목 : " + m.getTitle());
		System.out.println("페이지 수 : " + m.getPage());
		System.out.println("저자 : " + m.getAuthor());
		System.out.println("발매일 : " + m.getDate());
	
		System.out.println("--------------------------");
		Megazine m2 = new Megazine();
		m2.setTitle("일론 머스크");
		m2.setPage(1900);
		m2.setAuthor("윌터 아이작슨");
		m2.setDate("2023-09-13");
		System.out.println("제목 : " + m2.getTitle());
		System.out.println("페이지 수 : " + m2.getPage());
		System.out.println("저자 : " + m2.getAuthor());
		System.out.println("발매일 : " + m2.getDate());
	}

}
