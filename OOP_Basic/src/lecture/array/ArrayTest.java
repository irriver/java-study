package lecture.array;

import java.util.Arrays;
/*
 		배열은  객체 -> new 를 통해 생성 -> heap memory에 올라감
 		고정 배열 == 정적 배열 -> 배열의 크기는 한번 정해지면 변경 불가
 		자료구조: 데이터 정렬, 검색의 기본
		int s1, s2, s3와 같이 자료형이 같다면 -> 배열 사용
 
 */

public class ArrayTest {
	public static void main(String[] args) {

		int[] scores = new int[10];
//		scores[0] = 100;
//		scores[1] = 95;
//		scores[2] = 80;

//		배열의 초기화
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
		
		//arr3 전체 출력
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		//배열의 선언과 할당을 분리
		int[] arr4;
		arr4 = new int[] {100, 200, 300};
		System.out.println("배열은 객체라 주소값을 갖는다:" + arr4);
		
		//주소값 넘겨주기
		int[] arr5 = arr4;
		System.out.printf("배열 객체의 주소값 비교: %b", arr4 == arr5);
		
		//문자열 배열
		String[] str = new String[] {"abc", "def"};

		//문자 배열
		char[] ch = new char[] {'A', 'B', 'C'};
		
	}
}
