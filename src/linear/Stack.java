package linear;

public interface Stack<E> {
	
	public int getSize();
	public boolean isEmpty();
	public E top() throws IllegalStateException;
	public void push(E e) throws IllegalStateException;
	public E pop() throws IllegalStateException;
}
