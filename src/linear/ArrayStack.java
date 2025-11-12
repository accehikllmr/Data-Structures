package linear;

public class ArrayStack<E> implements Stack<E> {
	
	/* attributes */
	private E[] data;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	
	/* constructors */
	public ArrayStack() {
		this(DEFAULT_CAPACITY);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		if (capacity < 1) {
			throw new IllegalArgumentException("Capacity of Stack must exceed 0.");
		}
		this.data = (E[]) new Object[capacity];
		this.size = 0;
	}
	
	/* accessors */
	public int getSize() {
		//System.out.println(this.size);
		return this.size;
	}
	
	/* element access, insertion and deletion methods */
	public E top() throws IllegalStateException {
		if (this.isEmpty()) {
			System.out.println(this.toString());
			throw new IllegalStateException("No element at the top of an empty Stack.");
		}
		System.out.println(data[this.size - 1].toString());
		return data[this.size - 1];
	}
	
	public void push(E element) throws IllegalStateException {
		if (this.size == this.data.length) {
			System.out.println(this.toString());
			throw new IllegalStateException("Cannot push an element to a full Stack.");
		} else {
			this.data[this.size++] = element;
			System.out.println(this.toString());
		}
	}
	
	public E pop() throws IllegalStateException {
		if (this.isEmpty()) {
			System.out.println(this.toString());
			throw new IllegalStateException("Cannot pop an element from an empty Stack.");
		}
		else {
			E element = this.data[this.size - 1];
			this.data[this.size - 1] = null;
			this.size--;
			System.out.println(this.toString());
			return element;
		}
	}
	
	/* other methods */
	public boolean isEmpty() {
		//System.out.println(this.size == 0);
		return this.size == 0;
	}
	
	/* obligatory methods */
	public String toString() {
		StringBuilder stack = new StringBuilder();
		stack.append("[");
		
		for (int i = 0; i < this.size; i++) {
			stack.append(String.format("%s%s", this.data[i].toString(), (i != this.size - 1) ? ", " : ""));
		}
		
		stack.append("^]");
		return stack.toString();
	}
}
