package linear;

public abstract class LinkedList<T> {

	/* attributes */
	protected Node<T> head;
	protected Node<T> tail;
	protected int size;
	
	/* constructor */
	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	/* accessors */
	public Node<T> getHead() {
		return this.head;
	}
	
	public Node<T> getTail() {
		return this.tail;
	}
	
	/* other methods */
	public abstract void insertAtBeginning(T data);
	public abstract void insertAtEnd(T data);
	public abstract void insertAtPosition(int position, T data) throws IndexOutOfBoundsException;
	public abstract T deleteFromBeginning();
	public abstract T deleteFromEnd();
	public abstract T deleteFromPosition(int position) throws IndexOutOfBoundsException;
	
	/* helper methods */
	public abstract Node<T> getNodeBefore(int position);
	public abstract void display();
	
}
