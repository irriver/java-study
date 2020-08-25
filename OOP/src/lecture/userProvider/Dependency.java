package lecture.userProvider;

class B {}
class A {
	int i;
	B b;
	
	A() {}
	A(B b) {
		this.b = b;	//밖에서 B객체 생성 후 주소를 넘겨주자 
	}
}

interface iCall {
	void m();
}

class C {
	void method(iCall ic) {
		ic.m();
	}
}

class D implements iCall {
	@Override
	public void m() {
		System.out.println("D call 인터페이스의 m() 오버라이드");
	}
}
class F implements iCall {
	@Override
	public void m() {
		System.out.println("F call 인터페이스의 m() 오버라이드");
	}
}

public class Dependency {
	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		F f = new F();
		 
		c.method(d);
		c.method(f);
	}
}
