package dsa.stack.application;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the infix:");
		String infix = scan.next();
		
		System.out.println(conversion(infix));
		
		scan.close();

	}
	
	 static String conversion(String infix) {
		 
		Stack<Character> stack = new Stack<>();
		
		StringBuffer postfix = new StringBuffer();
		
		for(char ch : infix.toCharArray()) {
			
			if(Character.isLetterOrDigit(ch))
				postfix.append(ch);
			
			else if(ch == '(')
				stack.push(ch);
			
			else if(ch == ')') {
				
				while(!stack.isEmpty() && stack.peek() != '(')
					postfix.append(stack.pop());
				
				stack.pop();
			}
			
			else {
				
				while(!stack.isEmpty() && precedence(ch) < precedence(stack.peek()))
					postfix.append(stack.pop());
				
				while(!stack.isEmpty() && precedence(ch) == precedence(stack.peek()) && precedence(ch)<3)
					postfix.append(stack.pop());
				
				stack.push(ch);
			}			
		}
		
		while(!stack.isEmpty())
			postfix.append(stack.pop());
		
		return postfix.toString();
	} 
	 
	static int precedence(char ch) {
		
		switch(ch) {
		case '+', '-':
			return 1;
		case '*', '/', '%':
			return 2;
		case '^':
			return 3;
		}
		
		return -1;
	}

}







