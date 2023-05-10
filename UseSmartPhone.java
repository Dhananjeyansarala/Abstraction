package Abstraction;

public class UseSmartPhone {
	public static void main(String[] args) {
		SmartPhone sp=new SmartPhone();
		sp.voiceCall();
		sp.videoCall();
		sp.connectivity();
		sp.cameraFunction("singleTapping");
	}

}
