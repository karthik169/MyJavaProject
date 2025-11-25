package nsm_sv_calls;

public class Test {
	static int a;
	static int b;
	static int c;
	public  int add() {
		c = a + b;
		return c;
	}
	public static void main(String[] args) {
		 a = 10;
		 b = 20;
		Test t = new Test();
		System.out.println(t.add());
		
		
	}
}
