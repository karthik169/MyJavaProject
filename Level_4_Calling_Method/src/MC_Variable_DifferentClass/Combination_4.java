package MC_Variable_DifferentClass;

public class Combination_4 {
	public int div() {
		Combination_1.c = Combination_1.a % Combination_1.b;
		return Combination_1.c;
	}
	public static void main(String[] args) {
		Combination_4 c1 = new Combination_4();
		System.out.println(c1.div());
	}
}
