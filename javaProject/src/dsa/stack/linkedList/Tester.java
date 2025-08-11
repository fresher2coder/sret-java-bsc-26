package dsa.stack.linkedList;

public class Tester {

	public static void main(String[] args) {

		Stack stack = new Stack();
		
		System.out.println("IsEmpty: " + stack.isEmpty());
		System.out.println("Size: " + stack.size());
		
		for(int i=10; i<=50; i+=10)
			stack.push(i);
		
		System.out.println("Top: " + stack.peek());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Top: " + stack.peek());
	}
}
