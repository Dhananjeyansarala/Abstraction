package Abstraction;

public class SmartPhone implements Phone{

	public void voiceCall() {
		System.out.println("available");
		
	}

	
	public void videoCall() {
		System.out.println("avilable");//dhanana
		
	}

	
	public void connectivity() {
		System.out.println("not available");
	}

	public void cameraFunction(String tapping) {
		switch(tapping) {
		case "singleTapping":
			System.out.println("Taking picture");break;
			
		case "doubleTapping":
			System.out.println("Zooming");break;
			
		case "continueTapping":
			System.out.println("continueshots");break;
			
		default :
			System.out.println("Invalid data");
			
		}
		
	}
	
	

}
