package com.sist.vo;

public class bookVo {
	int no;
	String bookName;
	int price;
	String publisher;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public bookVo(int no, String bookName, int price, String publisher) {
		super();
		this.no = no;
		this.bookName = bookName;
		this.price = price;
		this.publisher = publisher;
	}
	
	

}
