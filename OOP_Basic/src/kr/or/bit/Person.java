package kr.or.bit;

/*
 *	설계도: 필드(고유, 상태 , 부품)
 *	속성 + 기능
 * 
 */
public class Person {
	public String name;
	public int age;
	public boolean power;
	
	//기본 생성자
	public Person(){}
	
	//매개변수를 받는 생성자
	public Person(String name, int age, boolean power) {
		//클래스의 iv를 초기화
		this.name = name;
		this.age = age;
		this.power = power;
	}
	
	
}
