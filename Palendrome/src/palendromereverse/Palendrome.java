package palendromereverse;

public class Palendrome {
	
	public static int reverse(int n) {
		int rev = 0; 
		while (n != 0) {
			int rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}
		return rev;
		
	}
	public static int add(int n) {
		int add = n + reverse(n);
		return add;
	}
	public static boolean isPalindrome(int n)
	{
		
		if (n == add(n)){
			return true;
		}
		else {
			n = reverse(n);
			reverse(n);
			if (n ==reverse(n)) {
				return true;
			}
			else {
				return false;
			}
			
		}
	}
	public static void main(String[] args) {
		System.out.println(add(123));
	}

}
