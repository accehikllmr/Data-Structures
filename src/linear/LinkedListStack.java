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
		System.out.println(this.size);
		return this.size;
	}
	
	/* element access, insertion and deletion methods */
	public E top() throws IllegalStateException {
		if (this.data.getHead() == null) {
			throw new IllegalStateException("No element at the top of an empty stack.");
		}
		System.out.println(this.data.getTail().getData());
		return this.data.getTail().getData();
	}
	
	public void push(E element) throws IllegalStateException {
		this.data.insertAtEnd(element);
		this.size++;
		System.out.println(this.toString());
	}
	
	public E pop() throws IllegalStateException {
		if (this.data.getHead() == null) {
			throw new IllegalStateException("Cannot pop an element from an empty stack.");
		}
		E deletedData = this.data.getTail().getData();
		this.data.deleteFromEnd();
		this.size--;
		System.out.println(this);
		return deletedData;
	}
	
	/* other methods */
	public boolean isEmpty() {
		System.out.println(this.size == 0);
		return this.size == 0;
	}
	
	/* obligatory methods */
	public String toString() {
		StringBuilder stack = new StringBuilder();
		Node<E> current = this.data.getHead();
		stack.append("[");
		while (current != null) {
			stack.append(String.format("%s%s", current.getData(), 
					(current.getNext() != null) ? ", " : ""));
			current = current.getNext();
		}
		stack.append("^]");
		return stack.toString();
	}

}
