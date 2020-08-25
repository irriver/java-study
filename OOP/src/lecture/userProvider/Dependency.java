package lecture.userProvider;

class B {}
class A {
	int i;
	B b;
	
	A() {}
	A(B b) {
		this.b = b;	//�ۿ��� B��ü ���� �� �ּҸ� �Ѱ����� 
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
		System.out.println("D call �������̽��� m() �������̵�");
	}
}
class F implements iCall {
	@Override
	public void m() {
		System.out.println("F call �������̽��� m() �������̵�");
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
