package kr.or.bit;

/*
 	설계도: 필드(고유, 상태 , 부품)
 	속성 + 기능
  
 */
public class Person {
/*
 	member field	>> instance variable
 	초기화 하지 않아도 됨	>> default 값을 가짐 = 초기화: 변수가 처음 값을 할당받는 것 
  	생성되는 인스턴스마다 각자 다른 속성'을 가지기 때문에 초기화는 설계도 단계에서 불필요
  	
 */
	public String name;		//null
	public int age;			//0
	public boolean power;	//false
	
	//기본 생성자
	public Person(){}
	
	//매개변수를 받는 생성자
	public Person(String name, int age, boolean power) {
		//클래스의 iv를 초기화
		this.name = name;
		this.age = age;
		this.power = power;
	}
	
	//기능, 행위, 메소드
	public void printPerson() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Power: " + power);
	}
}
