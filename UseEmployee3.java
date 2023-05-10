package Abstraction;

public class UseEmployee3 {
	public static void main(String[] args) {
		Employee3 e=new Employee3();
		System.out.println(e.name("suresh"));
		System.out.println(e.salary(5000));
		System.out.println(e.isMale(true));
		System.out.println(e.age(30));
		
	}

}