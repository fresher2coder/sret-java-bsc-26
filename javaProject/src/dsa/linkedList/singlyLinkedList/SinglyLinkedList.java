package dsa.linkedList.singlyLinkedList;

public class SinglyLinkedList {
	
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
		
//		if(index>=size) {
//			insertAtEnd(city, state);
//			return;
//		}
		
		Node current = head, prev = null;
				
		while(current!=null && index>0) {	// 2		
			prev = current;
			current = current.next;
			index--;
		}
		
		if(index!=0) {
			this.insertAtEnd(city, state);
			return;
		}
		
		prev.next = newNode;
		newNode.next = current;
	}
	
	void deleteAtEnd() {
		
		if(head==null) 
			return;
		
		Node current=head, prev=null;
		
		while(current!=tail) {
			prev = current;
			current = current.next;
		}
		
		tail = prev;
		
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
		
		Node current=head, prev=null;
		
		while(index>0) {
			prev = current;
			current = current.next;
			
			index--;
		}
		
		if(prev!=null)
			prev.next = current.next;
		size--;
	}
	
	void traversal() {
		
		Node current = head;
		
		while(current!=null) {
			
			System.out.print(current.city);
			
			if(current.next!=null)
				System.out.print(" -> ");
			
			current = current.next;			
		}
		System.out.println();
	}
}




