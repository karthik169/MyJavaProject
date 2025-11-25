package encapsulation;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 5 digit Employee ID");
		int ID =sc.nextInt();
		int cc = sc.nextInt();
		String name = sc.next();
		Employee e = new Employee();
		e.setId(ID);
		System.out.println(e.getId());
		e.setCompanycode(cc);
		System.out.println(e.getCompanycode());
		e.setName(name);
		System.out.println(e.getName());
		
	}
}
