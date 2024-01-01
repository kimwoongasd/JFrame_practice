package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sist.vo.bookVo;

public class BookDao {
	public static final String oracle_db = "oracle.jdbc.driver.OracleDriver";
	public static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	public static final String userName = "c##som";
	public static final String passWord = "1234";
	
	public int deleteBook() {
		int re = -1;
		
		return re;
	}
	
	public int updateBook(bookVo vo) {
		int re = -1;
		String sql = "update Book set no = " + vo.getNo()
		+ ", bookname = '" + vo.getBookName() 
		+ "', price = " +  vo.getPrice() 
		+ ", publisher = '" + vo.getPublisher() + "'";
		try {
			Class.forName(oracle_db);
			
			Connection conn = DriverManager.getConnection(url, userName, passWord);
			
			Statement stmt = conn.createStatement();
			
			re = stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("수정 예외 발생 " + e.getMessage());
		}
		
		return re;
	}
	
	public ArrayList<bookVo> listBook() {
		ArrayList<bookVo> list = new ArrayList<bookVo>();
		String sql = "select * from Book";
		try {
			Class.forName(oracle_db);
			
			Connection conn = DriverManager.getConnection(url, userName, passWord);
			
			Statement stmt = conn.createStatement();
			
			ResultSet res = stmt.executeQuery(sql);
			
			while (res.next()) {
				int no = res.getInt(1);
				String name = res.getString(2);
				int price = res.getInt(3);
				String publisher = res.getString(4);
				
				bookVo v = new bookVo(no, name, price, publisher);
				list.add(v);
			}
			
		} catch (Exception e) {
			System.out.println("조회 예외 발생 " + e.getMessage());
		}
		
		return list;
	}
	
	public int insertBook(bookVo b) {
		int re = -1;
		String sql = "insert into Book values(" + b.getNo() + 
				", '" + b.getBookName() + 
				"', " + b.getPrice() + 
				", '"+ b.getPublisher() +"')";
		
		try {
			Class.forName(oracle_db);
			
			Connection conn = DriverManager.getConnection(url, userName, passWord);
			
			Statement stmt = conn.createStatement();
			
			re = stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("추가 예외 발생 " + e.getMessage());
		}
		
		return re;
	}
}
