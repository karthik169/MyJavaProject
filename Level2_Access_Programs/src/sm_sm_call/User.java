package sm_sm_call;

public class User {
	public static void openApp() {
		System.out.println("opening Instagram...");
		Instagram.explore();
	}
	public static void closeApp()
	{
		openApp();
		System.out.println("closing Instagram...");
	}
	public static void main(String[] args) {
		closeApp();
		System.out.println("end main....");
	}
	

}
