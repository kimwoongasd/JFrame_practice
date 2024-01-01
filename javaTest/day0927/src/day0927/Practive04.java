package day0927;

import java.util.Scanner;

/*
학생의 이름, 국어, 영어, 수학을 입력받아
총점, 평균을 계산하여 출력하고 합격 여부를 출력한다(평균 60점 이상)
*/

public class Practive04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, res;
		int kor, math, eng, total;
		double avg;
		
		System.out.println("학생 이름을 입력하시오");
		name = sc.next();
		System.out.println("국어 점수를 입력하시오");
		kor = sc.nextInt();
		System.out.println("수학 점수를 입력하시오");
		math = sc.nextInt();
		System.out.println("영어 점수를 입력하시오");
		eng = sc.nextInt();
		
		total = math + kor + eng;
		avg = total / 3;
		System.out.println("총점 : " + total);
		System.out.println("평군 : " + avg);
		
		if (avg >= 60) {
			res = "합격";
		} else {
			res = "불합격";
		}
		
		System.out.println("*** 성적처리 결과  ***");
		System.out.println("-----------------------");
		System.out.println("이름\t국어\t수학\t영어\t총점\t결과");
		System.out.println(name+"\t"+kor+"\t"+math+"\t"+eng+"\t"+total+"\t"+res);
		
	}

}
