package kr.or.bit;

/*
 	���赵: �ʵ�(����, ���� , ��ǰ)
 	�Ӽ� + ���
  
 */
public class Person {
/*
 	member field	>> instance variable
 	�ʱ�ȭ ���� �ʾƵ� ��	>> default ���� ���� = �ʱ�ȭ: ������ ó�� ���� �Ҵ�޴� �� 
  	�����Ǵ� �ν��Ͻ����� ���� �ٸ� �Ӽ�'�� ������ ������ �ʱ�ȭ�� ���赵 �ܰ迡�� ���ʿ�
  	
 */
	public String name;		//null
	public int age;			//0
	public boolean power;	//false
	
	//�⺻ ������
	public Person(){}
	
	//�Ű������� �޴� ������
	public Person(String name, int age, boolean power) {
		//Ŭ������ iv�� �ʱ�ȭ
		this.name = name;
		this.age = age;
		this.power = power;
	}
	
	//���, ����, �޼ҵ�
	public void printPerson() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Power: " + power);
	}
}
