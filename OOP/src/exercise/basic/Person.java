package exercise.basic;

public class Person {
//	���ڿ� Ÿ�� ���� name
	String name;
//	���� Ÿ�� ���� age
	int age;
//	���� Ÿ�� ���� hasCat
	boolean hasCat;
//	������ �迭 Ÿ�� ���� phoneNums (��ȣ �� 4�ڸ��� ����)
	int[] phoneNums;
	
	//Ŭ���� Person�� �����ڸ� ���� '����ʵ�' �ʱ�ȭ
	public Person() {
		this.name = "Jane";
		this.hasCat = true;
		phoneNums = new int[] {1, 2, 3, 4};
		
		this.phoneNums[0] = 1;
		this.phoneNums[1] = 2;
		this.phoneNums[2] = 3;
		this.phoneNums[3] = 4;
	}
	
//	1) �޼ҵ��: printName
//		class Person�� ������ name�� println���� ���
//		�Ű����� ����. ��ȯ�� ����
	void printName() {
		System.out.println(this.name);
	}
	
//	2) �޼ҵ��: calculateBirthYear
//		age�� �޾Ƽ� ����⵵�� ���
//		�Ű����� age. ��ȯ�� ������ ������
	int calculateBirthYear(int age) {
		int birthyear = 2020 - this.age - 1;
		return birthyear;
	}
	
//	3) �޼ҵ�� printHasCat
//		class Person�� ����̸� ������ �ִ� Ȯ���ϴ� �Լ�.
//		�Ű����� ����. ��ȯ�� ���� ������
	boolean printHasCat() {
		return hasCat;
	}
	
//	4) *�޼ҵ�� addAllNums
//		phoneNums�� ��� ���� ���ؼ� ��ȯ.
//	 	�Ű����� phoneNums. ��ȯ�� ������ ������
	
	int addAllNums(int[] phoneNums) {
		int sum = 0;
		for (int i = 0; i < phoneNums.length; i++) {
			sum += phoneNums[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Person person = new Person();
		
		person.printName();
		System.out.println(person.calculateBirthYear(100));
		person.printHasCat();
	}

}
