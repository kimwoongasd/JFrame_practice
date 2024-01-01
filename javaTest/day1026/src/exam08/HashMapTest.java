package exam08;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
 * map은 key의 중복 허용 x
 * 중복된 key의 값을 추가하면 값을 갱신하고 이전의 값을 리턴
 * 
 * */

public class HashMapTest {

	public static void main(String[] args) {
		// map
		// key와 value의 어떤 자료형인지 각각 설정해야한다
		// key의 중복 허용 x
		
		// 순서 보장 X 
		
//		HashMap<String, String> info = new HashMap<String, String>();
		
		// 순서 보장
//		LinkedHashMap<String, String> info = new LinkedHashMap<String, String>();
		
		// key를 기준으로 정렬
		TreeMap<String, String> info = new TreeMap<String, String>();
		
		
		// 데이터 입력
		String v = info.put("name", "유재석");
		
		// map에 put를하게되면 이전 키에대한 value가 리턴된다
		// 이 전에 아무것도 없으면 null 리턴
		System.out.println(v);
		v = info.put("addr", "서울");
		System.out.println(v);
		v = info.put("phone", "111-111-111");
		System.out.println(v);
		
		v = info.put("name", "강호동");
		System.out.println(v);
		
		// 데이터 얻기
		System.out.println(info.get("phone"));
		
		System.out.println(info);
	}

}
