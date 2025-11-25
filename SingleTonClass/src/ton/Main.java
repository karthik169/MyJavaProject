
package ton;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		boolean start = true;
		while(start) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose below options");
			System.out.println("Enter 1 for aadhar card Generation:");
			System.out.println("Enter 2 for VoterID card Generation:");
			System.out.println("Enter 3 for Exit:");
			int  a = sc.nextInt();
			switch(a) {
			case 1 :
				AdharCard.Objectdisplay();
				break;
				
			case 2:
				Voter.Voterdisplay();
				break;
			case 3:
				start = false;
				System.out.println("Successfully Exited:");
				break;
			default:System.out.println();
				
			}
		}
		
	}
}
