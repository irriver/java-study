package lecture.generic;

import java.util.ArrayList;
import java.util.List;

class CopyEmp {
	private int no;
	private String name;
	private String job;
	public CopyEmp(int no, String name, String job) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "CopyEmp [no=" + no + ", name=" + name + ", job=" + job + "]";
	}
}

public class GenEx {
	public static void main(String[] args) {
		
		List<CopyEmp> clist = new ArrayList<CopyEmp>();
		clist.add(new CopyEmp(100, "kim", "HR"));
		clist.add(new CopyEmp(200, "lee", "IT"));
		clist.add(new CopyEmp(300, "park", "AC"));
		
		
//		1) 200�� ����� �޿��� 5000���� �����ϰԿ� �Ϲ� for ��� getter, setter
			if (clist.get(1).getNo() == 200) {
				clist.get(1).setJob("5000");
			}
			for (CopyEmp emp : clist) {
				System.out.println(emp);
			}
//		2) 300�� ����� �̸��� "�ñ���"�� �����ؼ� ��� forEach ���
	}
}
