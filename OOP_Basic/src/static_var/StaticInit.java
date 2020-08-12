package static_var;

/*
	1) Set fields to default initial values (0, false, null)
	2) Call the constructor for the object (but don't execute the body of the constructor yet)
	3) Invoke the constructor of the superclass
 	4) ***Initialize fields using initializers and initialization blocks
	5) Execute the body of the constructor
 
 */

class  InitTest {
	static int cv1 = 10;
	static int cv2;
	
	//	Static Initialize Block
	static {
		//	스태틱 초기화 블럭에서는 인스턴스 멤버의 초기화가 불가능
		cv1 = 10;
		cv2 = cv1 + 10;
	}
	
	//	Field Initialize Block
	{
		//	생성자와 비슷한 역할
		//	객체 생성 후 iv가 heap에 올라가고 난 후 호출
		//	초기화에 조건 혹은 로직을 걸 수 있어	>>	if (iv > 10) { iv = 100; }
		System.out.println("Init Block!");
		iv = 3;
	}
	
	int iv = 1;
	
	public InitTest() {}
}

public class StaticInit {
	public static void main(String[] args) {
		System.out.println(InitTest.cv1);	//인스턴스 생성 없이 cv 사용
		System.out.println(InitTest.cv2);
//		System.out.println(InitTest.iv);	인스턴스 생성 없이 iv 사용 불가
		
		InitTest it = new InitTest();
//		---- 초기화 블럭 실행: field 초기화 ----
		System.out.println(it.iv);
	}
}
