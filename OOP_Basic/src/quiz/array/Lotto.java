package quiz.array;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

//	------------------ Field ----------------------

//	public int[] numbers = new int[6];	-> ������ ����
	private int[] numbers; // �迭 ����
	private Scanner userInput;

	// �ʱ�ȭ �ڵ�� '������' ������ ���� ���� ����
	public Lotto(int num) {
		this.numbers = new int[num]; // �迭 �ʱ�ȭ
		this.userInput = new Scanner(System.in);
	}

//	------------------ Function ----------------------

	// �ζ� ��ȣ ����
	public void selectLotto() {
		loop_1: while (true) {
			String selectNum = showMenu();
			switch (selectNum) {
			case "1": 
				do {
					makeLotto();
					int[] sortedNums = sorting(numbers);
					printArr(sortedNums);
				} while (checkAvg());
				break;
			case "2": // ���α׷� ����
				System.out.println("���α׷� ����!");
				break loop_1; // break�� while�� ��� loop_1�� Ż��
			default:
				System.out.println("���� ����");
				break;
			}
		}
	}

	// �޴� �����ֱ�
	private String showMenu() {
		System.out.println("---------------");
		System.out.println("\t" + "1) ��÷��ȣ ����" + "\t");
		System.out.println("\t" + "2) ���α׷� ����" + "\t");
		System.out.println("---------------");
		System.out.println("\t" + "���ϴ� ���μ��� ����");
		String ret = userInput.nextLine();
		return ret;
	}
	
	//�ߺ����� 6�ڸ� �� �����
	private void makeLotto() {
		for (int i = 0; i < 6; i++) {
			// ���� ���� 6���� ���� ����
			numbers[i] = (int) (Math.random() * 45 + 1);
			// �ߺ��Ǵ� ���� �ִ��� Ȯ��
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
		}
	}

	//�������� ����
	private int[] sorting(int[] arr) {
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		return arr;
	}
	
	// �迭 ���
	private void printArr(int[] arrs) {
		for (int arr : arrs) {
			System.out.print(arr + "\t");
		}
		System.out.println();
	}

	// �迭�� ��� ����
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	//��ȣ ���� ��� ���� .. �ƴϸ� ������
	private boolean checkAvg() {
		int sum = 0;
		int avg = 0;
		for (int num: numbers) {
			sum += num;
		}
		avg = sum / numbers.length;
		System.out.println("Average: " + avg);
		System.out.println("---------------");
		return (15 <= avg && avg <= 35);
	}
}