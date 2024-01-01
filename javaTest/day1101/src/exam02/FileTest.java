package exam02;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일을 가져오는 방법
		File a = new File("C:\\data\\a.txt");
		File b = new File("C:\\data", "a.txt");
		
		// 디렉토리도 파일로 처리된다
		File d = new File("C:\\data");
		
		// 파일 이름 가져오기
		System.out.println(a.getName());
		// 파일 경로 가져오기
		System.out.println(a.getParent());
		
//		isFile() : 파일인지 
//		isDirectory() : 디렉토리인지
//		length() : 파일의 길이
//		list() : 디렉토리안 파일 리스트
	}

}
