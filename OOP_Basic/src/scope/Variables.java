package scope;

/*
 	Instance Variable			>>	��ü ���� �ÿ� ��밡��
 									'new ������'�� heap memory�� Instance�� ���� �Ǹ� �� �ȿ� iv�� �������.
									member field�� ����: ���� ����, ���� ����, ��ǰ ����(Reference Type)�� ��� ����.
									�����Ǵ� '��ü����' �ٸ� ���� ����	-> �׷��� �ʱ�ȭ���� ���� -> default ���� ������ ��.
									
 	Local Variable				>>	�޼ҵ� ������ ����. ��� ���� �ݵ�� '�ʱ�ȭ'
 									main �޼ҵ� ���� ������ ��� lv -> method area �ȿ� ����
 									Life Cycle: �޼ҵ� ȣ�� �� stack�� ���� -> �޼ҵ� ���� �� �Ҹ�
 										>>>	�޼ҵ� ��� ���� ����
 											fot (int i; ...) -> fot loop ���� ~ ����
 									
 	Static Variable(Class V)	>>	����ƽ ����(heap�� ������ ��ü �� ���� �ڿ�), Ŭ���� ����
 									��ü ���� ������ �޸𸮿� �ö󰡴� �ڿ�. class area(method area) �ȿ� ����
 									
 									.class ���� �� Ŭ������ ��Ÿ�����Ͱ� �ε�	-> 'static'�̶�� ������ ������ heap�� stack�� �ø��� ���� �̸� ������ �Ҵ�!
 																	-> new �� ��ü ���� ���� �ʾƵ� static ������ �ö�
 									����: [Ŭ������].[Ŭ���� ������] -> Variables.cv -> ��ü ���� ���� ���� ����
 									
 									*** ���� Ŭ������ �ٸ� ��ü�� ���� cv�� ����ϰ� ��
 */
public class Variables {
	int iv;
	
	static int cv;
	
	void method() {
		int lv = 0;
	}
	
	public static void main(String[] args) {
		Variables.cv = 100;
		
		Variables v1 = new Variables();
		System.out.println(v1.cv);		//100
		
		Variables v2 = new Variables();
		System.out.println(v2.cv);		//100
		
		v2.cv = 500;					//v1, v2�� �����ϴ� cv�� ���� 500���� ���Ҵ�
		
		System.out.println(Variables.cv);
	}
}
