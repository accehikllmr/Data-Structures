package linear;

public class ConsoleTester {
	
	public static void main(String[] args) {
		
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		
		list.insertAtBeginning(9);
		list.insertAtBeginning(8);
		list.insertAtBeginning(7);
		list.insertAtBeginning(6);
		list.insertAtBeginning(5);
		list.insertAtBeginning(4);
		list.insertAtBeginning(3);
		list.insertAtBeginning(2);
		list.insertAtBeginning(1);
		list.insertAtBeginning(0);
		try {
			System.out.println(list.findMiddle().toString());
		} catch (IllegalStateException e) {
			System.out.println(e);
		}
		
//		LinkedList<Integer> list = new SinglyLinkedList<Integer>();
//		System.out.println(list.toString());
//		list.insertAtBeginning(1);			// insert at beginning 		when size is 		0
//		list.insertAtBeginning(2);			// insert at beginning 		when size is 		not 0
//		list.insertAtEnd(4);				// insert at end 			when size is		not 0
//		list.insertAtPosition(0, 8);		// insert at position		when position is	0
//		list.insertAtPosition(4, 16);		// insert at position		when position is	size
//		list.insertAtPosition(2, 32);		// insert at position		when position is	k
//		
//		list.deleteFromBeginning();			// delete from beginning	when size is		not 0
//		list.deleteFromEnd();				// delete from end			when size is		not 0
//		list.deleteFromPosition(0);			// delete from position		when position is	0
//		list.deleteFromPosition(2);			// delete from position		when position is	size
//		list.insertAtBeginning(64);
//		list.insertAtEnd(128);
//		list.deleteFromPosition(2);			// delete from position		when position is	k
//		list.deleteFromBeginning();
//		list.deleteFromBeginning();
//		list.deleteFromBeginning();
//		list.deleteFromBeginning();			// delete from beginning	when size is		0
//		list.deleteFromEnd();				// delete from end			when size is		0
//		list.insertAtEnd(256);				// insert at end			when size is		0
	
//		LinkedList<Integer> list = new DoublyLinkedList<Integer>();
//		
//		System.out.println(list.toString());
//		list.deleteFromBeginning();			// delete from beginning	when size is		0
//		list.deleteFromEnd();				// delete from end			when size is		0
//		//list.deleteFromPosition(0);		// delete from position		when size is		0
//		list.insertAtBeginning(1);			// insert at beginning		when size is		0
//		list.insertAtBeginning(2);			// insert at beginning		when size is		not 0
//		list.insertAtEnd(3);				// insert at end			when size is		not 0
//		list.insertAtPosition(0, 5);		// insert at position		when position is	0
//		list.insertAtPosition(4, 7);		// insert at position		when position is	size
//		list.insertAtPosition(3, 11);		// insert at position		when position is	k
//		list.deleteFromBeginning();			// delete from beginning	when size is		not 0
//		list.deleteFromEnd();				// delete from end			when size is		not 0
//		list.deleteFromPosition(0);			// delete from position		when position is	0
//		list.deleteFromPosition(2);			// delete from position		when position is	size
//		list.insertAtBeginning(13);
//		list.deleteFromPosition(1);			// delete from position		when position is	k
//		list.deleteFromBeginning();
//		list.deleteFromBeginning();
//		list.insertAtEnd(17);				// insert at end			when size is		0
//		list.deleteFromBeginning();
//		list.insertAtPosition(0, 19);		// insert at position		when size is		0
		
	}
}
