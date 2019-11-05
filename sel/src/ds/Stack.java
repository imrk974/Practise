package ds;

public class Stack {

	int[] stack = new int[5];
	int top = 0;
	
	public void push(int data) {
		stack[top] = data;
		top++;		
	}
	
	public int peek() {
		return stack[top-1];
	}
	
	public int pop() {
		
		return stack[top-1] = 0;
		
	}
	
	public void show() {
		
		for (int i :stack) {
			System.out.print(i + " ");
		}
		
	}
	
	public int size() {
		
		return stack.length;
	}
	
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(21);
		st.push(23);
		st.push(25);
		System.out.println(st.peek());
		st.show();
		st.pop();
		System.out.println("\n");
		st.show();
		System.out.println("\n");
		st.size();
		
	}

}
