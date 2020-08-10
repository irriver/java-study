/*
 	Primitive Types: 8������ �⺻ Ÿ���� '��'�� ����
 	
 	����	>> ����(���� ����, 0,���� ����)	>> byte(-128 ~ 127, 1byte = 8bit = 2^8(256����))
 								>> char(���� �� ����: 'A','��' �ѱ��� 2byte )
 									>>> unicode, ascii code
 								>> short(c��� ȣȯ�� 2byte)
 								>> int(4byte)	*�ڹ� �⺻
 								>> long(8byte)
 								
 		>> �Ǽ�(�ε��Ҽ���)			>> float(4byte)
 								>> double(8byte) *�ڹ� �⺻		>> ���е�(ǥ������)�� ũ��

	���� >> ��, ����				>> true, false
	
	���ڿ� >> "ȫ�浿", "Hello"
	String name = "ȫ�浿"	>> String�� class Ÿ��(����Ÿ��)
							>> (���� ��� �ϱ� ������) ���ڿ��� ��� Ÿ���̶�� ��������
							
	Reference Types: '�ּҰ�'�� ����, �������� ����
							>> class, Array 
 */

//Ŭ���� == ���赵 == Ÿ��(Type)	>>	'��üȭ'�� �깰�� ������ ��	>> ��ü(�޸�)��
class Car {
	//iv, ��� �ʵ�
	String color;
	int window;
}

public class DataTypes {
	public static void main(String[] args) {
		//lv(main method scope)
//		String str = "ȫ�浿";
//		int age = 100;

		//Ÿ��  ������(lv)
		Car c;
		//System.out.println(c); -> ERROR ���������� ��� ���� '�ʱ�ȭ' �ؾ��ϴϱ�
		// c��� ������ �ʱ�ȭ�� '�ּ� �Ҵ�'	>> new �����ڸ� ���ؼ�
		c = new Car();
		System.out.println(c);
		
		Car c2 = new Car();
		System.out.println(c2);
		
		int i = 10;
		int j;
		j = 20;
		
		int k;
		k = j; //�� �Ҵ�
		System.out.println("k: " + k);
		k = 300;
		System.out.println("k: " + k);
		System.out.println("j: " + j);
		
		int p, g, q;
		//�̷� ����� ���� Array�� ��
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		long l = 100000000000L; //���� ���ͷ��� �⺻���� int ���� -> ��Ÿ���̶�� �˷���� �� + L, l
		//char Ÿ���� 2byte ũ���� '������'�� �����ϴ� ��� ���ڸ�?	>>	
		char ch = 'A';
		System.out.println(ch);
		int intCh = 'A';	//�Ͻ��� ����ȯ
		System.out.println(intCh);
	}
}
