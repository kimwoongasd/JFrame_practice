package day1006;


public class Lab3_d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r = 1.0;	
		int i;
		
		for (r = 1.0; r <= 10.0; r++) {
			double prod = 1.0;
			for (i = 1 ; i <= 3 ; i++) {
				prod *= r;
			}
			System.out.printf("%.1f^3 = %.1f\n", r, prod);
		}
	}

}
