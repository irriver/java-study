package exercise.basic;

public class Person {
//	문자열 타입 변수 name
	String name;
//	정수 타입 변수 age
	int age;
//	논리형 타입 변수 hasCat
	boolean hasCat;
//	정수형 배열 타입 변수 phoneNums (번호 끝 4자리를 받음)
	int[] phoneNums;
	
	//클래스 Person의 생성자를 만들어서 '멤버필드' 초기화
	public Person() {
		this.name = "Jane";
		this.hasCat = true;
		phoneNums = new int[] {1, 2, 3, 4};
		
		this.phoneNums[0] = 1;
		this.phoneNums[1] = 2;
		this.phoneNums[2] = 3;
		this.phoneNums[3] = 4;
	}
	
//	1) 메소드명: printName
//		class Person의 데이터 name을 println으로 출력
//		매개변수 없음. 반환값 없음
	void printName() {
		System.out.println(this.name);
	}
	
//	2) 메소드명: calculateBirthYear
//		age를 받아서 출생년도를 계산
//		매개변수 age. 반환값 정수형 데이터
	int calculateBirthYear(int age) {
		int birthyear = 2020 - this.age - 1;
		return birthyear;
	}
	
//	3) 메소드명 printHasCat
//		class Person이 고양이를 가지고 있는 확인하는 함수.
//		매개변수 없음. 반환값 논리형 데이터
	boolean printHasCat() {
		return hasCat;
	}
	
//	4) *메소드명 addAllNums
//		phoneNums의 모든 수를 더해서 반환.
//	 	매개변수 phoneNums. 반환값 정수형 데이터
	
	int addAllNums(int[] phoneNums) {
		int sum = 0;
		for (int i = 0; i < phoneNums.length; i++) {
			sum += phoneNums[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Person person = new Person();
		
		person.printName();
		System.out.println(person.calculateBirthYear(100));
		person.printHasCat();
	}

}
