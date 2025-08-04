package abstact_interface;

public interface PaymentMode {

	static long MAX_AMOUNT = 10000;
	static boolean isAuthenticated = false;
	
	default void a() {
		
	}
	
	static void b() {
		
	}
	
	private void c() {
		
	}
	
	public abstract void authenticate();
	void paymentProcess();
	
}

class UPIPayment implements PaymentMode{

	@Override
	public void authenticate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paymentProcess() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

class CreditCard implements PaymentMode{

	@Override
	public void authenticate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paymentProcess() {
		// TODO Auto-generated method stub
		
	}
	
}
