package quiz.string;

import java.util.Scanner;

public class StringQuiz {
	private static char firstNo;

//	14�ڸ� �Է¹޾Ҵ��� Ȯ��
	private static boolean checkFourteen(String idNo) {
		return (idNo.length() == 14) ? true : false;
	}

//	�Է¹��� �ֹι�ȣ ��ü �ڸ����� '-' ���� ���ڸ� �и��ϱ�
	private static String catchRearNo(String idNo) { // 123456-1234567
		String[] ret = idNo.split("-"); // [0]: 123456, [1]: '1234567'
		return ret[1]; //
	}

//	�� 7�ڸ� ���ڿ� �� �� ó�� �� ���ڰ� 1 ~ 4���� Ȯ��
	private static boolean isPossibleNo(String rearNo) {
		firstNo = rearNo.charAt(0);
		return (49 <= firstNo && firstNo <= 52) ? true : false; //49 50 51 52
	}

	// Ȧ���̸� ���� ¦���� ����
	private static void printIsFemale() {
		if (firstNo % 2 == 0) {
			System.out.println("���� �Դϴ�");
		} else {
			System.out.println("���� �Դϴ�");
		}
	}

	public static void main(String[] args) {
		String rearNo;

		System.out.println("�ֹι�ȣ �Է��ϱ�");
		String idNo = new Scanner(System.in).nextLine();
		boolean isFourteen = checkFourteen(idNo);
		if (isFourteen) {
			rearNo = catchRearNo(idNo);
			if (isPossibleNo(rearNo)) {
				printIsFemale();
			} else {
				System.out.println("�ֹι�ȣ ù �ڸ� �Է� ����");
			}
		} else {
			System.out.println("�Էµ� �ֹι�ȣ�� 14�ڸ��� �ƴմϴ�.");
			return;
		}
	}

}
