import java.util.Scanner;

public class Print_format {
	public static void main(String[] args) {
		int num = 65;
		System.out.println("num���� " + num +"�Դϴ�.");
		
		//���� format
		System.out.printf("num ���� %d �Դϴ�\n", num);
		System.out.printf("num ���� %o �Դϴ�\n", num);
		System.out.printf("num ���� %x �Դϴ�\n", num);
//		System.out.printf("num ���� %f �Դϴ�\n", num);
		System.out.printf("num ���� %c �Դϴ�\n", num);
		
		//���� ����
		//	%d	>>	10����
		//	%f	>>	�Ǽ�
		//	%o	>>	8����
		//	%c	>>	����	, %s	>>	���ڿ�
		//
//		System.out.printf("num ���� [%d]�Դϴ�. �� ������ ���� ���� [%c]�Դϴ�.\n", num, num);
//		
//		float pi = 3.14f;
//		System.out.printf("pi ���� [%f]�Դϴ�. \n", pi);
//		
//		//Ÿ��(���赵)		�ܼ�â���� �Է��� ���� �о���̰ڴ�
//		System.out.println("���ڿ��� �Է��ϼ���");
//		Scanner sc =  new Scanner(System.in);
//		String value = sc.nextLine();
//		System.out.println("what you typed is : " + value);
//		
//		System.out.println("�������� �ϳ� �Է��غ����? : ");
//		int number = sc.nextInt();
//		System.out.println(number);
		
//		�������	
//		>> nextLine()���� �о������!	>>	�׷� '���ڰ�'���� �����ڳ�	>> ���� "111"�Է��ϸ� ���ڿ� "111"�� �Ѿ
//		[]���ڸ� ���ڷ� ��ȯ�� �� �ִ�!	>> ����, �Ǽ�
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine()); 
		System.out.println("������: " + number);
	}
}
