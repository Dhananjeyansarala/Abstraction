package Abstraction;

public class OnlineCourse implements Course {
	
	public String courseLink(String url) {
		return url;
	}
	public String courseTrainerName(String name) {
		return name;
	}
	public String courseFees(String courseName) {
		if(courseName.equals("java")) {
			return " courseName is java Fees is 20k";
		}
		else if(courseName.equals("phyton")) {
			return "Name is phyton Fees is 15k";
		}
		else if(courseName.equals("sql")) {
			return "Name is SQL Fees is 18k";
		}
		else {
			return "course is not available";
			
			
		}
	}
	public int courseHour(int hours) {
		return hours;
	}
	
	

}
