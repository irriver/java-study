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
	// �߻�ȭ�� TV�� ���� �Ӽ�, ����� ��ӹ޾ұ� ������ SmartTv���� ���� Ư���� ���� ��
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
		
//		���� Ŭ������ ���������� �ڼ� Ŭ������ ��ü�� ��밡��
		Tv tv = new SmartTv();
//		��, �ڼ��� �޼ҵ�� ��� �Ұ�
//		tv.showCaption();
		
		System.out.println(tv.toString());
		System.out.println(stv.toString());

		SmartTv sstv = (SmartTv) new Tv();
	}
}
