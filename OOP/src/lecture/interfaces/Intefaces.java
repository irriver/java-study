package lecture.interfaces;

interface I {
	void methodB();
}

class A {
	public void methodA (I i) {
		i.methodB();
	}
}

class B implements I {

	@Override
	public void methodB() {
		System.out.println("method B()");
	}
}

class C implements I {

	@Override
	public void methodB() {
		System.out.println("method B() in C");
	}
}

public class Intefaces {

}
