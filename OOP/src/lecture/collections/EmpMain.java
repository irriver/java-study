package lecture.collections;

import java.util.ArrayList;
import java.util.List;

public class EmpMain {
	public static void main(String[] args) {
		Emp emp = new Emp(100, "John Doe", "HR");
		System.out.println(emp.toString());
		
		Emp[] empList = {new Emp(200, "Kim", "Account"), new Emp(200, "Lee", "Account"), new Emp(200, "Choi", "Account")};
		for (Emp e : empList) {
			System.out.println(e.toString());
		}
		
		ArrayList alist = new ArrayList();
		alist.add(new Emp(1, "McArthur", "General"));
		alist.add(new Emp(2, "Donald", "President"));
		alist.add(new Emp(3, "Trump", "Realtor"));
		
//		for (int i = 0; i < alist.size(); i++) {
//			Object obj = alist.get(i);
//			Emp e = (Emp) obj;
//			
//		}
		
		//다운케스팅 없이 사용 -> 제너릭(객체 생성 타입 강제)
		ArrayList<Emp> eList = new ArrayList<Emp>();
		eList.add(new Emp(999, "Generic", "Syntax"));
		System.out.println(eList.toString());
	}
}
