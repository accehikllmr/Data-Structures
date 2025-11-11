package linear;

public class TesterStack {
	
	public static void main(String[] args) {
		
		ArrayStack<Integer> stack = new ArrayStack<Integer>();
		
		try {
			//stack.top();						// top		when size is		0
			stack.getSize();					// size		when size is		0
			stack.push(0);						// push		when size is		0
			stack.top();						// top		when size is		not 0
			stack.push(1);						// push		when size is		not 0
			stack.top();
			stack.pop();						// pop		when size is		not 0
			stack.pop();
			//stack.pop();						// pop		when size is 		0
			stack.isEmpty();					// empty	when size is		0
			stack.push(0);
			stack.isEmpty();					// empty	when size is		not 0
			stack.push(1);
			stack.push(2);
			stack.getSize();					// size		when size is		not 0
			stack.push(3);
			stack.push(4);
			stack.push(5);
			stack.push(6);
			stack.push(7);
			stack.push(8);
			stack.push(9);
			//stack.push(10);					// push		when size is		max
			stack.pop();						// pop		when size is		max
			stack.push(9);
			stack.top();						// top		when size is		max
			stack.isEmpty();					// empty	when size is		max
			stack.getSize();					// size		when size is		max
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}
	}
}
