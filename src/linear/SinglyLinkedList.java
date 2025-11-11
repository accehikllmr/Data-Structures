package linear;

public class SinglyLinkedList<T> extends LinkedList<T> {
	
	/* constructor */
	public SinglyLinkedList() {
		super();
	}
	
	/* insertions and deletion methods */
	public void insertAtBeginning(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNext(this.head);
		this.head = newNode;
		this.tail = (this.size != 0) ? this.tail : this.head;
		this.size++;
		System.out.println(this.toString());
	}
	
	public void insertAtEnd(T data) {
		Node<T> newNode = new Node<>(data);
		if (this.head == null) {
			this.insertAtBeginning(data);
			return;
		} else {
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
		this.head = this.head.getNext();
		this.size--;
		this.tail = (this.size != 0) ? this.tail : this.head;
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
		}
		
		Node<T> before = this.getNodeBefore(this.size - 1);
		deletedData = this.tail.getData();
		before.setNext(null);
		this.tail = before;
		this.size--;
		System.out.println(this.toString());
		return deletedData;
	}
	
	public T deleteFromPosition(int position) throws IndexOutOfBoundsException {
		T deletedData = null;
		
		if (position < 0 || position >= this.size) {
			System.out.println(this.toString());
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
		before.setNext(before.getNext().getNext());
		this.size--;
		System.out.println(this.toString());
		return deletedData;
	}
	
	/* helper methods */
	public Node<T> getNodeBefore(int position) {
		Node<T> before = this.head;
		for (int i = 0; i < position - 1; i++) {
			before = before.getNext();
		}
		return before;
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
					(current.equals(this.tail)) ? "*" : "", (current.getNext() == null) ? "" : " -> ");
			current = current.getNext();
		}
		return list;
	}
}
