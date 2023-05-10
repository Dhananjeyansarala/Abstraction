package Abstraction;

public class Sample {
	private static Sample obj = null;
	public static String name;
//	private Sample(String name) {
//		this.name=name;
//	}

	private Sample(String name) {
		this.name=name;
	}

	public static Sample getsingleton(String name) {
		if(obj==null) {
		obj=new Sample(name);
	}
		Sample.name=name; 
		return obj;
}

}
