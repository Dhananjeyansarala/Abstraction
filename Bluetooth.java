package Abstraction;

public abstract class Bluetooth implements Headset {
	public abstract void brand();
	public abstract void price();
	public abstract void colour();
	public void isWarranty(boolean isWarranty) {
		System.out.println(isWarranty);
	}
	public String name(String name) {
		return name;

}
}
