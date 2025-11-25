package ton;

public class AdharCard {
	public long aadharno;
	public String name;
	public int age;
	public String Geneder;
	public String address;
	private static AdharCard n = null;
	private AdharCard(long aadharno,String name,int age,String geneder,String address) {
		this.aadharno = aadharno;
		this.name= name;
		this.age = age;
		this.Geneder = geneder;
		this.address = address;
	}
	public void display() {
		System.out.println("Aadhar number: "+aadharno);
		System.out.println("Name: "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender: "+Geneder);
		System.out.println("Address: "+ address);
		
		
	}
	
	public static void Objectdisplay() {
		if(n == null) {
			 n = new AdharCard(791411332010L,"Kamani Venkata Karthik",22,"Male","Vidyanager 6th line,Mulaguntapadu,"
					+ "Singarayakonda,523101");
			n.display();
			System.out.println("Object is created:");
		}
		else {
			System.out.println("Object is already created with this number:");
		}
	}
	
}
