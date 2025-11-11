package linear;

public class DoublyLinkedList<T> extends LinkedList<T> {
	
	/* constructor */
	public DoublyLinkedList() {
		super();
	}
	
	/* insertion and deletion methods */
	public void insertAtBeginning(T data) {
		Node<T> newNode = new Node<>(data);
		
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			newNode.setNext(this.head);
			this.head.setPrev(newNode);
			this.head = newNode;			
		}
		
		this.size++;
		System.out.println(this.toString());
	}
	
	public void insertAtEnd(T data) {
		Node<T> newNode = new Node<>(data);
		if (this.head == null) {
			this.insertAtBeginning(data);
			return;
		} else {
			newNode.setPrev(this.tail);
			this.tail.setNext(newNode);
			this.tail = newNode;
		}

		this.size++;
		System.out.println(this.toString());
	}
	
	public void insertAtPosition(int position, T data) throws IndexOutOfBoundsException {
		if (position < 0 || position > this.size) {
			System.out.println(this.toString());
			throw new IndexOutOfBoundsException("Invalid position: " + position);
		} else if (position == 0) {
			this.insertAtBeginning(data);
			return;
		} else if (position == this.size) {
			this.insertAtEnd(data);
			return;
		}
		
		Node<T> newNode = new Node<>(data);
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			Node<T> before = this.getNodeBefore(position);
			newNode.setNext(before.getNext());
			newNode.setPrev(before);
			before.getNext().setPrev(newNode);
			before.setNext(newNode);
		}
		
		this.size++;
		System.out.println(this.toString());
	}
	
	public T deleteFromBeginning() {
		if (this.head == null) {
			System.out.println(this.toString());
			return null;
		}
		
		T deletedData = this.head.getData();
		if (this.head == this.tail) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.getNext();
			this.head.setPrev(null);			
		}

		this.size--;
		System.out.println(this.toString());
		return deletedData;
		
	}
	
	public T deleteFromEnd() {
		T deletedData = null;
		
		if (this.head == null) {
			System.out.println(this.toString());
			return null;
		} else if (this.head == this.tail) {
			deletedData = this.deleteFromBeginning();
			return deletedData;
		} else {
			this.tail = this.tail.getPrev();
			this.tail.setNext(null);
		}
		
		this.size--;
		System.out.println(this.toString());
		return deletedData;
	}
	
	public T deleteFromPosition(int position) throws IndexOutOfBoundsException {
		T deletedData = null;
		
		if (position < 0 || position >= this.size) {
			throw new IndexOutOfBoundsException("Invalid position: " + position);
		} else if (position == 0) {
			deletedData = this.deleteFromBeginning();
			return deletedData;
		} else if (position == this.size - 1) {
			deletedData = this.deleteFromEnd();
			return deletedData;
		}
		
		Node<T> before = this.getNodeBefore(position);
		deletedData = before.getNext().getData();
		before.getNext().getNext().setPrev(before);
		before.setNext(before.getNext().getNext());
		this.size--;
		System.out.println(this.toString());
		return deletedData;
	}
	
	/* helper methods */	
	public Node<T> getNodeBefore(int position) {
		Node<T> before;
		
		if (position <= this.size / 2) { 
			before = this.head;
			for (int i = 0; i < position - 1; i++) {
				before = before.getNext();
			}
		} else { 
			before = this.tail;
			for (int i = this.size - 1; i >= position; i--) {
				before = before.getPrev();
			}
		}
				
		return before;
	}
	
	public T findMiddle() throws IllegalStateException {
		if (this.head == null) {
			throw new IllegalStateException("Empty list.");
		} else {
			Node<T> middleNode = this.tail;
			for (int i = this.size - 1; i > this.size / 2; i--) {
				middleNode = middleNode.getPrev();
			}
			return middleNode.getData();
		}	
	}
	
	public T findMiddleTwoPointers() throws IllegalStateException {
		if (this.head == null) {
			throw new IllegalStateException("Empty list.");
		} else {
			Node<T> leftPtr = this.head;
			Node<T> rightPtr = this.tail;
			if (this.size % 2 == 0) {
				while (leftPtr.getNext() != rightPtr) {
					leftPtr = leftPtr.getNext();
					rightPtr = rightPtr.getPrev();
				}
			} else {
				while (leftPtr != rightPtr) {
					leftPtr = leftPtr.getNext();
					rightPtr = rightPtr.getPrev();
				}
			}
			return rightPtr.getData();
		}
	}
	
	/* obligatory methods */
	@Override
	public String toString() {
		String list = "";
		if (this.head == null) {
			list = "Empty list.";
			return list;
		}
		
		Node<T> current = this.head;
		while (current != null) {
			list += String.format("%s%s%s%s", (current.equals(this.head)) ? "*" : "", current.getData().toString(),
					(current.equals(this.tail)) ? "*" : "", (current.getNext() == null) ? "" : " <-> ");
			current = current.getNext();
		}
		return list;
	}
}
