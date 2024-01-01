package day0927;

// 삼항연산자
// (조건식) ? (true 값) : (false값)
public class ConditionalExpressionOperator {
	public static void main(String[] agrs) {
		int n = 7;
		String res = (n % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println(res);
		// System.out.println((n % 2 == 0) ? "짝수" : "홀수");
	}
}
