package Abstraction;

 public abstract class College implements EducationCommunity {
	public void findStaffName(String name) {
		System.out.println(name);
	}
	public String findIdNo(int no) {
		if(no%2!=0) {
			return "even number";
		}
		else {
			return "odd number";
		}
	}


}
