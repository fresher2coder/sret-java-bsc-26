package demo;

abstract public class RBI {
	
	void govtAccount(){
		System.out.println("govt acc");
	}
	
	abstract void savingsAcc();
	
	
}

class SBI extends RBI{

	@Override
	void savingsAcc() {
		// TODO Auto-generated method stub
		
	}
	
	
}


//Parent -> design
//Child -> design implementation