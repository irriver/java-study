package lecture.array;

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void printPerson() {
		System.out.printf("Name: %s, Age: %d\n", this.name, this.age);
	}
}
/*
 * 기본형 배열은 각 원소에 default value가 들어감 참조형 배열은 각 원소에 배열의 '주소'가 담긴다
 * 
 * 
 */

public class ObjArrays {
	public static void main(String[] args) {

//	기본형 배열
		int[] intArr = new int[10];
		boolean[] boolArr = new boolean[10];

//	객체 배열
//	1) 객체의 주소값을 담을 배열 생성
		Person[] objArr = new Person[5];

//	2) 객체 배열에 객체 할당
		for (int i = 0; i < objArr.length; i++) {
			objArr[i] = new Person(65 + " ", i);
			System.out.printf("objArr[%d] Addr>> %s\n", i, objArr[i]);
		}
	}
}
