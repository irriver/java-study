package lecture.static_members;

/*
 	자주 사용하는 메소드는 static으로 만들어	>>	class Math의 random() 메소드는 자주 사용하니까
 	new Constructor() 없이 사용 가능
 */

public class StaticResource {
	int iv;
	static int sv;	//	가독성을 위해 StaticClass.sv 로 사용하는게 좋겠지
	
	void im() {
		//can use sv, iv
	}
	
	static void sm() {
		//can use sv, not iv
	}
	
	public static void main(String[] args) {
		
		//	객체 생성 없이 사용 가능한 static 자원들
		StaticResource.sm();
		System.out.println(StaticResource.sv);
		
		//	인스턴스 생성 후 사용 가능한 instance 자원들
		StaticResource sm = new StaticResource();
		sm.im();
		System.out.println(sm.iv);
	}
}
