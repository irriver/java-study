import co.maraq.first.Emp;

public class Ex01 {
	public static void main(String[] args) {
		//설계도를 바탕으로 '집'을 짓는 행위
		Emp emp = new Emp();
		emp.job = "Manager";
		emp.setEmpno(999);
		
		int data = emp.getEmpno();
		System.out.println("empNo is " + data);
	}
	
	
}
