package exam03;

public class ProcessScore {
	public ProcessScore(int[] arr) {
		
		try {
			int total = 0, avg;

			for (int v : arr) {
				if (v < 0) {			
						throw new IllegalScore("점수는 음수가 될 수 없다");
					}
				total += v;
				}
			
			avg = total / arr.length;
			System.out.println("평균 : " + avg);
			
		} catch (Exception e) {
			System.out.println("에외 발생 : " + e.getMessage());
		}
	}
}
