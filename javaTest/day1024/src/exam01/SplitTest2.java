package exam01;

public class SplitTest2 {

	public static void main(String[] args) {
		String data = "100 90 80 70 60 40 50 30 20 10";
		
		int total = 0, avg;
		
		String[] arr = data.split(" ");
		
		for (String x : arr) {
			total += Integer.parseInt(x);
		}
		
		avg = total / arr.length;
		
		System.out.println("총합 " + total);
		System.out.println("평균 " + avg);
			
	}

}
