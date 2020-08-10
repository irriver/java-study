package co.maraq.first;

/*
 * 	Date	20-08-04
 * 	Author	Ram
 *	'사원'이라는 설계도
 *	사원의 정보를 담고 출력하는 목적
 *	부품 정보, 기능 정보는 포함되어야 설계도
 *	사번, 이름, 부서명, 직책, 입사일
 */
public class Emp {
	//속성, 변수: 정보를 담을 수 있는 데이터
	private int		empno;
	private String	ename;
	public	String	job;
	
	//기능: private인 empno을 보호하면서 값을 할당
	//간접 할당 method >> setter >> write
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	//method >> getter >> read
	public int getEmpno() {
		return this.empno;
	}
	
	public void setEmpname(String ename) {
		this.ename = ename;
	}
	
}
