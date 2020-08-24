package lecture.composite;

public class Triangle extends Shape {
//	Point x;
//	Point y;
//	Point z;
	Point[] points;
	
	void draw() {
		System.out.println("Draw a Triangle");
	}
	
	Triangle() {
//		this(Address of Point arrays)
//		this.points = new Point[3];
//		this.points[0] = new Point(1, 2);
//		this.points[1] = new Point(3, 4);
//		this.points[2] = new Point(5, 6);
		this(new Point[] {new Point(1, 2), new Point(3, 4), new Point(5, 6)});
	}	
//	public Triangle(Point point1, Point point2, Point poin3) {
//		this.point1 = point1;
//		this.point2 = point2;
//		this.point1 = point3;
//	}
	
	Triangle(Point[] points) {
//		**ERROR
//		this.points = {new Point(), new Point(), new Point()};
	}
}
