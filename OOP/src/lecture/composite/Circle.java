package lecture.composite;
/*
	1) Circle is a Shape
	2) Circlr has a Point
	3) Circle has a radius
	4) radius initializes 10
	5) point initializes (10, 15)
	6) if there's no init value, can take radius and point coordinates
*/
public class Circle extends Shape{
//	Included: Circle 'has' a 'Point' 
	Point point;
	int rad;
	
	public Circle() {
		this(10, new Point(10, 15));
//		this.rad = 10;
//		this.point = new Point(10, 15);
	}
	
	Circle(int rad, Point point) {
		this.rad = rad;
		this.point = point;
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		
		Circle circle = new Circle(66, new Point(22, 33));
//		System.out.println(c.rad);
//		System.out.println(c.color);
//		System.out.println(c.point.y);
//		c.draw();
		
		System.out.println(circle.rad);
		System.out.println(circle.point.x);
		System.out.println(circle.point.y);
		circle.draw();
	}
	
}
