package MC_Variable_DifferentClass;

public class Combination_2_2 {
	public int sub() {
		Combination_2 c1 = new Combination_2();
		c1.c = c1.a - c1.b;
		return c1.c;
	}
	public static void main(String[] args) {
		Combination_2_2 c2 = new Combination_2_2();
		System.out.println(c2.sub());
	}
}
