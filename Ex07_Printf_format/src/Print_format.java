import java.util.Scanner;

public class Print_format {
	public static void main(String[] args) {
		int num = 65;
		System.out.println("num값은 " + num +"입니다.");
		
		//형식 format
		System.out.printf("num 값은 %d 입니다\n", num);
		System.out.printf("num 값은 %o 입니다\n", num);
		System.out.printf("num 값은 %x 입니다\n", num);
//		System.out.printf("num 값은 %f 입니다\n", num);
		System.out.printf("num 값은 %c 입니다\n", num);
		
		//형식 문자
		//	%d	>>	10진수
		//	%f	>>	실수
		//	%o	>>	8진수
		//	%c	>>	문자	, %s	>>	문자열
		//
//		System.out.printf("num 값은 [%d]입니다. 이 정수의 문자 값은 [%c]입니다.\n", num, num);
//		
//		float pi = 3.14f;
//		System.out.printf("pi 값은 [%f]입니다. \n", pi);
//		
//		//타입(설계도)		콘솔창에서 입력한 값을 읽어들이겠다
//		System.out.println("문자열을 입력하세요");
//		Scanner sc =  new Scanner(System.in);
//		String value = sc.nextLine();
//		System.out.println("what you typed is : " + value);
//		
//		System.out.println("정수값을 하나 입력해볼까요? : ");
//		int number = sc.nextInt();
//		System.out.println(number);
		
//		권장사항	
//		>> nextLine()으로 읽어들이자!	>>	그럼 '문자값'으로 읽히겠네	>> 만약 "111"입력하면 문자열 "111"로 넘어가
//		[]문자를 숫자로 변환할 수 있다!	>> 정수, 실수
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine()); 
		System.out.println("정수값: " + number);
	}
}
