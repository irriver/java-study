import kr.or.bit.common.Car;

//	���ݱ��� mainŬ���� �ȿ��� ���������� ���� ��� class�� default ����
//	�׷��� ���� ��Ű�� �ȿ����� ��밡�� ����
//	��, 'public'�� �ϳ��� ��밡��
class Test {
	String default_iv;
	public String public_iv;
	private String private_iv;
}

public class Main {

	public static void main(String[] args) {
		// Car �� public �̱� ������ �ٸ� ��Ű���� �ڿ��� ������ �� �� �־�
		Car car = new Car();
		car.window = 5; 
		// �ٸ� ��Ű�� �ȿ� �������� ���������� default�� ��� �Ұ���
//		Airplane airplane = new Airplane();

		// ���� ��Ű�� �ȿ� �������� ���������� default�� ��� ����
		Air air = new Air();

		Test t = new Test();
		t.default_iv = "���� ��Ű�� ���� Ŭ������ t�� ���� ���� ����";
		t.public_iv = "��ΰ� ���� ����";
//		t.private_iv = "getter, setter�� ���ؼ��� ���� ����";
	}
}
