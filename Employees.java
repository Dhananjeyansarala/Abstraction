package Abstraction;

public abstract class Employees {
	String name;
	int id;
	int salaryPerHour;
	int workingHour;
	public String getWork(String name) {
	return name;
	}
	public abstract int calculatePerdaySalary(int salary,int workingHour);
	
}
