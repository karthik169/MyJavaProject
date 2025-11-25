package methodOverLoading;

public class PaymentGateway {
	public void payment(String cod) {
		System.out.println("Payment is done in the time of Delivery");
		
	}
	public void payment(long debitCard,int otp,double amount) {
		if(otp == 1234)
		{
			System.out.println("Payment is done via DebitCard Successfully "+debitCard+" of "+amount);
		}
		else
		{
			System.out.println("Invalid Otp");
		}
	}
	public void payment(String upi, int amount) {
		System.out.println("Payment is done Successfully by "+ upi);
		
	}
	public static void main(String[] args) {
		PaymentGateway p = new PaymentGateway();
		p.payment("350rs");
		p.payment(1287612878, 1234, 500);
	//	p.payment(1234890234,1902,350);
		p.payment("Phonepay",350);
	}

}
