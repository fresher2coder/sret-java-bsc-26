package dsa.stack.linkedList;

public class Stack {
	
	Node top;
	int size;
	
	void push(int val) {
		
		Node newNode = new Node(val);
		
		if(this.isEmpty()) {
			top = newNode;
		}
		else {
			newNode.next = top;
			top = newNode;
		}
		
		size++;
	}
	
	int pop() {
		
		if(isEmpty())
			return -1;		
		
		int temp = top.val;
		top = top.next;
		size--;
		return temp;
	}
	
	int peek() {
		if(isEmpty())
			return -1;
		
		return top.val;
	}
	
	int size() {
		
		return size;
	}
	
	boolean isEmpty() {
		
		return top==null;
	}
	
	
}
