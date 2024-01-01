package exam03;

import java.util.ArrayList;

public class Goods {
	String number;
	String name;
	int qty;
	int price;

	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Goods(String number, String name, int qty, int price) {
		super();
		this.number = number;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	
	
}
