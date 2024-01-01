package com_stst_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

// 학생의 정보를 화면에 출력

public class StudentTestObjectInputStream {

	public static void main(String[] args) {
		try {
			ObjectInputStream ois = 
					new ObjectInputStream(new FileInputStream("C:\\data\\student.dat"));
			
			Student s = (Student)ois.readObject();
			
			System.out.println("이름:" + s.getName());
			System.out.println("국어:" + s.getKor());
			System.out.println("양어:" + s.getEng());
			System.out.println("수학:" + s.getMath());
			System.out.println("총점:" + s.getTot());
			System.out.println("평균:" + s.getAvg());
			
			ois.close();
			
		} catch (Exception e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
	}

}
