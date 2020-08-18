package quiz.array;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

//	------------------ Field ----------------------

//	public int[] numbers = new int[6];	-> 개선의 여지
	private int[] numbers; // 배열 생성
	private Scanner userInput;

	// 초기화 코드는 '생성자' 안으로 들어가는 것이 좋아
	public Lotto(int num) {
		this.numbers = new int[num]; // 배열 초기화
		this.userInput = new Scanner(System.in);
	}

//	------------------ Function ----------------------

	// 로또 번호 선택
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
			case "2": // 프로그램 종료
				System.out.println("프로그램 종료!");
				break loop_1; // break가 while을 벗어나 loop_1로 탈출
			default:
				System.out.println("선택 오류");
				break;
			}
		}
	}

	// 메뉴 보여주기
	private String showMenu() {
		System.out.println("---------------");
		System.out.println("\t" + "1) 당첨번호 추출" + "\t");
		System.out.println("\t" + "2) 프로그램 종료" + "\t");
		System.out.println("---------------");
		System.out.println("\t" + "원하는 프로세스 선택");
		String ret = userInput.nextLine();
		return ret;
	}
	
	//중복없는 6자리 수 만들기
	private void makeLotto() {
		for (int i = 0; i < 6; i++) {
			// 랜덤 수로 6개의 숫자 추출
			numbers[i] = (int) (Math.random() * 45 + 1);
			// 중복되는 수가 있는지 확인
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
		}
	}

	//오름차순 정렬
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
	
	// 배열 출력
	private void printArr(int[] arrs) {
		for (int arr : arrs) {
			System.out.print(arr + "\t");
		}
		System.out.println();
	}

	// 배열의 요소 스왑
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	//번호 합의 평균 범위 .. 아니면 재추출
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