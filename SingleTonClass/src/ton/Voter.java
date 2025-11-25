package ton;

public class Voter {
	public int voterId ;
	public String name;
	public int age;
	private static Voter a = null;
	private Voter(String name, int age,int voterId) {
		this.voterId = voterId;
		this.name = name;
		this.age = age;
		
	}
	public void voterDisplay() {
		System.out.println("Voter Number: "+name);
		System.out.println("Name: "+ voterId);
		System.out.println("age: "+ age);
	}
	public static void Voterdisplay() {
		if(a == null) {
			 a = new Voter("Kamani Venkata Karthik",22,79141010);
			 a.voterDisplay();
			System.out.println("Object is created:");
		}
		else {
			System.out.println("Object is already created with this number:");
		}
	}
	
}
