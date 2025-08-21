package recursion;

public class GenerateNumbers {

	public static void main(String[] args) {
		
		int n = 5;
		
		while(n>0) {
			System.out.print(n + " ");
			n--;
		}
		System.out.print(n);
		
		System.out.println();
//		display(5);
		
		System.out.println();
		System.out.println(sumOfNumbers(5));

	}
	
	public static void display(int n) {
		
		if(n==0)
			return;
		
		System.out.print(n + " ");
		
		display(n-1);
		
		System.out.print(n + " ");
	}
	
	public static int sumOfNumbers(int n) {
		
		if(n==0)
			return 0;
				
		return n + sumOfNumbers(n-1); 
					
	}
	
	public static double fact(int n) {
		if(n==0 || n==1)
			return 1;
				
		return n * fact(n-1); 
					
	}
	
	

}
