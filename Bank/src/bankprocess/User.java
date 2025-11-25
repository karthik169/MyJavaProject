package bankprocess;
import java.util.*;
public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bank Name:");
        String bank_name = sc.next();

        System.out.println("Enter IFSC Code:");
        String ifsc_code = sc.next();
        sc.nextLine();

        System.out.println("Enter Account Number:");
        long account_no = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter Account Holder Name:");
        String account_holder_name = sc.next();

        System.out.println("Enter Initial Balance:");
        double balance = sc.nextDouble();

        Bank c = new Bank(bank_name, ifsc_code, account_no, account_holder_name, balance);

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
			break;
		case 2:
			c.displayBankDetails();
			break;
		case 3:
			System.out.println("Enter the Amount to Deposite");
			int amount = sc.nextInt();
			c.deposite(amount);
			break;
		case 4:
			System.out.println("Enter the Amount to Withdrawn");
			int amount1 = sc.nextInt();
			c.withdraw(amount1);
			break;
		case 5:
			c.balance();
			break;
		case 6:
			System.exit(1);
		default:
			System.out.println("Invalid oprion");
		}
		
	}
	

}