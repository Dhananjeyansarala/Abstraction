package Abstraction;

public abstract class Bank {
	public abstract long accNum(long num);
	public abstract int pinNum(int pin);
	public String name(String name) {
		return name;
	}
	public boolean isActive(boolean isActive) {
		return isActive;
	}
	

}
