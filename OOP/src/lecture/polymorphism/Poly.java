package lecture.polymorphism;


class Tv {
	boolean power;
	int ch;
	
	void power() {
		this.power = !this.power;
		System.out.println("Power Status: " + this.power);
	}
	
	void chUp() {
		this.ch++;
	}
	
	void chDown() {
		this.ch--;
	}
}

class SmartTv extends Tv {
	// 추상화된 TV의 고유 속성, 기능은 상속받았기 때문에 SmartTv만의 개별 특성만 더할 것
	String caption;
	void showCaption() {
		this.caption = "Show Korean captions...";
		System.out.println(this.caption);
	}
}

public class Poly {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.power();
		stv.chUp();
		stv.power();
		stv.showCaption();
		
//		수퍼 클래스의 참조변수로 자손 클래스의 객체를 사용가능
		Tv tv = new SmartTv();
//		단, 자손의 메소드는 사용 불가
//		tv.showCaption();
		
		System.out.println(tv.toString());
		System.out.println(stv.toString());

		SmartTv sstv = (SmartTv) new Tv();
	}
}
