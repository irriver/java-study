package lecture.stack;

import java.util.Stack;

public class StackCollection {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("a");
		s.push("b");
		s.pop();
		s.pop();
//		s.pop();
		System.out.println(s.empty());
	}
}
