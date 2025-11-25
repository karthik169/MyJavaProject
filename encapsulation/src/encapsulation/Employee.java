package encapsulation;
import java.util.*;
public class Employee {
	
	private int id;
	private int companyCode ;
	private String name;
	private String Role;
	private double sal;
	private String loc;
	public Employee() {
		
	}
	
	public Employee(int id, int companyCode, String name, String role, double sal, String loc) {
		setId(id);
		setName(name);
		setCompanycode(companyCode);
		
	}

	//Setting and Getting methods for id variable
	public void setId(int id) {
		if(validateId(id)) {
			this.id = id;
		}
		else {
			System.out.println("Enetr correct number");
		}
		
	}
	public int getId() {
		return id;
	}
	//Setting and Getting methods for companyCode variable
	public void setCompanycode(int companyCode) {
		if(validateCompanyCode(companyCode)) {
			this.companyCode = companyCode;
		}
		else {
			System.out.println("Enter correct Name");
		}
		
		
	}
	public int getCompanycode(){
		return companyCode;
	}
	//Setting and Getting methods for name variable
	public void setName(String name) {
		if(validateName(name)) {
			this.name = name;
		}
		else {
			System.out.println("Enter Valid Name");
		}
	}
	public String getName() {
		return name;
	}
	public boolean validateId(int id) {
		String str = id+"";
		if (str.length() == 5) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean validateCompanyCode(int companyCode) {
		String str = companyCode + "";
		if (str.length()==3 && companyCode % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean validateName(String name) {
		char ch = name.charAt(0);
		if (ch >= 'A' && ch <='Z') {
			return true;
		}
		else
		{
			return false;
		}
	}
	public void displayDetails() {
		
	}
	
	
}

