package chain;

public class Ticket {
	int number;
	int cost;
	String bp;
	String dp;
	String distance;
	long pnr_no;
	public Ticket(int number) {
		
		this.number = number;
		System.out.println("Ticket Number: "+number);
	}
	public Ticket(String bp , String dp) {
		this(975673);
		this.bp = bp;
		this.dp = dp;


		System.out.println("Destination Point: "+dp);
	}
	public Ticket(int cost,String distance) {
		this("Secundarabad","Singarayakonda");
		this.cost = cost;
		this.distance = distance;
		System.out.println("The Distance from "+bp+" To "+dp+ "is: "+distance);
		System.out.println("The Ticket Price is: "+cost+".00");
	}
	public Ticket(long pnr_no) {
		this(420,"340KM");
		this.pnr_no = pnr_no;
		System.out.println("PNR number: "+pnr_no);
	}
	public static void main(String[] args) {
		Ticket t = new Ticket(4848074311L);
		
	}

}
