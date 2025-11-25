package methodOverLoading;

public class StatementGenerator {
	public void statementGenerator(int no_of_days) {
		System.out.println("Statement Generated for "+no_of_days+" Days");
	}
	public void statementGenerator(String start_date , String end_date) {
		System.out.println("Statement Generated from "+start_date+" To "+end_date);
	}
	public void statementGenerator(String type) {
		System.out.println("Satement Generated on "+type+" Account");
	}
	public static void main(String[] args) {
		StatementGenerator s = new StatementGenerator();
		s.statementGenerator(30);
		s.statementGenerator("January","December");
		s.statementGenerator("MiniStatement");
	}
}
