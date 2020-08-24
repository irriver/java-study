package lecture.singleton;

public class Singleton {
	private static Singleton singleObj;
	private Singleton() {
		//���� ��ü ���� �Ұ�	>> new�� �ȵ�
	}
	
	public static Singleton getInstance() {
		if (singleObj == null) {
			singleObj = new Singleton();	//heap �޸𸮿� singleton ��ü�� �ö�� >> ��ü�� �ּҸ� singleton�� ����
		}
		return singleObj;
	}
}
