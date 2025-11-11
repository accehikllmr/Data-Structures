package linear;

public class Node<T> {
	
	/* attributes */
	private T data;
	private Node<T> next;
	private Node<T> prev;
	
	/* constructor */
	public Node(T data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	
	/* accessor methods */
	public T getData() {
		return this.data;
	}
	
	public Node<T> getNext() {
		return this.next;
	}
	
	public Node<T> getPrev() {
		return this.prev;
	}
	
	/* mutator methods */
	public void setData(T data) {
		this.data = data;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}
	
	/* obligatory methods */
	@Override
	public String toString() {
		// data is reference type T, so data will have own toString method implemented
		return data != null ? data.toString() : null;
	}
}
