package static_var;

/*
	1) Set fields to default initial values (0, false, null)
	2) Call the constructor for the object (but don't execute the body of the constructor yet)
	3) Invoke the constructor of the superclass
 	4) ***Initialize fields using initializers and initialization blocks
	5) Execute the body of the constructor
 
 */

class  InitTest {
	static int cv1 = 10;
	static int cv2;
	
	//	Static Initialize Block
	static {
		//	����ƽ �ʱ�ȭ �������� �ν��Ͻ� ����� �ʱ�ȭ�� �Ұ���
		cv1 = 10;
		cv2 = cv1 + 10;
	}
	
	//	Field Initialize Block
	{
		//	�����ڿ� ����� ����
		//	��ü ���� �� iv�� heap�� �ö󰡰� �� �� ȣ��
		//	�ʱ�ȭ�� ���� Ȥ�� ������ �� �� �־�	>>	if (iv > 10) { iv = 100; }
		System.out.println("Init Block!");
		iv = 3;
	}
	
	int iv = 1;
	
	public InitTest() {}
}

public class StaticInit {
	public static void main(String[] args) {
		System.out.println(InitTest.cv1);	//�ν��Ͻ� ���� ���� cv ���
		System.out.println(InitTest.cv2);
//		System.out.println(InitTest.iv);	�ν��Ͻ� ���� ���� iv ��� �Ұ�
		
		InitTest it = new InitTest();
//		---- �ʱ�ȭ �� ����: field �ʱ�ȭ ----
		System.out.println(it.iv);
	}
}
