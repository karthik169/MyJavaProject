package bankprocess;
import java.util.*;
public class User_1 {
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

        Bank_1 c = new Bank_1(bank_name, ifsc_code, account_no, account_holder_name, balance);
        c.switchcase();
       

	}
	

}