package polymorphism;

public class Main {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.work();
		e.fight();
		e.teach();
		e = new Developer();
		e.work();
		e.fight();
		e.teach();
		e = new Tester();
		e.work();
		e.fight();
		e.teach();
	}
}
