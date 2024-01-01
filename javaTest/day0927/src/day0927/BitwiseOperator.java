package day0927;

// 비트연산자
/*
& : 모두 1이면 1
| : 둘 중 하나라도 1이면 1
^ : 둘 모두 달라야 1
0	1	&	|	^
---------------------
0	0	0	0	0
0	1	0	1	1
1	0	0	1	1
1	1	1	1	0
------------------------ 
*/
public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8, b =5;
		int i = a & b;
		int j = a | b;
		int k = a ^ b;
		

		
		System.out.println("i : " + i);
		System.out.println("j : " + j);
		System.out.println("k : " + k);
		
		
		
		
	}

}
