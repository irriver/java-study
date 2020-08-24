package lecture.inheriatance;

class Point2D {
	int x = 4;
	int y = 5;
	String getposition() {
		return this.x + "," + this.y;
	}
}

class Point3D extends Point2D {
//	int z = 6;
//	@Override
//	String getposition() {
//		System.out.println("super class Point2D의 메소드 재정의, 오버라이드, 구현부만 수정");
//		return this.x + "," + this.y + "," + this.z;
//	}
	
}

public class Overriding {
	
}
