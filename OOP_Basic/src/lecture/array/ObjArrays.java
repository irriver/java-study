package lecture.array;

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void printPerson() {
		System.out.printf("Name: %s, Age: %d\n", this.name, this.age);
	}
}
/*
 * �⺻�� �迭�� �� ���ҿ� default value�� �� ������ �迭�� �� ���ҿ� �迭�� '�ּ�'�� ����
 * 
 * 
 */

public class ObjArrays {
	public static void main(String[] args) {

//	�⺻�� �迭
		int[] intArr = new int[10];
		boolean[] boolArr = new boolean[10];

//	��ü �迭
//	1) ��ü�� �ּҰ��� ���� �迭 ����
		Person[] objArr = new Person[5];

//	2) ��ü �迭�� ��ü �Ҵ�
		for (int i = 0; i < objArr.length; i++) {
			objArr[i] = new Person(65 + " ", i);
			System.out.printf("objArr[%d] Addr>> %s\n", i, objArr[i]);
		}
	}
}
