package com_stst_file;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("C:\\data");
		System.out.println("3초뒤에 파일이 삭제도빈다");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// 파일을 삭제하면 boolean를 반환한다
		boolean flage = file.delete();
		System.out.println("파일을 삭제하였습니다");
	}

}
