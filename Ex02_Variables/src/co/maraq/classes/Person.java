package co.maraq.classes;

public class Person {
	/*
	 	������ ����Ǵ� ��ġ�� ���� �ٸ� (scope: ��ȿ����)
	 	
	 	1. Instance Variable >> �Լ� �ƴ� ���赵 ��, �ʱ�ȭ ���ص� ���������� �⺻���� ����(default value: 0)
	 	2. Local Variable >> �Լ� �ȿ�
	 	3. Static Variable >> ��ü �� �����ڿ�
	 */
	//�ν��Ͻ� ������ '�ʱ�ȭ' ���� �ʴ� ���� >> ��ü���� '�ٸ� ��'�� ����������
	public String pName;
	public int age;
	
	//������ �Լ�: ��ü�� ������ �� �ڵ����� ȣ��Ǵ� �Լ� = '��ü ������ ���ÿ�'
	public Person() {
		System.out.println("��ü Person�� �����Ǿ� '������'�� ȣ���մϴ�.");
	}
	
	public Person(String pName, int age) {
		System.out.println("��ü Person�� �����Ǿ� '������'�� ȣ���մϴ�.");
		System.out.println("��ü�� iv�� �޾� ������ �ʱ�ȭ �մϴ�.");
		this.pName = pName;
		this.age = age;
	}
	
	//�Լ�: ���, ����
	public String eat() {
		// lv >> method eat()�� ȣ��Ǹ� �����ǰ�, ����Ǹ� �޸𸮿��� �������
		// ���ú����� '��� ����' �޼ҵ� ������ �ݵ�� '�ʱ�ȭ'�� �ʿ�
		String food = "Buritto";
		return food;
	}
	
	public void print() {
		System.out.println("���� �� �Ծ��ĸ� " + eat());
	}
	
	public void run(int speed) {
		System.out.println(pName + "��(��)" + speed + "�ӵ��� �޸��ϴ�.");
	}
}