package quiz.money;

import java.util.Scanner;

public class MoneyUnit {
	int unit = 10000;
	int num = 0;
	static boolean switched;
	static int money;

	public static void main(String[] args) {
		
		Scanner inputMoney = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ��� >> ");
		 money = inputMoney.nextInt();
		 
		 System.out.println("�Էµ� �ݾ��� " + money + "�Դϴ�.");
	 
//		 �Է¹��� �ݾ��� ���� ������ ������ ȭ�� �ż� ���
//		 
//		 {
		 
//		 �� = 547500�� -> 10000�� * 54, 5000�� * 1, 1000�� * 2, 500�� * 1
		 
//			 ȭ�� ������ �ż� ���
//			 	����, ������ 1�� �ʰ���, 
//			 		�Է¹��� �ݾ׿��� ���� ������ �ݾ��� ����
//			 	****������ 1�� ���ϸ� ���� == ���� �ݾ��� �ּ� ������ while ����
//			 	
//			 	����, ����ġ false��
//			 		ȭ�� ���� 5000(10000 / 2)���� ���Ҵ�
//			 		����ġ true�� �ٲ�
//			 	ȭ�� ���� 1000(5000 / 2)���� ���Ҵ�
//			 	����ġ false�� �ٲ�
//		 }

		}

}
