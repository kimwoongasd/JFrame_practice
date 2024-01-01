package com_stst_file;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;


// 직렬화 하지않으면 오류
class Student implements Serializable {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private int avg;
	public Student(String name, int kor, int eng, int math, int tot, int avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = tot;
		this.avg = avg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	
}

public class StudentTestFIleWriteObjectOutputStream {

	public static void main(String[] args) {
		String name;
		int kor, eng, math, tot, avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 엽력하시오");
		name = sc.next();
		System.out.println("국어 점수 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수 : ");
		eng = sc.nextInt();
		System.out.println("수학 점수 : ");
		math = sc.nextInt();
		
		tot = kor + eng + math;
		avg = tot / 3;
		
		Student s = new Student(name, kor, eng, math, tot, avg);
		
		try {
			// 객체가 파일로 입출력하려면 순서가 있어야한다
			// 즉 직렬화해야한다
			ObjectOutputStream oos = 
					new ObjectOutputStream(new FileOutputStream("C:\\data\\student.dat"));
			oos.writeObject(s);

			oos.close();
			System.out.println("파일에 출력하였습니다");
		} catch (Exception e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
	}

}
