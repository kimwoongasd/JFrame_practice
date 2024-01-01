package exam01;

import java.util.Scanner;

public class ReadLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String data;
		System.out.println("데이터를 입력");
		// nextLine : 공백 포함
		data = sc.nextLine();
		
		System.out.println(data);
	}

}
