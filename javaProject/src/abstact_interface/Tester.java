package abstact_interface;

public class Tester {

	public static void main(String[] args) {
		
		float a = 10;
		
		
		//upcasting
		PaymentMode mode;
		
		mode = new UPIPayment();
		mode.a();
		
		mode.paymentProcess();
		
		mode = new CreditCard();
		
		mode.paymentProcess();

	}

}
