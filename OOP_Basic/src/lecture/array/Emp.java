package lecture.array;

public class Emp {
	private int empNo;
	private String empName;
	
	Emp() {}
	
	public Emp(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	void printInfo() {
		System.out.println("사번: " + empNo + "이름: " + empName);
	}

	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empName=" + empName + "]";
	}
}
