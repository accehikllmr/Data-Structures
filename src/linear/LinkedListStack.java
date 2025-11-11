package linear;

public class LinkedListStack<E> implements Stack<E> {
	
	/* attributes */
	private SinglyLinkedList<E> data;
	private int size;
	
	/* constructors */
	public LinkedListStack() {
		this.data = new SinglyLinkedList<E>();
		this.size = 0;
	}
	
	/* accessors */
	public int getSize() {
		return this.size;
	}
	
	/* element access, insertion and deletion methods */
	public E top() throws IllegalStateException {
		if (this.data.getHead() == null) {
			throw new IllegalStateException("No element at the top of an empty stack.");
		}
		return this.data.getHead().getData();
	}
	
	public void push(E element) throws IllegalStateException {
		this.data.insertAtBeginning(element);
	}
	
	public E pop() throws IllegalStateException {
		if (this.data.getHead() == null) {
			throw new IllegalStateException("Cannot pop an element from an empty stack.");
		}
		E deletedData = this.data.getHead().getData();
		this.data.deleteFromBeginning();
		return deletedData;
	}
	
	/* other methods */
	public boolean isEmpty() {
		return this.size == 0;
	}

}
