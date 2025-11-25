package MC_Variable_DifferentClass;

public class Combination_3 {
	public static int mul() {
		Combination_2 c3 = new Combination_2();
		c3.c = c3.a*c3.b;
		return c3.c;
	}
	public static void main(String[] args) {
		System.out.println(mul());
	}
}
