package exercise.basic;

public class PrintArray {

//	4) class PrintArray�ȿ� main �޼ҵ� ���� �� main ���ο��� ���
	public static void main(String[] args) {
		int n = 0;
		String str = "";
		
//	1) ���̰� 10�� ���ڿ� ������ �迭 arr ����
		String[] arr = new String[10];

//	**(�߰���)�ݺ��� ����ؼ� �迭�� �� ��ҿ� ���� �Ҵ�!
		char ch = 'A';
		for (n = 0; n < arr.length; n++) {
			arr[n] = str + ch;
			ch++;
		}
		
//	2) �迭 arr�� �ݺ��� for�� ����ؼ� ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//	3) 2)���� ������ while���� ����ؼ� ���
		int k = 0;
		while (k < arr.length) {
			System.out.print(arr[k]);
			k++;
		}
	}
}
