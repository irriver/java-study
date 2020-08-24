package lecture.inherit_protected;
/*
	public, private, default, '상속' 관계에서의 protected		>> 상속이 없으면 '오버라이드'도 없어
									상속이 없다면	>>>protected 접근자는 클래스 안의 default와 같아
									그러니까 '상속 관계'에서만  사용하는 것
*/

class Modifier {
	public int publicV;
	private int privateV;
	protected int protectV;		//여기서는 사용하는 의미가 없음	>>	"상속한다면 ***override의 필요가 있는지 고민할 필요가 있음을 명시"
}

class ChildOfMod extends Modifier {
	void method() {
		this.protectV = 200;	//상속관계에서 자식클래스는 수퍼클래스의 protected 자원을 사용가능함.
	}
}

public class Protected {
	public static void main(String[] args) {
			Modifier mod = new Modifier();
			ChildOfMod modJr = new ChildOfMod();
			modJr.method();
	}
}
