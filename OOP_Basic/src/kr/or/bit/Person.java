package kr.or.bit;

/*
 *	���赵: �ʵ�(����, ���� , ��ǰ)
 *	�Ӽ� + ���
 * 
 */
public class Person {
	public String name;
	public int age;
	public boolean power;
	
	//�⺻ ������
	public Person(){}
	
	//�Ű������� �޴� ������
	public Person(String name, int age, boolean power) {
		//Ŭ������ iv�� �ʱ�ȭ
		this.name = name;
		this.age = age;
		this.power = power;
	}
	
	
}
