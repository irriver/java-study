package co.maraq.control;

import co.maraq.classes.Person;

/*
Ŭ������ ����
	LIB: class Test {���� �Լ��� ����}	>>	�������� ������ �Ұ��� = �ٸ� Ŭ������ �����ϴ� Ŭ����
	class Test {
		public static void main(String[] args){}	>>	���డ���� Ŭ����
	}
	static void main()	>> ���α׷��� ������, ������
Tip)
	C#: static void Main(){}
  
����
	�����ͳ� �ڷḦ ���� �� �ִ� ������ �̸�
	������ �������� 'ũ��'�� �־�� ��	>>	type(�ڷ���)
	
	  
*/

public class Control {
	
	public static void main(String[] args) {
		Person p = new Person("Charlie", 15);
		System.out.println(p.pName + p.age);
		p.run(500);
		p.print();
		System.out.println("class Person�� ��ü p�� �ּ� " + p);
	}
}
