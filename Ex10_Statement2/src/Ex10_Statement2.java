import java.util.Scanner;

public class Ex10_Statement2 {
	public static void main(String[] args) {
		//while / do...while()
//		int i = 10;
//		while (i >= 10) {
//			i--;
//			System.out.println(i);
//		}
		
		//while�� ������
		int dan = 2;
		int su;
		while (dan <= 9) {
			su = 1; //su�� 10�� �Ǹ� �ٽ� 1�� �ʱ�ȭ�ؼ� ���
			while (su <= 9) {
				System.out.println(dan + "*" + su + "=" + dan * su);
				su++;
			}
			System.out.println();
			dan++;
		}
		
//		do { ���๮ } while (����)
//		�޴�
//		1. �λ�
//		2. ȸ��
//		�����ϼ���.
//		����� ���ϴ� ������ �����ϼ��� >> do {�����ϼ���..���� �޾Ƽ�}
		Scanner sc = new Scanner(System.in);
		int inputData = 0;
		do {
			System.out.println("0~9 ���ڸ� �Է�");
			inputData = Integer.parseInt(sc.nextLine());
		} while (inputData >= 10); //while ������ ���̸�, do�� ��� ������ -> ������ ������ ��, Ż��
		System.out.println("����� �Է��� ���ڴ� : " + inputData);
	}
	
}
