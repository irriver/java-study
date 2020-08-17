package quiz.array;

public class Lotto {
	
	static void printArr(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + "\t");
//		}
		for (int compo : arr) {
			System.out.print(compo + "\t");
		}
	}
	
	static void swap(int[]arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			//���� ���� 6���� ���� ����
			lotto[i] = (int) (Math.random() * 45 + 1);
			//�ߺ��Ǵ� ���� �ִ��� Ȯ��
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		//�迭 ����: ��������
		int size = lotto.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (lotto[i] > lotto[j]) {
					swap(lotto, i, j);
				}
			}
		}
		//�迭 ���
		printArr(lotto);
	}
}