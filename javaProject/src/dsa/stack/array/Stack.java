package dsa.stack.array;

public class Stack {
	
	int top, capacity;
	int stack[];
	
	public Stack(int capacity) {
		
		this.capacity = capacity;
		this.top = -1;
		stack = new int[capacity];		
	}
	
	void push(int val) {
		
		if(this.isFull())
			return;
		
		stack[++top] = val;
	}
	
	int pop() {
		
		if(this.isEmpty())
			return -1;
		
		return stack[top--];
	}
	
	int peek() {
		
		if(this.isEmpty())
			return -1;
		
		return stack[top];
	}
	
	boolean isEmpty() {
		
		return top==-1;
	}
	
	boolean isFull() {
		
		return top+1 == capacity;
	}
	
	int size() {
		
		return top+1;
	}
	
	void traversal() {
		
		for(int i=top; i>=0; i--)
			System.out.print(stack[i] + " ");
		
		System.out.println();
	}
}










