/*
 	Primitive Types: 8가지의 기본 타입은 '값'을 저장
 	
 	숫자	>> 정수(음의 정수, 0,양의 정수)	>> byte(-128 ~ 127, 1byte = 8bit = 2^8(256가지))
 								>> char(문자 한 글자: 'A','가' 한글은 2byte )
 									>>> unicode, ascii code
 								>> short(c언어 호환성 2byte)
 								>> int(4byte)	*자바 기본
 								>> long(8byte)
 								
 		>> 실수(부동소수점)			>> float(4byte)
 								>> double(8byte) *자바 기본		>> 정밀도(표현범위)가 크다

	논리형 >> 참, 거짓				>> true, false
	
	문자열 >> "홍길동", "Hello"
	String name = "홍길동"	>> String은 class 타입(참조타입)
							>> (다음 얘기 하기 전까지) 문자열을 담는 타입이라고 생각하자
							
	Reference Types: '주소값'을 저장, 참조값을 저장
							>> class, Array 
 */

//클래스 == 설계도 == 타입(Type)	>>	'구체화'된 산물을 만들어야 해	>> 객체(메모리)에
class Car {
	//iv, 멤버 필드
	String color;
	int window;
}

public class DataTypes {
	public static void main(String[] args) {
		//lv(main method scope)
//		String str = "홍길동";
//		int age = 100;

		//타입  변수명(lv)
		Car c;
		//System.out.println(c); -> ERROR 지역변수는 사용 전에 '초기화' 해야하니까
		// c라는 변수의 초기화는 '주소 할당'	>> new 연산자를 통해서
		c = new Car();
		System.out.println(c);
		
		Car c2 = new Car();
		System.out.println(c2);
		
		int i = 10;
		int j;
		j = 20;
		
		int k;
		k = j; //값 할당
		System.out.println("k: " + k);
		k = 300;
		System.out.println("k: " + k);
		System.out.println("j: " + j);
		
		int p, g, q;
		//이런 경우라면 보통 Array를 씀
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		long l = 100000000000L; //정수 리터럴의 기본값이 int 범위 -> 롱타입이라고 알려줘야 해 + L, l
		//char 타입은 2byte 크기의 '정수값'을 저장하는 어떻게 문자를?	>>	
		char ch = 'A';
		System.out.println(ch);
		int intCh = 'A';	//암시적 형변환
		System.out.println(intCh);
	}
}
