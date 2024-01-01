package exam18;

public class Movie {
	private String title;
	private String director;
	private String producer;

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getProducer() {
		return producer;
	}
	
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	public Movie(String title, String director, String producer) {
		super();
		this.title = title;
		this.director = director;
		this.producer = producer;
	}
	
	public Movie() {
		super();
	}
}
