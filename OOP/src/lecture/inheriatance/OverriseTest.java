package lecture.inheriatance;

public class OverriseTest {
	int x = 100;
	void print() {
		System.out.println("parent's method");
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		
	}
}

class Child extends OverriseTest {
//	Ignore Parents's member -> DEPRECATED
//	int x = 300;
	
	@Override
	void print() {
		System.out.println("Override parent's method");
	}
	
	void print(String str) {
		System.out.println("OVERLOAD!!!!!");
	}
}