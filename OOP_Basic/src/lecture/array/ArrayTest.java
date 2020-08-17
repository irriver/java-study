package lecture.array;

import java.util.Arrays;
/*
 		�迭��  ��ü -> new �� ���� ���� -> heap memory�� �ö�
 		���� �迭 == ���� �迭 -> �迭�� ũ��� �ѹ� �������� ���� �Ұ�
 		�ڷᱸ��: ������ ����, �˻��� �⺻
		int s1, s2, s3�� ���� �ڷ����� ���ٸ� -> �迭 ���
 
 */

public class ArrayTest {
	public static void main(String[] args) {

		int[] scores = new int[10];
//		scores[0] = 100;
//		scores[1] = 95;
//		scores[2] = 80;

//		�迭�� �ʱ�ȭ
		for (int idx = 0; idx < scores.length; idx++) {
			scores[idx] = idx + 1;
		}
		
		for (int idx = 0; idx < scores.length; idx++) {
			System.out.printf("scores[%d]: %d\n", idx, scores[idx]);
		}
		String toStringTest = Arrays.toString(scores);
		System.out.println("toString in Array Class: " + toStringTest);
		
		int[] arr2 = new int[] {11, 22, 33};
		int[] arr3 = {111, 222, 333};
		
		//arr3 ��ü ���
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		//�迭�� ����� �Ҵ��� �и�
		int[] arr4;
		arr4 = new int[] {100, 200, 300};
		System.out.println("�迭�� ��ü�� �ּҰ��� ���´�:" + arr4);
		
		//�ּҰ� �Ѱ��ֱ�
		int[] arr5 = arr4;
		System.out.printf("�迭 ��ü�� �ּҰ� ��: %b", arr4 == arr5);
		
		//���ڿ� �迭
		String[] str = new String[] {"abc", "def"};

		//���� �迭
		char[] ch = new char[] {'A', 'B', 'C'};
		
	}
}
