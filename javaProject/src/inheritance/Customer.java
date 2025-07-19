package inheritance;

public class Customer {	
	
	private long aadharNo;	
	String name;
	long mobile;
	String email;
	
	static {
		System.out.println("Customer Static");
	}
	
	
	public Customer(String name, long mobile, String email) {
		super();
		
		System.out.println("Registered as Customer");
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}	
	
	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobile=" + mobile + ", email=" + email + "]";
	}	
}

class PremiumCustomer extends Customer {
	
	float discountPer;
	
	static {
		System.out.println("Premium Customer Static");
	}

	public PremiumCustomer(String name, long mobile, String email) {
		super(name, mobile, email);		
		System.out.println("Promoted to Premium");
		this.discountPer = 10;
	}
	
	
	
}

