package exercise.basic;

public class PrintArray {

//	4) class PrintArray안에 main 메소드 생성 후 main 내부에서 출력
	public static void main(String[] args) {
		int n = 0;
		String str = "";
		
//	1) 길이가 10인 문자열 일차원 배열 arr 생성
		String[] arr = new String[10];

//	**(추가함)반복문 사용해서 배열의 각 요소에 값을 할당!
		char ch = 'A';
		for (n = 0; n < arr.length; n++) {
			arr[n] = str + ch;
			ch++;
		}
		
//	2) 배열 arr를 반복문 for를 사용해서 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//	3) 2)번의 내용을 while문을 사용해서 출력
		int k = 0;
		while (k < arr.length) {
			System.out.print(arr[k]);
			k++;
		}
	}
}
