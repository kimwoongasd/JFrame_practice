package exam11;

public class UnderGraduate extends Student {
	private String club;

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public UnderGraduate(String name, String no, String major, int grade, double score, String club) {
		super(name, no, major, grade, score);
		this.club = club;
	}

	@Override
	public String toString() {
		return super.toString() + "동아리 = " + club;
	}
	
	
}
