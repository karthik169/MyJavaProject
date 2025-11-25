package nsm_sv_calls;

public class Test_1 {
	String emotion;
	String name;
	String reply;

	public void concat() {
		
		System.out.println(emotion + " " +name);
	}

	public String praposal() {
		concat();
		System.out.println(reply);
		String result;
		if ("Love You Too".equals(reply)) {  // fixed: use equals safely
			result = "Accepted";
		} else {
			result = "rejected";
		}
		return result;
	}

	public static void main(String[] args) {
		Test_1 t2 = new Test_1();
		t2.emotion = "I love you";
		t2.name = "Karthik";
		t2.reply = "Love You Too";
		System.out.println(t2.praposal());
		
	}
}
