package quiz.string;

import java.util.Scanner;

public class StringQuiz {
	private static char firstNo;

//	14자리 입력받았는지 확인
	private static boolean checkFourteen(String idNo) {
		return (idNo.length() == 14) ? true : false;
	}

//	입력받은 주민번호 전체 자리에서 '-' 뒤의 숫자만 분리하기
	private static String catchRearNo(String idNo) { // 123456-1234567
		String[] ret = idNo.split("-"); // [0]: 123456, [1]: '1234567'
		return ret[1]; //
	}

//	뒷 7자리 문자열 중 맨 처음 한 글자가 1 ~ 4인지 확인
	private static boolean isPossibleNo(String rearNo) {
		firstNo = rearNo.charAt(0);
		return (49 <= firstNo && firstNo <= 52) ? true : false; //49 50 51 52
	}

	// 홀수이면 남자 짝수면 여자
	private static void printIsFemale() {
		if (firstNo % 2 == 0) {
			System.out.println("여성 입니다");
		} else {
			System.out.println("남성 입니다");
		}
	}

	public static void main(String[] args) {
		String rearNo;

		System.out.println("주민번호 입력하기");
		String idNo = new Scanner(System.in).nextLine();
		boolean isFourteen = checkFourteen(idNo);
		if (isFourteen) {
			rearNo = catchRearNo(idNo);
			if (isPossibleNo(rearNo)) {
				printIsFemale();
			} else {
				System.out.println("주민번호 첫 자리 입력 오류");
			}
		} else {
			System.out.println("입력된 주민번호가 14자리가 아닙니다.");
			return;
		}
	}

}
