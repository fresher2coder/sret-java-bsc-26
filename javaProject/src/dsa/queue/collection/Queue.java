package dsa.queue.collection;

import java.util.*;

public class Queue {

	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<Integer>(); //dynamic array
		
		array.add(null);
		array.remove(0);
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(null);
		list.remove(0);
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(10);
		stack.push(20);
		
		stack.pop();
		stack.peek();
		stack.isEmpty();
		stack.size();
		
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		
		queue.addLast(10);
		queue.addLast(20);
		queue.addLast(30);
		queue.addLast(40);
		queue.addLast(50);
		
		System.out.println(queue.removeFirst());
		
		System.out.println(queue.peekFirst());
		System.out.println(queue.peekLast());
		
		System.out.println(queue.size());		
	}

}
