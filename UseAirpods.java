package Abstraction;

public class UseAirpods {
	public static void main(String[] args) {
		Airpods a=new Airpods();
		a.brand();
		a.price();
		a.colour();
		a.isWarranty(true);
		System.out.println(a.name("xylo"));
	}

	
}
