package lecture.stack;

public class MyStackMain {
	public static void main(String[] args) {
		
	MyStack ms = new MyStack(5);
	ms.push(3);
	ms.push(4);
	ms.push(5);
	ms.push(6);
	
	ms.pop();
	ms.pop();
	ms.pop();
	ms.pop();
	
	System.out.println(ms.top());
	}
}
