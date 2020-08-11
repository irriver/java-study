package kr.or.bit.common;

import kr.or.bit.BodyInfo;
import kr.or.bit.Emp;
import kr.or.bit.FunctionTest;
import kr.or.bit.Person;
import kr.or.bit.Quiz;
import kr.or.bit.Tv;

public class Main {
	public static void main(String[] args) {
		
//		선언: stack에 공간만 확보		>>	공간의 크기:4byte(주소 저장)
		Person person;
		
//		할당: 참조변수 'person'에 객체의 주소가 할당	>> main 함수 안의 local variable: 참조변수의 초기화는 null로!
		
//		참조변수가 메모리를 가지는 방법
//		1) new		>> person = new Person();
//		2) 주소값을 할당>> person = person2;
		person = null;
		person = new Person();
		
		person.name = "홍길동";
//		person.age = 99;		>>	인스턴스 변수를 초기화하지 않으면  정수 기본 값인 0이 출력
		person.power = true;
		
		Person person2 = new Person("최놀부", 100, false);
		
		person.printPerson();
		person2.printPerson();
		
		Person person3 = new Person();
		person3 = person2;
		
//		객체의 주소값 비교
		System.out.println(person == person2);	//false
		System.out.println(person2 == person3);	//true
		
		System.out.println("------------ Tv 객체 생성 ------------");
		
		Tv tv = new Tv();
		tv.brand = "Bit";
		tv.printInfo();
		
		tv.up_channel();
		tv.up_channel();
		tv.up_channel();
		tv.up_channel();
		tv.up_channel();
		
		tv.printInfo();
		
		System.out.println("------------ 사원 객체 생성 ------------");
		
		Emp emp = new Emp();
		emp.empNo = 7788;
		emp.empName = "김유신";
		emp.position = "IT";
//		*emp.bodyInfo.height = 190;
//		*emp.bodyInfo.weight = 40;	//이것 역시 클래스이므로 메모리에 올려야 함 	>> 객체 생성 필요
//		서로 다른 객체를 어떻게 연결할 수 있을까?
//		'할당'이 필요
		
//		class Emp의 멤버인 class BodyInfo 역시 인스턴스화가 필요
		BodyInfo bodyRef = new BodyInfo();
		bodyRef.height = 190;
		bodyRef.weight = 40;
		
		
//		서로 다른 객체를 연결!!!	>>	*참조변수 없이도 연결 가능
		emp.bodyInfo = bodyRef;
		
		System.out.println("----------- 메소드 생성 테스트 -----------");
		
		FunctionTest ft = new FunctionTest();
		ft.callMethod();
		
		ft.callMethod2(99);
		
		int resultFromMethod3 = ft.callMethod3();
		System.out.println(resultFromMethod3);
		
		int resultFromMethod4 = ft.callMethod4(99);
		System.out.println(resultFromMethod4);
		
		int resultFromSum = ft.sum(10, 20, 30);
		System.out.println(resultFromSum);
		
//		ft.subSum();
		ft.callSubSum();
		
		int resultOfOpSum = ft.opSum(20);

		System.out.println("--------- Quiz: 큰 값 반환 메소드 ---------");
		
		Quiz q = new Quiz();
		int maxValue = q.refindedMax(300, 100);
		System.out.println("둘 중에 큰 수는: " + maxValue);
		
		Tv t2 = q.tvCall();
		System.out.println(t2);	//인스턴스의 '주소값'이 t2에 담겨
		
		q.tvCall3(t2);
	}
}
