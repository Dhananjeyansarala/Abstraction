package Abstraction;

public class UseMedicalCollege {
	public static void main(String[] args) {
		MedicalCollege m=new MedicalCollege();
		m.findStaffName("viji");
		System.out.println(m.findIdNo(5));
		m.collegeName("apec");
	}

}
