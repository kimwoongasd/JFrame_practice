package exam13;

public class Graduate extends Student {
	private double rate;
	private String assistant;
	
	// 논문 심사 기능 추가
	public void paperReview() {
		System.out.println(name + "의 논문심사를 합니다");
	}
	
	public double getRate() {
		return rate;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public String getAssistant() {
		return assistant;
	}
	
	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}
	
	public Graduate(String name, String no, String major, int grade, double score, double rate, String assistant) {
		super(name, no, major, grade, score);
		this.rate = rate;
		this.assistant = assistant;
	}

	@Override
	public String toString() {
		return super.toString() + " 조교 유형 = " + assistant + ", 장학금 비율 = " + rate;
	}
	
	
}
