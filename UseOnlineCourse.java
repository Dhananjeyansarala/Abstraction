package Abstraction;

public class UseOnlineCourse {
	public static void main(String[] args) {
		OnlineCourse oc=new OnlineCourse();
		System.out.println(oc.courseLink("java"));
		System.out.println(oc.courseTrainerName("Nisha"));
		System.out.println(oc.courseFees("phyton"));
		System.out.println(oc.courseHour(8));
	}

}
