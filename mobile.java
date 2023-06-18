package week1.day1;

public class mobile {


	public static void main(String[] args) {
		
		mobile obj = new mobile();		
		obj.sendsms();
		obj.allowVoiceCall();	
		obj.takevideo();

	}
	
	public void sendsms() {
		System.out.println("Hi");
	}

	protected void allowVoiceCall() {
		System.out.println("This is protected");
	}

	private void takevideo() {
		System.out.println("This is private");
	}

}
