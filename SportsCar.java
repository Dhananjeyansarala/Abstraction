package Abstraction;

public class SportsCar implements Car {
	
	public String brand(String brand) {
		return brand;
	}
	public boolean isElectric(boolean isElectric) {//if(isElectric==true) {
		//return "yes;}else {
		//return "no";by String
		
		return isElectric;
	}
	public int price(int price) {
		return price;
	}
	public int netPrice(int price) {
		int netPrice=price+price*5/100;
		return netPrice;
	}
	public String colour(String colour) {
		return colour;
		
	}

}
