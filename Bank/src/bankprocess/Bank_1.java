package bankprocess;
import java.util.*;

public class Bank_1 {
	public String bank_name;
	public String ifsc_code;
	public long account_no;
	public String account_holder_name;
	public double balance;
	public Bank_1(String bank_name,String ifsc_code,long account_no,String account_holder_name,double balance) {
		this.bank_name=bank_name;
		this.ifsc_code=ifsc_code;
		this.account_no = account_no;
		this.account_holder_name = account_holder_name;
		this.balance = balance;
	}
	public void displayBankDetails() {
		System.out.println("bank name = "+bank_name);
		System.out.println("ifsc code = "+ifsc_code);
		System.out.println("account number = "+account_no);
		System.out.println("account_holder_name = "+account_holder_name);
		System.out.println("balance = "+balance);
	}
	public void deposite(int amount) {
		
		if (amount > 0) {
			balance += amount;
			System.out.println("Successfully Deposite");
			
		}
		else {
			System.out.println( "Invalid Amount");
		}
		
	}
	public void withdraw(int amount) {
	    if (amount > 0 && amount <= balance) {
	        balance -= amount;
	        System.out.println("Take Money");
	        System.out.println("Current Balance: " + balance);
	    } else {
	        System.out.println("Invalid Amount");
	    }
	}

	public double balance() {
		return balance;
	}
	public void switchcase() {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("\nChoose an option:");
	        System.out.println("1. Create New Account");
	        System.out.println("2. Display Bank Details");
	        System.out.println("3. Deposit Money");
	        System.out.println("4. Withdraw Money");
	        System.out.println("5. Check Balance");
	        System.out.println("6. Exit");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			Bank b1 = new Bank(bank_name,ifsc_code,account_no,account_holder_name,balance);
			b1.displayBankDetails();
			switchcase();
			break;
			
		case 2:
			displayBankDetails();
			switchcase();
			break;
		case 3:
			System.out.println("Enter the Amount to Deposite");
			int amount = sc.nextInt();
			deposite(amount);
			switchcase();
			break;
		case 4:
			System.out.println("Enter the Amount to Withdrawn");
			int amount1 = sc.nextInt();
			withdraw(amount1);
			switchcase();
			break;
		case 5:
			balance();
			switchcase();
			break;
		case 6:
			System.exit(1);
			switchcase();
		default:
			System.out.println("Invalid oprion");
			switchcase();
		}
	}
	
}
