package chain;

public class Test {
	public Test() {
		this(5);
		System.out.println("1");
	}
	public Test(int a) {
		this(10,20);
		System.out.println(a);
	}
	public Test(int a , int b)
	{
		this(true);
		System.out.println(a+b);
	}
	public Test(boolean b) {
		System.out.println(b);
	}
	public static void main(String[] args) {
		Test t = new Test();
	}

}
