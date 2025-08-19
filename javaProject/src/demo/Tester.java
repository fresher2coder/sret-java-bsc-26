package demo;

import java.util.Stack;

public class Tester {

	public static void main(String[] args) {
		
		String s = "[{";
		
		Stack<Character> stack = new Stack<>();
				
		
		for(Character ch: s.toCharArray()) {
			
			if(ch == '(') stack.push(')');
			
			else if(ch == '[') stack.push(']');
			
			else if(ch == '{') stack.push('}');
			
			else {
				if(stack.isEmpty() || stack.pop() != ch) {
					System.out.println("Invalid");
				}
			}			
		}
		
		if (stack.isEmpty()) System.out.println("Valid");
		
		else System.out.println("Invalid");
		
		
	}

}
