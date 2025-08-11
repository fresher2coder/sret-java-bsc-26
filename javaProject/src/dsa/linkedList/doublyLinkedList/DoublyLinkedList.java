package dsa.linkedList.doublyLinkedList;

public class DoublyLinkedList {
	
	Node head, tail;
	int size;
	
	void insertAtEnd(String city, String state) {
		
		Node newNode = new Node(city, state);
		
		if(head==null) {
			head = tail = newNode;
			size++;
			return;
		}		
		
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;	
		size++;
	}
	
	void insertAtBegin(String city, String state) {
		
		Node newNode = new Node(city, state);
		
		if(head==null) {
			head = tail = newNode;
			size++;
			return;
		}
		
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
		size++;
	}
	
	void insertAt(int index, String city, String state) {
		
		Node newNode = new Node(city, state);
		
		if(head==null) {
			head = tail = newNode;
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
			tail.next = null;
		else
			head = null;
		
		size--;
		
		
	}
	
	void deleteAtBegin() {
		
		if(head==null) 
			return;
		
		head = head.next;
		if(head!=null)
			head.prev = null;
		size--;
		
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
		while(current!=null) {
			
			System.out.print(current.city);
			
			if(current.next!=null)
				System.out.print(" -> ");
			
			current = current.next;			
		}
		System.out.println();
		current = tail;
		System.out.print("Reverse: ");
		while(current!=null) {
			
			System.out.print(current.city);
			
			if(current.prev!=null)
				System.out.print(" -> ");
			
			current = current.prev;			
		}
		System.out.println();
	}
}




