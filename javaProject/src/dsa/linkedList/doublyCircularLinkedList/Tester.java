package dsa.linkedList.doublyCircularLinkedList;

public class Tester {

	public static void main(String[] args) {
		
		DoublyCircularLinkedList sll = new DoublyCircularLinkedList();
		
		sll.insertAtEnd("Chennai", "TN");
		sll.insertAtEnd("Hyderabad", "TL");
		sll.insertAtEnd("Bangalore", "KT");
		sll.insertAtEnd("Mumbai", "MH");
		
		sll.traversal();
		
		sll.insertAtBegin("Kochin", "KR");
		sll.insertAtBegin("Allapey", "KR");
		
		sll.traversal();
		
		sll.insertAt(2, "Goa", "Goa");
		
		sll.traversal();
		System.out.println("Size: " + sll.size);
		
		sll.insertAt(7, "Delhi", "Delhi");
		sll.traversal();
		
		sll.insertAt(0, "Ooty", "TN");
		sll.traversal();
		System.out.println("Size: " + sll.size);
		
		sll.insertAt(87, "Lucknow", "UP");
		sll.traversal();
		System.out.println("Size: " + sll.size);
				
		for(int i=1; i<10; i++)
			sll.deleteAtBegin();
		
		sll.traversal();
		System.out.println("Size: " + sll.size);
		
		System.out.println(sll.head.city + " " + sll.tail.city);
		sll.deleteAtBegin();
		sll.traversal();
		
		System.out.println("Head: " + sll.head + " Tail: " + sll.tail);
				
		sll.insertAtEnd("Chennai", "TN");
		sll.insertAtEnd("Hyderabad", "TL");
		sll.insertAtEnd("Bangalore", "KT");
		sll.traversal();
		
		sll.deleteAtEnd();
		sll.traversal();
		
		sll.deleteAtEnd();
		sll.deleteAtEnd();
		sll.traversal();
		
		System.out.println("Head: " + sll.head + " Tail: " + sll.tail);
		
		sll.insertAtEnd("Chennai", "TN");
		sll.insertAtEnd("Hyderabad", "TL");
		sll.insertAtEnd("Bangalore", "KT");
		sll.insertAtEnd("Mumbai", "MH");
		sll.traversal();
		
		sll.deleteAt(2);
		sll.traversal();
		
		sll.deleteAt(0);
		sll.traversal();
		
		sll.deleteAt(5);
		sll.traversal();
		
		sll.deleteAt(78);
		sll.traversal();
		
	}
}
