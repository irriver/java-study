package kr.or.bit.common;

import kr.or.bit.BodyInfo;
import kr.or.bit.Emp;
import kr.or.bit.FunctionTest;
import kr.or.bit.Person;
import kr.or.bit.Quiz;
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
		
		System.out.println("----------- �޼ҵ� ���� �׽�Ʈ -----------");
		
		FunctionTest ft = new FunctionTest();
		ft.callMethod();
		
		ft.callMethod2(99);
		
		int resultFromMethod3 = ft.callMethod3();
		System.out.println(resultFromMethod3);
		
		int resultFromMethod4 = ft.callMethod4(99);
		System.out.println(resultFromMethod4);
		
		int resultFromSum = ft.sum(10, 20, 30);
		System.out.println(resultFromSum);
		
//		ft.subSum();
		ft.callSubSum();
		
		int resultOfOpSum = ft.opSum(20);

		System.out.println("--------- Quiz: ū �� ��ȯ �޼ҵ� ---------");
		
		Quiz q = new Quiz();
		int maxValue = q.refindedMax(300, 100);
		System.out.println("�� �߿� ū ����: " + maxValue);
		
		Tv t2 = q.tvCall();
		System.out.println(t2);	//�ν��Ͻ��� '�ּҰ�'�� t2�� ���
		
		q.tvCall3(t2);
	}
}
