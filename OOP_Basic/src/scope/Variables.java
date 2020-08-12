package scope;

/*
 	Instance Variable			>>	객체 생성 시에 사용가능
 									'new 연산자'로 heap memory에 Instance가 생성 되면 그 안에 iv가 만들어짐.
									member field의 목적: 고유 정보, 상태 정보, 부품 정보(Reference Type)를 담기 위해.
									생성되는 '객체마다' 다른 값을 가짐	-> 그래서 초기화하지 않음 -> default 값을 가지게 됨.
									
 	Local Variable				>>	메소드 내부의 변수. 사용 전에 반드시 '초기화'
 									main 메소드 안의 변수는 모두 lv -> method area 안에 존재
 									Life Cycle: 메소드 호출 시 stack에 생성 -> 메소드 종료 시 소멸
 										>>>	메소드 블록 안의 변수
 											fot (int i; ...) -> fot loop 시작 ~ 종료
 									
 	Static Variable(Class V)	>>	스태틱 변수(heap에 생성된 객체 간 공유 자원), 클래스 변수
 									객체 생성 이전에 메모리에 올라가는 자원. class area(method area) 안에 존재
 									
 									.class 실행 시 클래스의 메타데이터가 로딩	-> 'static'이라는 정보를 만나면 heap과 stack에 올리기 전에 미리 정보를 할당!
 																	-> new 로 객체 생성 하지 않아도 static 정보가 올라감
 									접근: [클래스명].[클래스 변수명] -> Variables.cv -> 객체 생성 전에 접근 가능
 									
 									*** 같은 클래스의 다른 객체도 같은 cv를 사용하게 됨
 */
public class Variables {
	int iv;
	
	static int cv;
	
	void method() {
		int lv = 0;
	}
	
	public static void main(String[] args) {
		Variables.cv = 100;
		
		Variables v1 = new Variables();
		System.out.println(v1.cv);		//100
		
		Variables v2 = new Variables();
		System.out.println(v2.cv);		//100
		
		v2.cv = 500;					//v1, v2가 공유하는 cv의 값을 500으로 재할당
		
		System.out.println(Variables.cv);
	}
}
