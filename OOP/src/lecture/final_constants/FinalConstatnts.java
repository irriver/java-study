package lecture.final_constants;

//		final constants�� '�ʱ�ȭ'�� '����'���ָ� �ȴ�. -> �����ڿ���!

class Vcard {
	final String KIND;
	final int NUM;

	public Vcard(String KIND, int NUM) {
		this.KIND = KIND;
		this.NUM = NUM;
	}
	
	void method() {
		System.out.println(Math.PI);
	}
}

public class FinalConstatnts {
	public static void main(String[] args) {
		Vcard h7 = new Vcard("Heart", 7);
		Vcard s1 = new Vcard("Spade", 1);
		Vcard d5 = new Vcard("Diamond", 5);
		
		System.out.println(h7.toString());
		System.out.println(s1.toString());
		System.out.println(d5.toString());
	}
}
