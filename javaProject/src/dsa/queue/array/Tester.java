package dsa.queue.array;

public class Tester {

	public static void main(String[] args) {
		
		Queue queue = new Queue(5);
		
		System.out.println("IsFull: " + queue.isFull());
		System.out.println("IsEmpty: " + queue.isEmpty());
		System.out.println("Size: " + queue.size());
		
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		
		System.out.println("Size: " + queue.size());
		System.out.println("Front: " + queue.front());
		System.out.println("Rear: " + queue.rear());
		
		queue.enQueue(60);
		System.out.println("Front: " + queue.front());
		System.out.println("Rear: " + queue.rear());
	
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		
		System.out.println("Front: " + queue.front());
		System.out.println("Rear: " + queue.rear());

		queue.deQueue();
		System.out.println("IsEmpty: " + queue.isEmpty());
		

	}

}
