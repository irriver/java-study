package lecture.array;

public class Main {
	public static void main(String[] args) {
		
		//��ü �迭 ����
		Emp[] emp = new Emp[3];
		
		//��ü �Ҵ�
		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Emp();
		}

		String[] nameList = {"ȫ�浿", "������", "������"};
		
		//setter�� ��ü �Ӽ� �Ҵ�
		for (int i = 0; i < emp.length; i++) {
			emp[i].setEmpNo((i + 1) * 1000);
			emp[i].setEmpName(nameList[i]);
		}
		
		//��ü �Ӽ� ���
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].toString());
		}
	}
}
