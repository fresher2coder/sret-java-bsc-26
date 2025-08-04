package exceptionhandling;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args)throws ClassNotFoundException {
		
		int div, dis;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter numbers");
		
		div = scan.nextInt();
		dis = scan.nextInt();
		
//		throw new ClassNotFoundException();
		
		
		try {
			
			System.out.println(div/dis);
			throw new ClassNotFoundException();
		}
		catch(NullPointerException e) {
			
		}
		catch(RuntimeException re) {
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			scan.close();
		}
		
		System.out.println("regular flow");
	}

}
