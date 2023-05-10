package Abstraction;

public class UseSportsCar {
	public static void main(String[] args) {
		SportsCar sc=new SportsCar();
		System.out.println(sc.brand("yamaha"));
		System.out.println(sc.isElectric(false));
		System.out.println(sc.price(50000));
		System.out.println(sc.netPrice(10000));
		System.out.println(sc.colour("blue"));
	}

}
