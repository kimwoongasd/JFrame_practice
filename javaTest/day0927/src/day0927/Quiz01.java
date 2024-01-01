package day0927;

import java.util.Scanner;

/*
 * 학생의 이름, 국어, 영어, 수학을 입력받아
총점과 평균을 구하여 출력하고 합격여부를 판벼하여 출력
(과목별 과락이 없고 총점이 60점 이상이면 합격)
(과락 : 40점 미만)
*/

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor, math, eng, total;
		String name, res;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오");
		name = sc.next();
		System.out.println("국어 점수를 입력하시오");
		kor = sc.nextInt();
		System.out.println("수학 점수를 입력하시오");
		math = sc.nextInt();
		System.out.println("영어 점수를 입력하시오");
		eng = sc.nextInt();
		
		total = kor + math + eng;
		avg = total / 3.0;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		if (kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			res = "합격";
		} else {
			res = "과락";
		}
		
		System.out.println("*** 성적처리 결과  ***");
		System.out.println("-----------------------");
		System.out.println("이름\t국어\t수학\t영어\t총점\t결과");
		System.out.println(name+"\t"+kor+"\t"+math+"\t"+eng+"\t"+total+"\t"+res);
		
	}

}
