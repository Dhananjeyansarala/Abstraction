package Abstraction;

public class UseSample {
	public static void main(String[] args) {
		Sample s1=Sample.getsingleton("hi");
		Sample s2=Sample.getsingleton("hello");
		Sample s3=Sample.getsingleton("java");
		System.out.println(s1.hashCode()+" "+s1.name);
		System.out.println(s2.hashCode()+" "+s2.name);
		System.out.println(s3.hashCode()+" "+s3.name);
		
	}

}
