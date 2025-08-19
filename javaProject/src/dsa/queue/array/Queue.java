package dsa.queue.array;

public class Queue {
	
	private int front, rear;
	private int capacity, size;
	private int queue[];
	
	public Queue(int capacity) {
		
		queue = new int[capacity];
		this.capacity = capacity;
		front = rear = -1;
		size = 0;
	}
	
	void enQueue(int val) {
		
		if(this.isFull())
			return;
		
		if(this.isEmpty())
			front = rear = 0;
		else
			rear = (rear+1) % capacity;
		
		queue[rear] = val;
		size++;		
	}
	
	int deQueue() {
		
		if(this.isEmpty())
			return -1;
		
		int temp = queue[front]; 
		
		if(front == rear)
			front = rear = -1;
		else
			front = (front+1) % capacity;
		
		size--;
		return temp;
	}
	
	int rear() {
		
		if(this.isEmpty())
			return -1;
		
		return queue[rear];
	}
	
	int front() {
		
		if(this.isEmpty())
			return -1;
		
		return queue[front];
	}
	
	int size() {
		
		return size;
	}
	
	boolean isEmpty() {
		
		return front==-1 && rear==-1;
	}
	
	boolean isFull() {
		
		return (rear+1) % this.capacity == front;
	}
	

}















