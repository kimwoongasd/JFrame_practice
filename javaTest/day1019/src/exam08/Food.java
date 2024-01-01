package exam08;

import java.util.Objects;

import exam08.Food;

public class Food {
	protected double cal;
	protected int price;
	protected double weight;
	
	public double getCal() {
		return cal;
	}
	public void setCal(double kal) {
		this.cal = cal;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Food(double cal, int price, double weight) {
		super();
		this.cal = cal;
		this.price = price;
		this.weight = weight;
	}
	public Food() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Food [cal=" + cal + ", price=" + price + ", weight=" + weight + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cal, price, weight);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		Food other = (Food) obj;
		return Double.doubleToLongBits(cal) == Double.doubleToLongBits(other.cal) &&
			price == other.price && 
			Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
	
	
}
