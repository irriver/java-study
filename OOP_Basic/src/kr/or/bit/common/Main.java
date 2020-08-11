package kr.or.bit.common;

import kr.or.bit.BodyInfo;
import kr.or.bit.Emp;
import kr.or.bit.Person;
import kr.or.bit.Tv;

public class Main {
	public static void main(String[] args) {
		
//		����: stack�� ������ Ȯ��		>>	������ ũ��:4byte(�ּ� ����)
		Person person;
		
//		�Ҵ�: �������� 'person'�� ��ü�� �ּҰ� �Ҵ�	>> main �Լ� ���� local variable: ���������� �ʱ�ȭ�� null��!
		
//		���������� �޸𸮸� ������ ���
//		1) new		>> person = new Person();
//		2) �ּҰ��� �Ҵ�>> person = person2;
		person = null;
		person = new Person();
		
		person.name = "ȫ�浿";
//		person.age = 99;		>>	�ν��Ͻ� ������ �ʱ�ȭ���� ������  ���� �⺻ ���� 0�� ���
		person.power = true;
		
		Person person2 = new Person("�ֳ��", 100, false);
		
		person.printPerson();
		person2.printPerson();
		
		Person person3 = new Person();
		person3 = person2;
		
//		��ü�� �ּҰ� ��
		System.out.println(person == person2);	//false
		System.out.println(person2 == person3);	//true
		
		System.out.println("------------ Tv ��ü ���� ------------");
		
		Tv tv = new Tv();
		tv.brand = "Bit";
		tv.printInfo();
		
		tv.up_channel();
		tv.up_channel();
		tv.up_channel();
		tv.up_channel();
		tv.up_channel();
		
		tv.printInfo();
		
		System.out.println("------------ ��� ��ü ���� ------------");
		
		Emp emp = new Emp();
		emp.empNo = 7788;
		emp.empName = "������";
		emp.position = "IT";
//		*emp.bodyInfo.height = 190;
//		*emp.bodyInfo.weight = 40;	//�̰� ���� Ŭ�����̹Ƿ� �޸𸮿� �÷��� �� 	>> ��ü ���� �ʿ�
//		���� �ٸ� ��ü�� ��� ������ �� ������?
//		'�Ҵ�'�� �ʿ�
		
//		class Emp�� ����� class BodyInfo ���� �ν��Ͻ�ȭ�� �ʿ�
		BodyInfo bodyRef = new BodyInfo();
		bodyRef.height = 190;
		bodyRef.weight = 40;
		
		
//		���� �ٸ� ��ü�� ����!!!	>>	*�������� ���̵� ���� ����
		emp.bodyInfo = bodyRef;
	}
}
