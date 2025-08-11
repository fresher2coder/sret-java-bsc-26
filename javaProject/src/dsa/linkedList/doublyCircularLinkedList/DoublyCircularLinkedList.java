package dsa.linkedList.doublyCircularLinkedList;

public class DoublyCircularLinkedList {
	
	Node head, tail;
	int size;
	
	void insertAtEnd(String city, String state) {
		
		Node newNode = new Node(city, state);
		
		if(head==null) 
			head = tail = newNode;		
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		
		tail.next = head;
		head.prev = tail;
		size++;
	}
	
	void insertAtBegin(String city, String state) {
		
		Node newNode = new Node(city, state);
		
		if(head==null) 
			head = tail = newNode;
		else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
			
		tail.next = head;
		head.prev = tail;		
		size++;
	}
	
	void insertAt(int index, String city, String state) {
		
		Node newNode = new Node(city, state);
		
		if(head==null) {
			head = tail = newNode;
			tail.next = head;
			head.prev = tail;
			size++;
			return;
		}
		
		if(index<=0) {
			insertAtBegin(city, state);
			return;
		}
		
		if(index>=size) {
			insertAtEnd(city, state);
			return;
		}
		
		Node current = head;
				
		while(index>0) {
			current = current.next;
			index--;
		}
		
		current.prev.next = newNode;
		newNode.prev = current.prev; 
		
		newNode.next = current;
		current.prev = newNode;
		
		size++;
	}
	
	void deleteAtEnd() {
		
		if(head==null) 
			return;
		
		Node current=tail;		
		
		tail = current.prev;
		
		if(tail!=null)
			tail.next = head;
		else
			head = null;
		
		head.prev = tail;
		size--;
		
		
	}
	
	void deleteAtBegin() {
		
		if(head==null) 
			return;
		
		head = head.next;
		if(head!=null)
			head.prev = tail;
		size--;
		
		tail.next = head;
		
		if(head==null)
			tail=null;
		
	}
	
	void deleteAt(int index) {
		
		if(head==null) 
			return;
		
		if(index<=0) {
			this.deleteAtBegin();
			return;
		}
		
		if(index>=size) {
			this.deleteAtEnd();
			return;
		}
		
		Node current=head;
		
		while(index>0) {			
			current = current.next;			
			index--;
		}
		
		if(current.prev!=null) {
			current.prev.next = current.next;
			current.next.prev = current.prev;
		}
			
		size--;
	}
	
	void traversal() {
		
		Node current = head;
		
		System.out.print("Forward: ");
		do {
			System.out.print(current.city);
			
			if(current.next!=head)
				System.out.print(" -> ");
			
			current = current.next;				
		}while(current!=head);
		System.out.print(" -> " + current.city);
		
		System.out.println();
		
		current = tail;
		System.out.print("Reverse: ");
		do {
			System.out.print(current.city);
		
			if(current.next!=tail)
				System.out.print(" -> ");
		
			current = current.next;				
		}while(current!=tail);
		System.out.print(" -> " + current.city);
		System.out.println();
		
		
	}
}




