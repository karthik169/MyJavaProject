package casting;

public class Main {
	public static void main(String[] args) {
		Employee d = new Developer();
		Employee t = new Tester();
		Developer d1 = (Developer)d;
		Tester t1 = (Tester) t;
		System.out.println("Accessing upcasting properties for Developer");
		d.login();
		d.logout();
		System.out.println("Accessing downcasting properties for Developer");
		d1.login();
		d1.work();
		d1.logout();
		System.out.println("Accessing upcasting properties for Tester");
		t.login();
		t.logout();
		System.out.println("Accessing the downcasting variables for Tester");
		t1.login();
		t1.work();
		t1.logout();
		
	}

}
