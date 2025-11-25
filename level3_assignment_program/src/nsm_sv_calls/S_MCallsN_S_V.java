package nsm_sv_calls;
public class S_MCallsN_S_V {
	int a = 10;
	int b = 20;
	int c;
	public static int add() {
		S_MCallsN_S_V s= new S_MCallsN_S_V();
		s.c = s.a+s.b;
		return s.c;
	}
	public static void main(String[] args) {
		System.out.println(add());
	}
}
