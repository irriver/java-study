package lecture.composite;

class Point {
	int x;
	int y;
	
	public Point() {
		this(1, 1);
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Shape {
	void draw() {
		System.out.println("Draw a shape");
	}
}
