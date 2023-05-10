package Abstraction;

public class Programmer extends Employees {
	public int calculatePerdaySalary(int salaryPerHour,int workingHour) {
		int mul=salaryPerHour*workingHour;
		return mul;
	}

}
