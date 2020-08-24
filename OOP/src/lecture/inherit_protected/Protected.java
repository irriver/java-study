package lecture.inherit_protected;
/*
	public, private, default, '���' ���迡���� protected		>> ����� ������ '�������̵�'�� ����
									����� ���ٸ�	>>>protected �����ڴ� Ŭ���� ���� default�� ����
									�׷��ϱ� '��� ����'������  ����ϴ� ��
*/

class Modifier {
	public int publicV;
	private int privateV;
	protected int protectV;		//���⼭�� ����ϴ� �ǹ̰� ����	>>	"����Ѵٸ� ***override�� �ʿ䰡 �ִ��� ����� �ʿ䰡 ������ ���"
}

class ChildOfMod extends Modifier {
	void method() {
		this.protectV = 200;	//��Ӱ��迡�� �ڽ�Ŭ������ ����Ŭ������ protected �ڿ��� ��밡����.
	}
}

public class Protected {
	public static void main(String[] args) {
			Modifier mod = new Modifier();
			ChildOfMod modJr = new ChildOfMod();
			modJr.method();
	}
}
