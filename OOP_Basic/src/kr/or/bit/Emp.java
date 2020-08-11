package kr.or.bit;

public class Emp {
	public int empNo;
	public String empName;
	public String position;
	public int empSalary;
//	*public int[] bodyInfo;	[타입]신체정보: 키, 몸무게	>> 필드는 쪼갤 수 없는 멤버 -> 다른 설계도가 필요해
	
//	아래와 같이 사용자가 정의한 타입[클래스]로 키, 몸무게를 담는 신체정보를 정의 = 클래스도 멤버 필드가 된다	>> Instance Variable
//	Reference Type의 default value -> null
	public BodyInfo bodyInfo;
}
