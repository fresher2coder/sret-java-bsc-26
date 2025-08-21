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
		
		n = 1234;
		
		int count = 0;
		
		while(n>0) {			
			
			n = n/10;
			count++;
		}
		System.out.println("In while: " + count);
		n = 1234;
		System.out.println("In recursion: " + countDigits(n));
		
		n = 123;
		int rev = 0;
		
		while(n>0) {
			
			rev = rev * 10 + n%10;
			n = n/10;
		}
		System.out.println("In while: " + rev);
		n = 123;
		System.out.println("In Recursion: " + reverse(n, 0));

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
	
	//count the no of digits of a given number
	//1234 => 4
	
	public static int countDigits(int n) {
		
		if(n==0)
			return 0;
		
		return 1 + countDigits(n/10);
		
	}
	
	public static int reverse(int n, int rev) {
		
		if(n==0)
			return rev;
		
		rev = rev * 10 + n%10;
		return reverse(n/10, rev);
	}
}
