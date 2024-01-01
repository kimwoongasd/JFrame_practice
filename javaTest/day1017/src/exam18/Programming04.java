package exam18;

public class Programming04 {

	public static void main(String[] args) {
		Movie m = new Movie();
		
		m.setTitle("자바");
		m.setDirector("아브라카타브라");
		m.setProducer("쌍용");
		
		System.out.println("제목 : " + m.getTitle());
		System.out.println("감독 : " + m.getDirector());
		System.out.println("제젝사 : " + m.getProducer());
		System.out.println("---------------------------");
		Movie m2 = new Movie("기생충", "봉준호", "CJ");
		
		System.out.println("제목 : " + m2.getTitle());
		System.out.println("감독 : " + m2.getDirector());
		System.out.println("제젝사 : " + m2.getProducer());
		
	}

}
