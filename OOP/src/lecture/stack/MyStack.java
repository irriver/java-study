package lecture.stack;

public class MyStack {
	private Object[] stackArray;
	private final int MAX;
	private int top;
	
	public MyStack(int MAX) {
		this.MAX = MAX;
		stackArray = new Object[MAX];
		top = -1;	//index
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == (MAX - 1));
	}
	
	public void push(Object data) {
		if (isFull()) {
			System.out.println("Full!");
		} else {
			stackArray[++top] = data;
		}
	}
	
	public Object pop() {
		return isEmpty() ? -1 : stackArray[top--];
	}
}
