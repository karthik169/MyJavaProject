package MC_Variable_DifferentClass;

public class Combination1_2 {
	public static int add() {
		Combination_1.c = Combination_1.a + Combination_1.b;
		return Combination_1.c;
		
	}
	public static void main(String[] args) {
		System.out.println(add());
	}
}
